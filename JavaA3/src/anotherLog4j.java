
import org.apache.log4j.Logger;


public class anotherLog4j {

//    private static Log logger = LogFactory.getLog(anotherLog4j.class);

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(anotherLog4j.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }

}
