package org.ws.cliente;
 
import org.ws.wsimport.HelloWorld;
import org.ws.wsimport.HelloWorldImplService;
 
public class HelloWorldClientWsImport{
 
	public static void main(String[] args) {
 
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
 
		System.out.println(hello.getHelloWorldAsString("Me Conecte por medio de --> wsimport"));
 
    }
 
}