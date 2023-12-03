
package activity2.tp5;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("addition")
public class Addition {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int getJson(@QueryParam("a")int a,@QueryParam("b") int b) {
       return a+b;
    }

   
}
