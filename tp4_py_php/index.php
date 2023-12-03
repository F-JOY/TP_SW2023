
<?php
$myservice = new SoapClient("http://ES1-572-51JW:8080/AddWS/AddWS?wsdl");
$resultat = $myservice->addition(array('a'=>2,'b'=>3)) ;
Echo " Le résultat est : ".($resultat->return) ;
?>