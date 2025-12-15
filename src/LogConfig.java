import java.io.IOException;
import java.util.logging.*;

public class LogConfig {

    private static boolean initialized = false;

    public static void init() {
        if (initialized) return;

        try {
            Logger rootLogger = Logger.getLogger("");
            rootLogger.setLevel(Level.INFO);

            // Remove default console handlers
            for (Handler h : rootLogger.getHandlers()) {
                rootLogger.removeHandler(h);
            }

            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.INFO);

            rootLogger.addHandler(fileHandler);

            initialized = true;

        } catch (IOException e) {
            throw new RuntimeException("Failed to initialize logging", e);
        }
    }
}
