# feedTheBirds 

## Fonctionnement

* La fen�tre de l'application contient 3 pigeons num�rot�s, repr�sent�s par des cercle de 40px de diam�tre et de couleur grise.
* Un clic permet d'ajouter de la nourriture (repr�sent�e par un carr� de 4*4px).
* La nourriture est de couleur rouge lorsqu'elle est fra�che, verte sinon.
* La nourriture reste fra�che pendant 10 secondes.
* Chaque pigeon se dirige vers la nourriture fra�che la plus proche.
* Il faut 1 seconde � un pigeon pour manger.

## Architecture du projet

Nous avons utilis� le mod�le MVC afin d�velopper l'application.

Mod�le :
* Entity.java : classe abstraite servant de parent aux classes Bird et Food 
* Bird.java : classe repr�sentant un oiseau
* Food.java : classe repr�sentant la nourriture
* BirdState.java : �num�ration qui contient les �tats que peut prendre un oiseau
* Position.java : Classe repr�sentant une coordonn�es (x, y)
* Model.java : Classe qui g�re l'ajout de nourriture et update la Vue

Vue :
* ViewPanel.java : Panel qui contient nos oiseaux et notre nourriture, et qui va g�rer l'animation. Le timer nous permet de g�rer notre animation avec des Threads, �vitant ainsi les conflits entre oiseaux.
* View.java : La fen�tre de notre application, qui va s'actualiser en fonction du mod�le.

Controleur :
* Controller.java : Il va �couter les clics sur notre vue et informer le mod�le en cons�quence

Play.java : Notre main qui va initialiser nos trois classe MVC, va ajouter la vue comme observer de modele et le controller comme listenenr de la vue.