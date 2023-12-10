> Lien GitHub : https://github.com/Bokuto72/apiMeteo
# TP3
# Etape 5 - Description des dépendances
>### Spring Web :
>> Permet de gérer le développement d'applications web,
>> prenant en compte les requêtes HTTP. 
>### Spring Data JPA : 
>> Permet de simplifier les accès aux BDD grâce aux annotations
>> (en définissant les entités).
>### H2 Database :
>> BDD utilisée pendant les phases de développement et de tests.
>### Spring Boot DevTools :
>> Fournit plusieurs outils de développement, comme la recompilation*
>> automatique du code à chaque modification.
>### Thymeleaf :
>> Moteur de template basé sur HTML
# Etape 13 - contrôleur
> 1. Nous avons paramétré l'URL d'appel /greeting grâce à l'annotation
> @GetMapping("/greeting")
> 2. Nous avons choisi le fichier HTML à afficher avec la ligne
> return "greeting";
> 3. Nous envoyons cette information à l'aide de la méthode addAttribute(),
> qui associe à un attribut "nomTemplate", la valeur name précisée dans l'URL.
# Etape 20 
> Nous voyons bien tout le contenu de data.sql
# Etape 22 - @Autowired
> Cette annotation permet à Spring de rechercher un bean correspondant.
# Etape 6 - TP4
> 1. Oui, il faut utiliser une clef API pour utiliser MeteoConcept, celle-ci est
> appelée Token.
> 2. L'URL à appeler est https://api.meteo-concept.com/api/forecast/nextHours?token=3dddb677ae1b277e2b9185b3b57c7a191d5495495584340cb6cca2473817bd9d.
> 3. C'est une méthode GET.
> 4. Dans notre exemple, nous avons besoin d'envoyer les coordonnées (longitude 
> et latitude) pour récupérer la température correspondante. Pour cela, il
> faut rajouter "&latlng=" puis le couple de valeurs, séparées par une virgule.
> 5. La température se trouve dans le tableau forecast, et correspond à la clef 
> "temp2m".
> 6. Les prévisions météo se trouvent dans le tableau forecast, et correspondent à
> la clef "weather".