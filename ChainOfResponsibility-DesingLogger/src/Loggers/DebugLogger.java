package Loggers;

public class DebugLogger extends Logger {

    private final LogLevel logLevel;

    public DebugLogger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    @Override
    public boolean log(LogLevel logLevel, String message) {
        if (this.logLevel == logLevel) {
            System.out.println(this.logLevel.name() + " : " + message);
            return true;
        }
        return logNext(logLevel, message);
    }

}