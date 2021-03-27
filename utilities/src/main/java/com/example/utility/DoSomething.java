package com.example.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoSomething {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void Do() {
        LOGGER.info("From DoSomethingClass");
    }
}
