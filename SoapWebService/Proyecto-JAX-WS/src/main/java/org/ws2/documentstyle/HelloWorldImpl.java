package org.ws2.documentstyle;
 
import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "org.ws2.documentstyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hola mundo te saludo desde JAX-WS Document Style " + name;
	}
 
}