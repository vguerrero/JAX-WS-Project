package org.SoapHandler.inserver.endpoint;
 
import javax.xml.ws.Endpoint;
import org.SoapHandler.inserver.ws.service.ServerInfo;
 
//Endpoint publisher
public class WsPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8888/ws/server", new ServerInfo());
 
	   System.out.println("Service is published!");
	

    }
 
}