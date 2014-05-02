package com.my.ws;
import javax.xml.ws.Endpoint; 

public class JXResEndPoint { 
	public static void main(String[] args ){ 
		Endpoint.publish("http://localhost:8088/MyJaxWSService", new MyJaxWSSEIImpl());
		System.out.print("MyJaxWSService is up");
	} 
} 
