package com.springhow.examples.cmdargs;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("args.getOptionNames() = " + args.getOptionNames());
        System.out.println("args.containsOption(\"first-argument\") = " + args.containsOption("first-argument"));
        System.out.println("args.getOptionValues(\"first-argument\") = " + args.getOptionValues("first-argument"));
        System.out.println("args.getNonOptionArgs() = " + args.getNonOptionArgs());
        args.getNonOptionArgs();

    }
}
