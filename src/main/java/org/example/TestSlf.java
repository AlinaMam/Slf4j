package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Единственное отличие в том, что объекты Logger и LoggerFactory должны принадлежать к пакету org.slf4j.

public class TestSlf {
    private static Logger logger = LoggerFactory.getLogger(TestSlf.class);
    public static void main(String[] args) {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");
    }
}