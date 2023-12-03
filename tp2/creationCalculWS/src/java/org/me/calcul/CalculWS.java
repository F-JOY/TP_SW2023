/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calcul;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author mis
 */
@WebService(serviceName = "CalculWS")
@Stateless()
public class CalculWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "somme")
    public int somme(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        return x+y;
    }
}
