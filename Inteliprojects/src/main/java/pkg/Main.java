package pkg;

import org.tinylog.Logger;

public class Main {
    public static void main(String[] args) {
        Logger.error("This is an Error messeage");
        Logger.warn("This is a WARN messeage");
        Logger.info("This is an INFO messeage");
        Logger.debug("This is a DEBUG messeage");
        Logger.trace("This is a TRACE messeage");
        Logger.info("Ures's name is {}", System.getProperty("username"));
        Logger.error(new RuntimeException("Oops"),"Something is wrong");
    }
}