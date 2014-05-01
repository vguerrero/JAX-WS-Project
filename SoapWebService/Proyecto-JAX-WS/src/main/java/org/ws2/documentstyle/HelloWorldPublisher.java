package org.ws2.documentstyle;
 
import javax.xml.ws.Endpoint;
import org.ws2.documentstyle.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
	
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
 
}