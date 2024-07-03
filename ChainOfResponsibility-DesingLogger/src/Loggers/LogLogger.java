package Loggers;

public class LogLogger extends Logger {

    private final LogLevel logLevel;

    public LogLogger(LogLevel logLevel) {
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