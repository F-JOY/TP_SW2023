/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@Path("multiplication")
public class MultiplicationResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        
        throw new UnsupportedOperationException();
    }

}
