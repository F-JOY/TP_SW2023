
package activity2.tp5;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("multiplication")
public class Multiplication {

    @GET
    @Produces("application/json")
   @Path("{x}/{y}")
    public double getJson(@PathParam("x")double x,@PathParam("y") double y) {
        return x*y;
    }

}
