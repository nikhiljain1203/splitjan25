package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitJan25Application implements CommandLineRunner {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SplitJan25Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello world");
    }

}
