package com.client;

import com.ws.IHelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qName = new QName("http://ws.com/", "HelloWorldService");

        Service service = Service.create(url, qName);

        IHelloWorld hello = service.getPort(IHelloWorld.class);

        System.out.println(hello.getHelloWorld("from epam systems"));
        System.out.println("\nTEST GREETING:\n");
        System.out.println(hello.getGreeting("from epam systems"));
        System.out.println(hello.getGreeting("night"));
        System.out.println(hello.getGreeting("morning"));
        System.out.println(hello.getGreeting(""));
    }
}
