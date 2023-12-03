
package actvity2.tp5;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author mis
 */
@Path("addition")
public class AdditionResource {

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

}
