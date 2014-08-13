package com.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ws.IHelloWorld")
public class HelloWorld implements IHelloWorld {

    public static final String MORNING = "morning";
    public static final String NIGHT = "night";

    @Override
    public String getHelloWorld(String name) {
        return "Hello World " + name;
    }

    @Override
    public String getGreeting(String greeting) {
        String answer = "Incorrect value of the parameter";
        if (greeting.equalsIgnoreCase(MORNING)) {
            answer = "Good morning!";
        } else if (greeting.equalsIgnoreCase(NIGHT)) {
            answer = "Good night!";
        }
        return answer;
    }
}
