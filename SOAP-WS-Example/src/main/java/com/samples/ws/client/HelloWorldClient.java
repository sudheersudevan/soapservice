package com.samples.ws.client;

public class HelloWorldClient {

	public static void main(String[] args) {

		WebServiceImplService helloService = new WebServiceImplService();
		IWebService iWebService = helloService.getWebServiceImplPort();

		System.out.println(iWebService.printMessage());

    }
}
