package org.ws;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "org.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hola mundo te saludo desde JAX-WS " + name;
	}
 
}