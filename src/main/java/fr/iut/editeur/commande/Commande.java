package fr.iut.editeur.commande;
public interface Commande {
    /**
     * Description de la commande
     */
    void getDescriptionCommande();

    /**
     * Commande a executer
     */
    void executer();
}
