package com.my.ws; 
import javax.jws.WebMethod; 
import javax.jws.WebParam; 
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.WebParam.Mode; 
import javax.jws.soap.SOAPBinding; 
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use; 
import javax.xml.ws.RequestWrapper; 
import javax.xml.ws.ResponseWrapper; 
@WebService(name = "MyJaxWSHello", targetNamespace = "http://globinch.com", wsdlLocation = "http://globinch.com/ws/MyJaxWS?wsdl") 
@SOAPBinding(style=Style.RPC, use=Use.LITERAL)	
public interface MyJaxWSSEI {

	@WebMethod(operationName="getJXWsRes") 
	@RequestWrapper(targetNamespace="http://globinch.com/ws/types", className="java.lang.String")
	@ResponseWrapper(targetNamespace="http://globinch.com/ws/types", className="com.my.ws.JXRes")
	@WebResult(targetNamespace="http://globinch.com/ws/types", name="JXWsRes") 
	public JXRes getJXWsRes( @WebParam(targetNamespace="http://globinch.com/ws/types", name="name", mode=Mode.IN) String name );
	
}