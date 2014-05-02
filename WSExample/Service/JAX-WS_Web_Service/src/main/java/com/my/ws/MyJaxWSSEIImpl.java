package com.my.ws;
import javax.jws.WebService;
@WebService(endpointInterface="com.my.ws.MyJaxWSSEI", targetNamespace="http://globinch.com", portName="MyJaxWSSEIPort", serviceName="MyJaxWSHelloService")
public class MyJaxWSSEIImpl implements MyJaxWSSEI { 
	/** * Default Constructor */ 
	public MyJaxWSSEIImpl() { }
	/* (non-Javadoc) * @see com.my.ws.MyJaxWSSEI#getJXWsRes(java.lang.String)
*/ @Override 
	public JXRes getJXWsRes(String name) { 
		JXRes jxRes = new JXRes();
		jxRes.setMessage("Hello");
		jxRes.setName(name); 
		return jxRes;
	} 
} 