import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SlidingWindowRateLimiter implements RateLimiter {

    int maximumRequests;

    Long windowSizeMillis;

    Map<String, Integer> clientRequestCounts;

    Map<String, Queue<Long>> windowStartTimes;

    public SlidingWindowRateLimiter(int maximumRequests, Long windowSizeMillis) {
        this.maximumRequests = maximumRequests;
        this.windowSizeMillis = windowSizeMillis;
        this.clientRequestCounts = new HashMap<>();
        this.windowStartTimes = new HashMap<>();
    }

    @Override
    public Boolean allowRequest(String clientId) {

        Long currentTimeInMillis = System.currentTimeMillis();

        windowStartTimes.putIfAbsent(clientId, new LinkedList<>());
        clientRequestCounts.putIfAbsent(clientId, 0);

        Queue<Long> timestamps = windowStartTimes.get(clientId);

        while (!timestamps.isEmpty() && currentTimeInMillis - timestamps.peek() > windowSizeMillis) {
            timestamps.poll();
        }

        if (timestamps.size() < maximumRequests) {
            timestamps.offer(currentTimeInMillis);
            return true;
        }

        return false;

    }
}
