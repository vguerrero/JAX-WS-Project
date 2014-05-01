package org.ws;
 
import javax.xml.ws.Endpoint;
import org.ws.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
	//http://localhost:9999/ws/hello?wsdl --> se ve el wsdl
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
 
}