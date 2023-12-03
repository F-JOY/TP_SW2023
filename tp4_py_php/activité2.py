from zeep import Client

# URL du service web SOAP
url_service_web = "https://apps.learnwebservices.com/services/hello?WSDL"

# Créer un client SOAP
client = Client(url_service_web)

# Remplacez 'votre_nom' par le nom que vous souhaitez utiliser
nom = "Lydia"

# Appeler l'opération du service web SOAP
response = client.service.SayHello(nom)

# Afficher la réponse
print(response)
