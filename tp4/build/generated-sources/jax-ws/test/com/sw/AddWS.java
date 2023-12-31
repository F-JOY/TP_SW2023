
package test.com.sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AddWS", targetNamespace = "http://sw.com.test/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AddWS {


    /**
     * 
     * @param b
     * @param a
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Addition")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Addition", targetNamespace = "http://sw.com.test/", className = "test.com.sw.Addition")
    @ResponseWrapper(localName = "AdditionResponse", targetNamespace = "http://sw.com.test/", className = "test.com.sw.AdditionResponse")
    @Action(input = "http://sw.com.test/AddWS/AdditionRequest", output = "http://sw.com.test/AddWS/AdditionResponse")
    public int addition(
        @WebParam(name = "a", targetNamespace = "")
        int a,
        @WebParam(name = "b", targetNamespace = "")
        int b);

}
