import org.apache.log4j.Logger;

public class LogTester {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogTester.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
        logger.fatal("false");


    }
}
