package com.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IHelloWorld {

    @WebMethod
    public String getHelloWorld(String name);

    @WebMethod
    public String getGreeting(String greeting);
}
