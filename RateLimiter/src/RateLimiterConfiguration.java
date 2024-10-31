public class RateLimiterConfiguration {

    private int maximumRequests;

    private Long windowSizeInMillis;

    private RateLimiterType rateLimiterType;

    public RateLimiterConfiguration(int maximumRequests, Long windowSizeInMillis, RateLimiterType rateLimiterType) {
        this.maximumRequests = maximumRequests;
        this.windowSizeInMillis = windowSizeInMillis;
        this.rateLimiterType = rateLimiterType;
    }

    public void setMaximumRequests(int maximumRequests) {
        this.maximumRequests = maximumRequests;
    }

    public void setWindowSizeInMillis(Long windowSizeInMillis) {
        this.windowSizeInMillis = windowSizeInMillis;
    }

    public void setRateLimiterType(RateLimiterType rateLimiterType) {
        this.rateLimiterType = rateLimiterType;
    }

    public int getMaximumRequests() {
        return maximumRequests;
    }

    public Long getWindowSizeInMillis() {
        return windowSizeInMillis;
    }

    public RateLimiterType getRateLimiterType() {
        return rateLimiterType;
    }

}
