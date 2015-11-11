# feedTheBirds 

## Fonctionnement

* La fenêtre de l'application contient 3 pigeons numérotés, représentés par des cercle de 40px de diamètre et de couleur grise.
* Un clic permet d'ajouter de la nourriture (représentée par un carré de 4*4px).
* La nourriture est de couleur rouge lorsqu'elle est fraîche, verte sinon.
* La nourriture reste fraîche pendant 10 secondes.
* Chaque pigeon se dirige vers la nourriture fraîche la plus proche.
* Il faut 1 seconde à un pigeon pour manger.

## Architecture du projet

Nous avons utilisé le modèle MVC afin développer l'application.

Modèle :
* Entity.java : classe abstraite servant de parent aux classes Bird et Food 
* Bird.java : classe représentant un oiseau
* Food.java : classe représentant la nourriture
* BirdState.java : Énumération qui contient les états que peut prendre un oiseau
* Position.java : Classe représentant une coordonnées (x, y)
* Model.java : Classe qui gère l'ajout de nourriture et update la Vue

Vue :
* ViewPanel.java : Panel qui contient nos oiseaux et notre nourriture, et qui va gérer l'animation. Le timer nous permet de gérer notre animation avec des Threads, évitant ainsi les conflits entre oiseaux.
* View.java : La fenêtre de notre application, qui va s'actualiser en fonction du modèle.

Controleur :
* Controller.java : Il va écouter les clics sur notre vue et informer le modèle en conséquence

Play.java : Notre main qui va initialiser nos trois classe MVC, va ajouter la vue comme observer de modele et le controller comme listenenr de la vue.