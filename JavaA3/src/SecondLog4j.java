
import org.apache.log4j.Logger;


public class SecondLog4j {

//    private static Log logger = LogFactory.getLog(SecondLog4j.class);

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SecondLog4j.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("errorasdfghj");
        logger.fatal("fatal");
    }

}
