import static java.lang.String.format;

public class LogLevels {
    
    public static String message(String logLine) {

        String[] logLineArray = logLine.split(":");
        return logLineArray[1].strip();
    }

    public static String logLevel(String logLine) {
        return logLine.split(":")[0]
                .replace("[", "")
                .replace("]", "")
                .toLowerCase();
    }

    public static String reformat(String logLine) {
        return format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
