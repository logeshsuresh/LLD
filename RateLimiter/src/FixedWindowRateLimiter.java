import java.util.HashMap;
import java.util.Map;

public class FixedWindowRateLimiter implements RateLimiter {

    int maximumRequests;

    Long windowSizeMillis;

    Map<String, Integer> clientRequestCounts;

    Map<String, Long> windowStartTimes;

    public FixedWindowRateLimiter(int maximumRequests, Long windowSizeMillis) {
        this.maximumRequests = maximumRequests;
        this.windowSizeMillis = windowSizeMillis;
        this.clientRequestCounts = new HashMap<>();
        this.windowStartTimes = new HashMap<>();
    }

    @Override
    public Boolean allowRequest(String clientId) {

        Long currentTimeInMillis = System.currentTimeMillis();

        windowStartTimes.putIfAbsent(clientId, currentTimeInMillis);
        clientRequestCounts.putIfAbsent(clientId, 0);

        Long clientWindowStartTime = windowStartTimes.get(clientId);

        if (currentTimeInMillis - clientWindowStartTime >= windowSizeMillis) {
            windowStartTimes.put(clientId, currentTimeInMillis);
            clientRequestCounts.put(clientId, 0);
        }

        int requestCount = clientRequestCounts.getOrDefault(clientId, 0);

        if (requestCount < maximumRequests) {
            clientRequestCounts.put(clientId, requestCount + 1);
            return true;
        }

        return false;

    }

}
