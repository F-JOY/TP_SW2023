
package pack.tp5;

import java.io.Serializable;
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
import org.jboss.weld.util.LazyValueHolder;

@Path("activity2")
public class Activity2 implements Serializable {

    @Path("/addition")
    @GET
    @Produces(MediaType.APPLICATION_JSON )
    public int addition(@DefaultValue("2") @QueryParam("a") int a,@DefaultValue("2") @QueryParam("b") int b) {
        return (a + b);
        //http://localhost:8080/activity2RestSW/webresources/activity2/addition/?a=5&b=5
    }
   /*
    @Path("/multiplication")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double multiplication(@QueryParam("a") double a, @QueryParam("b") double b) {
        return a * b;
        
        //http://localhost:8080/activity2RestSW/webresources/activity2/multiplication/?a=4&b=9
    }*/
}
