package com.my.ws.client; 
import javax.xml.ws.WebServiceRef; 
import com.globinch.JxRes;
import com.globinch.MyJaxWSHello;
import com.globinch.MyJaxWSHelloService; 
public class JaxWSClient { 

	@WebServiceRef(wsdlLocation="http://127.0.0.1:8088/MyJaxWSService?wsdl")
	static MyJaxWSHelloService service; 
	
	/** * @param args */ 
	public static void main(String[] args) {
		try { 
			JaxWSClient client = new JaxWSClient();
			client.doTest(args);
		} 
		catch(Exception e) { 
			e.printStackTrace();
		}
	} 
	public void doTest(String[] args) { 
		try { 
			service = new MyJaxWSHelloService();
			MyJaxWSHello port = service.getMyJaxWSSEIPort();
			String name; 
			if (args.length > 0) { 
				name = args[0]; 
			}
			else { 
				name = "Globinch";
			} 
			JxRes response = port.getJXWsRes(name);
			System.out.println("************************");
			System.out.println(response.getMessage()+" "+response.getName()); 
			System.out.println("************************"); 
		} 
		catch(Exception e) { 
			e.printStackTrace(); 
		} 
	} 
}