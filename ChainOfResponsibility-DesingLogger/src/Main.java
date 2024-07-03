import Loggers.*;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.link(
                new LogLogger(LogLevel.LOG),
                new DebugLogger(LogLevel.DEBUG),
                new ErrorLogger(LogLevel.ERROR)
        );

        logger.log(LogLevel.LOG, "Logging something");
        logger.log(LogLevel.ERROR, "Error logging");
        logger.log(LogLevel.DEBUG, "Debugging logger");

    }
}