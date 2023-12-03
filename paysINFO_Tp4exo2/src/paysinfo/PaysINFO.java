/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paysinfo;


public class PaysINFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(countryFlag(("AL")));
    }

    private static String capitalCity(java.lang.String sCountryISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.capitalCity(sCountryISOCode);
    }

    private static String countryName(java.lang.String sCountryISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.countryName(sCountryISOCode);
    }

    private static String countryFlag(java.lang.String sCountryISOCode) {
        org.oorsprong.websamples.CountryInfoService service = new org.oorsprong.websamples.CountryInfoService();
        org.oorsprong.websamples.CountryInfoServiceSoapType port = service.getCountryInfoServiceSoap();
        return port.countryFlag(sCountryISOCode);
    }
    
    
}
