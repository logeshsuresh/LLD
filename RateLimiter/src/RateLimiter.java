public interface RateLimiter {

    public Boolean allowRequest(String clientId);

}
