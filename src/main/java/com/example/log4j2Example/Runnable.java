package com.example.log4j2Example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runnable implements CommandLineRunner {

  private static final Logger logger = LogManager.getLogger(Runnable.class);

  @Override
  public void run(String... args) throws Exception {
    logger.info("hello world");
  }
}
