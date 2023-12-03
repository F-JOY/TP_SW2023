/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.sw.com;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("tp5")
public class Tp5 {
   @GET
   @Produces("application/json")
    public String getText() {
       return "test";
    }
    
     @GET
   @Produces("application/json")
    @Path("produit")
    public String getProduit( @DefaultValue("2") @QueryParam("a") int a,@DefaultValue("3") @QueryParam("b") int b) 
    {
        return " le produit de ces deux entiers est: "+a*b;
        //http://localhost:8080/RestWS/webresources/produit  6
        //http://localhost:8080/RestWS/webresources/produit/?a=5&b=5   25
    }
  /*
    
@GET
@Produces ("application/xml")
public String getText () {
return "<?xml version=\"1.0\"?>" + "<hello> Mon premier service REST sur Xml " + "</hello>";
}*/
    /*  
@GET
@Path ("param")
public String getResource(@Context UriInfo uriInfo){
return "The Client used This to reach this resource method : "+uriInfo.getAbsolutePath ().toASCIIString();
// http://localhost:8080/RestWS/webresources/tp5/param
}  */  
}   