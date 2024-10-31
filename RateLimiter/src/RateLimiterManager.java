import java.util.HashMap;
import java.util.Map;

public class RateLimiterManager {

    private static RateLimiterManager rateLimiterManagerInstance;

    Map<String, RateLimiter> serviceToRateLimiter;

    private RateLimiterManager() {
        this.serviceToRateLimiter = new HashMap<>();
    }

    public static RateLimiterManager getInstance() {
        if (rateLimiterManagerInstance == null) {
            synchronized (RateLimiterManager.class) {
                if (rateLimiterManagerInstance == null) {
                    rateLimiterManagerInstance = new RateLimiterManager();
                }
            }
        }
        return rateLimiterManagerInstance;
    }

    public void registerRateLimiterToService(String serviceName, RateLimiterConfiguration rateLimiterConfiguration) {
        RateLimiter rateLimiter = RateLimiterFactory.getRateLimiter(rateLimiterConfiguration);
        this.serviceToRateLimiter.putIfAbsent(serviceName, rateLimiter);
    }

    public void changeRateLimiterForService(String serviceName, RateLimiter rateLimiter) {
        this.serviceToRateLimiter.put(serviceName, rateLimiter);
    }

    public void removeRateLimiterForService(String serviceName, RateLimiter rateLimiter) {
        this.serviceToRateLimiter.remove(serviceName);
    }

    public Boolean allowRequest(String serviceName, String clientId) {
        if (!this.serviceToRateLimiter.containsKey(serviceName)) {
            throw new IllegalArgumentException("Service name '" + serviceName + "' is not registered for rate limiting.");
        }
        return this.serviceToRateLimiter.get(serviceName).allowRequest(clientId);
    }

}
