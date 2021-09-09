package com.springhow.examples.cmdargs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class StartupPrintRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("args = " + Arrays.deepToString(args));
    }
}
