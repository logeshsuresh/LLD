package Loggers;

public class ErrorLogger extends Logger {

    private final LogLevel logLevel;

    public ErrorLogger(LogLevel logLevel) {
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