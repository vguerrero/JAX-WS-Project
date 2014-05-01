package org.soaphandler.inclient.client;
 
import org.soaphandler.inserver.ws.ServerInfo;
import org.soaphandler.inserver.ws.ServerInfoService;
 
public class WsClient{
 
	public static void main(String[] args) throws Exception {
 
		ServerInfoService sis = new ServerInfoService();
		ServerInfo si = sis.getServerInfoPort();
 
		System.out.println(si.getServerName());
 
    }
 
}