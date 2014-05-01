package org.ws.cliente;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import org.ws.HelloWorld;
 
public class HelloWorldClient{
 
	/***
	para ejecutar estos main desde maven mirar el archivo de anotaciones
	mvn exec:java -Dexec.mainClass="org.ws.HelloWorldPublisher" --> este el end point
	mvn exec:java -Dexec.mainClass="org.ws.cliente.HelloWorldClient" --> este es el cliente
	***/
	public static void main(String[] args) throws Exception {
 
	URL url = new URL("http://localhost:9999/ws/hello?wsdl");
 
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://ws.org/", "HelloWorldImplService");
 
        Service service = Service.create(url, qname);
 
        HelloWorld hello = service.getPort(HelloWorld.class);
 
        System.out.println(hello.getHelloWorldAsString("victor"));
		
    }
 
}