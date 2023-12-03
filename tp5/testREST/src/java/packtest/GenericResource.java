
package packtest;

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

@Path("generic")
public class GenericResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int getXml(@DefaultValue("2") @QueryParam("a") int a,@DefaultValue("3") @QueryParam("b") int b) {
        return a*b;
    }

    
}
