package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexte() {
        return texteDocument;
    }

    public void setTexte(String texte) {
        this.texteDocument = texte;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    @Override
    public String toString() {
        return this.texteDocument;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texteDocument.substring(0, start);
        String rightPart = texteDocument.substring(end);
        texteDocument = leftPart + remplacement + rightPart;
    }
    public void majuscules(int start, int end) {
        String leftPart = texteDocument.substring(start,end);
        remplacer(start,end,leftPart.toUpperCase());
    }
    public void effacer(int start, int end) {
        remplacer(start,end,"");
    }public void clear() {
        texteDocument="";
    }

    public void inserer(int start,String texte){
        remplacer(start,start,texte);
    }

    public void minuscules(int start, int end) {
        String leftPart = texteDocument.substring(start,end);
        remplacer(start,end,leftPart.toLowerCase());
    }
}
