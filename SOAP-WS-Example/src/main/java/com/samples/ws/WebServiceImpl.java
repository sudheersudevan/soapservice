package com.samples.ws;
import javax.jws.WebService;

import com.samples.ws.client.IWebService;

	 
	@WebService(endpointInterface = "com.samples.ws.IWebService")
	public class WebServiceImpl implements IWebService{
		    public String printMessage() {
		        return "Hello from Java Code Geeks Server";
		    }
	 
	   
}
