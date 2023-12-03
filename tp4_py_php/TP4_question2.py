from zeep import Client

url_service_web = "http://es1-572-51jw:8080/AddWS/AddWS?wsdl"

# Créez un client SOAP
client = Client(url_service_web)

# Appelez l'opération du service web
resultat = client.service.addition(3,4)

# Affichez le résultat
print("Le résultat de l'addition est :", resultat)
