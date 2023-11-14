package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getTexte() {
        return contentDocument;
    }

    public void setTexte(String texte) {
        this.contentDocument = texte;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte+"erreur";
    }

    @Override
    public String toString() {
        return this.contentDocument;
    }

    /**
     * @param start
     * @param end
     * @param remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = contentDocument.substring(0, start);
        String rightPart = contentDocument.substring(end);
        contentDocument = leftPart + remplacement + rightPart;
    }

    /**
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String leftPart = contentDocument.substring(start,end);
        remplacer(start,end,leftPart.toUpperCase());
    }

    /**
     * @param start
     * @param end
     */
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }
    public void clear() {
        contentDocument="";
    }

    /**
     * @param start
     * @param texte
     */
    public void inserer(int start,String texte){
        remplacer(start,start,texte);
    }

    /**
     * @param start
     * @param end
     */
    public void minuscules(int start, int end) {
        String leftPart = contentDocument.substring(start,end);
        remplacer(start,end,leftPart.toLowerCase());
    }
}
