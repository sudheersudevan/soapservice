package com.sudheer.cxf.demo.servImpl;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/")

public class EmployeeServiceImpl implements EmployeeService{

 @GET
 @Path("/getemployee/{name}/")
 @Produces(value = {"application/json" })
 public String getEmployeesByName(@PathParam("name") String name) {
   return "Welcome : "+name;
  }  
  
 }
