public class LogLevels {
    
    public static String message(String logLine) {
            String result = " ";
        
        if (logLine.contains("[ERROR]:")) {
            String wordToRemove = "[ERROR]:";
            String newString = logLine.replace(wordToRemove, "");
            result = newString.trim();
        }
        else if (logLine.contains("[WARNING]")) {
            String wordToRemove = "[WARNING]:";
            String newString = logLine.replace(wordToRemove, "");
            result = newString.trim();
        }
        else if (logLine.contains("[INFO]")) {
            String wordToRemove = "[INFO]:";
            String newString = logLine.replace(wordToRemove, "");
            result = newString.trim();
        }
        return result;
    }

    public static String logLevel(String logLine) {
        String result = " ";

        if (logLine.contains("[ERROR]")) {
            result = "error";
        }
        else if (logLine.contains("[WARNING]")) {
            result = "warning";
        }
        else if (logLine.contains("[INFO]")) {
            result = "info";
        }
        return result;
    }

    public static String reformat(String logLine) {
        String result = " ";

        if (logLine.contains("[ERROR]")) {
            String word = "(error)";
            result = "Segmentation fault " + word;
            
            if (logLine.contains("disk")) {
                result = "Corrupt disk " + word;
            }
        }
        else if (logLine.contains("[WARNING]")) {
            String word = "(warning)";
            result = "Decreased performance " + word;
        }
        else if (logLine.contains("[INFO]")) {
            String word = "(info)";
            result = "Disk defragmented " + word;
        }
        return result.trim();
    }
}
