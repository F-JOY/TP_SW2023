/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.sw;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mis
 */
@WebService(serviceName = "AddWS")
@Stateless()
public class AddWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public int Addition(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        //TODO write your implementation code here:
        return a+b;
    }
}
