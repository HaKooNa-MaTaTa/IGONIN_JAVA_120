package itis;

public class Logger {
    private static Logger instance;

    static {
        instance = new Logger();
    }
    private Logger() {

    }

    public static Logger setPrefix() {
        return instance;
    }
    private String preFix;

    public void setPreFix(String preFix) {
        this.preFix = preFix;
    }
    public void log(String message) {
        System.out.print(preFix + ": " + message);
    }
}
