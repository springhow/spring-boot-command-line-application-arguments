package com.springhow.examples.cmdargs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    @Value("${second-argument:}")
    private String secondArgument;

    private final ApplicationArguments applicationArguments;

    public SomeComponent(ApplicationArguments applicationArguments) {
        this.applicationArguments = applicationArguments;
    }

    //do something with applicationArguments in component methods

}
