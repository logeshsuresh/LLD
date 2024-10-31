public class RateLimiterFactory {

    public static RateLimiter getRateLimiter(RateLimiterConfiguration rateLimiterConfiguration) {
        switch (rateLimiterConfiguration.getRateLimiterType()) {
            case FIXED_WINDOW -> {
                return new FixedWindowRateLimiter(rateLimiterConfiguration.getMaximumRequests(), rateLimiterConfiguration.getWindowSizeInMillis());
            }
            case SLIDING_WINDOW -> {
                return new SlidingWindowRateLimiter(rateLimiterConfiguration.getMaximumRequests(), rateLimiterConfiguration.getWindowSizeInMillis());
            }
            default -> {
                throw new IllegalArgumentException("Rate Limiter type is invalid");
            }
        }
    }

}
