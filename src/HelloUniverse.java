public class HelloUniverse {

    public static void main(String... args) {

        Planete mercure = new Planete("Mercure");
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";
        Planete venus = new Planete("Venus");
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete("Terre");
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete("Mars");
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete("Jupiter");
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete("Saturne");
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete("Uranus");
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete("Neptune");
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        VaisseauDeGuerre chasseur = new VaisseauDeGuerre();
        chasseur.type = "Chasseur";
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        VaisseauCivil vaisseauMonde = new VaisseauCivil();
        vaisseauMonde.type = "Vaisseau-Monde";
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        chasseur.activerBouclier();
        vaisseauMonde.activerBouclier();

        chasseur.attaque(vaisseauMonde,"lasers photoniques",3);
        vaisseauMonde.desactiverBouclier();
        System.out.println("La résistance du bouvclier du VM est "+ vaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage du VM est "+ vaisseauMonde.blindage);
    }

    int nbrDeKevin = 255254141;

    }if (nbrDeKevin>=1,nbrDeKevin%2){

}
