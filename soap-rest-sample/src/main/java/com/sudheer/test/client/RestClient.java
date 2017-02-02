package com.sudheer.test.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {
 public static void main(String[] args) {
   System.out.println("Sent HTTP GET request to query customer info");
     URL url;
  
   try {
    url = new URL("http://localhost:8080/soap-rest-sample/employeeservice/getemployee/Ryan");
    getStringFromIOStream(url);
   } catch (MalformedURLException e1) {
    // TODO Auto-generated catch block
    e1.printStackTrace();
   }
 }

 private static void getStringFromIOStream(URL url) {
  try {
  InputStream in = url.openStream();
  BufferedInputStream bis = new BufferedInputStream(in);
  ByteArrayOutputStream buf = new ByteArrayOutputStream();
  int result = bis.read();
  while(result != -1) {
    byte b = (byte)result;
    buf.write(b);
    result = bis.read();
  }        
  System.out.println(buf.toString());

} catch (Exception e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}
 }

 

}
