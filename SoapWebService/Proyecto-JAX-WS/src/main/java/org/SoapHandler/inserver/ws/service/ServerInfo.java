package org.SoapHandler.inserver.ws.service;
 
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
 
@WebService
@HandlerChain(file="handler-chain.xml")
public class ServerInfo{
 
	@WebMethod
	public String getServerName() {
 
		return "Victor PC server";
 
	}
 
}