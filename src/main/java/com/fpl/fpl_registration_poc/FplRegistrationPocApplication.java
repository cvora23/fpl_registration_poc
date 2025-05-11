package com.fpl.fpl_registration_poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FplRegistrationPocApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(FplRegistrationPocApplication.class);

    public static void main(String[] args) {
        LOGGER.info("FplRegistrationPocApplication Started");
        SpringApplication.run(FplRegistrationPocApplication.class, args);
    }

}
