
package pack.sw.com;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("produit")

public class Prod {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
   /* public String getProduit( @DefaultValue("2") @QueryParam("a") int a,@DefaultValue("3") @QueryParam("b") int b) 
    {
        return " le produit de ces deux entiers est: "+a*b;
        //http://localhost:8080/RestWS/webresources/produit  6
        //http://localhost:8080/RestWS/webresources/produit/?a=5&b=5   25
    }*/
   /* @Path("{a}/{b}")
    public String getProduit(@PathParam("a")int a,@PathParam("b")int b){
        return " le produit égale a : "+a*b;
        //http://localhost:8080/RestWS/webresources/produit/4/8
    }
    */
   public String getProduit(@QueryParam("a") int a, @QueryParam("b") int b) 
    {
        return " le produit de ces deux entiers est: "+a*b;
        //http://localhost:8080/RestWS/webresources/produit  6
        //http://localhost:8080/RestWS/webresources/produit/?a=5&b=5   25
    }
  
}
