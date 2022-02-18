package com.revature.loggingwith4j;

import io.javalin.http.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingUtil {

    private static Logger logger = LoggerFactory.getLogger(LoggingUtil.class);
//    final static Logger log = Logger.getLogger(Log4JDriver.class);

    public void logRequest(Context ctx){
        logger.info(ctx.method() +" request made to: "+ctx.path());
    }





//        System.out.println("regular sysout without log4j");
//        log.trace("trace message - very fine grained");
//        log.debug("this statement is useful for debugging the application");
//        log.info("informational message use this level of logging");
//        log.warn("something bad potentially could/did happen");
//        log.error("something went wrong");
//        log.fatal("something very bad happened");

}
