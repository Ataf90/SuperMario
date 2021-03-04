
public class ChampignonRouge {
    static int nbChampignonRouge;
    String couleur;
    boolean estAttrape;

    public ChampignonRouge() {
        this.couleur = "Rouge";
        this.estAttrape = false;
        if(ChampignonRouge.nbChampignonRouge <= 2) {
            ChampignonRouge.nbChampignonRouge ++;
        } else {
            System.out.println("Il y a trop de champignons rouges sur ce niveau");
        }
    }
}
