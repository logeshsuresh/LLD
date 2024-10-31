public class Main {

    public static void main(String[] args) {

        // Initialize RateLimiterManager singleton instance
        RateLimiterManager rateLimiterManager = RateLimiterManager.getInstance();

        // Configure and register rate limiters for different services
        RateLimiterConfiguration fixedWindowConfig = new RateLimiterConfiguration(5, 10000L, RateLimiterType.FIXED_WINDOW);
        RateLimiterConfiguration slidingWindowConfig = new RateLimiterConfiguration(3, 10000L, RateLimiterType.SLIDING_WINDOW);

        // Register the rate limiters for two services
        rateLimiterManager.registerRateLimiterToService("service1", fixedWindowConfig);
        rateLimiterManager.registerRateLimiterToService("service2", slidingWindowConfig);

        // Simulate requests for service1 with fixed window rate limiting
        System.out.println("Testing service1 with fixed window rate limiting:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Request " + i + " allowed: " + rateLimiterManager.allowRequest("service1", "clientA"));
            // Adding a small sleep to spread requests across time
            try { Thread.sleep(200); } catch (InterruptedException e) { e.printStackTrace(); }
        }

        // Simulate requests for service2 with sliding window rate limiting
        System.out.println("\nTesting service2 with sliding window rate limiting:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Request " + i + " allowed: " + rateLimiterManager.allowRequest("service2", "clientB"));
            try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}
