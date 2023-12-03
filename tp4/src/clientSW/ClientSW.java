/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientSW;

/**
 *
 * @author mis
 */
public class ClientSW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(addition (2,3));
         
    }

    private static int addition(int a, int b) {
        test.com.sw.AddWS_Service service = new test.com.sw.AddWS_Service();
        test.com.sw.AddWS port = service.getAddWSPort();
        return port.addition(a, b);
    }
    
}
