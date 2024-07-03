package Loggers;

public abstract class Logger {

    private Logger next;

    public static Logger link(Logger first, Logger... chain) {
        Logger head = first;
        for (Logger nextInChain : chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean log(LogLevel logLevel, String message);

    protected boolean logNext(LogLevel logLevel, String message) {
        if (next == null) {
            return true;
        }
        return next.log(logLevel, message);
    }

}
