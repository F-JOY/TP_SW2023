/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.me.org;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mis
 */
@WebService(serviceName = "calculSW")
@Stateless()
public class calculSW {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "somme")
    public int somme(@WebParam(name = "x1") int x1, @WebParam(name = "x2") int x2) {
        //TODO write your implementation code here:
        return x1+x2;
    }
}
