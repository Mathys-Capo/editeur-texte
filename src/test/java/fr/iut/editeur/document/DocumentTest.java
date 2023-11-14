package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DocumentTest extends TestCase {

    public void test_ajouter(){
        Document t =new Document();
        assertEquals("",t.getTexte());

        String depart="la";
        t.ajouter("la");
        assertEquals(depart,t.getTexte());

        depart="latu";
        t.ajouter("tu");
        assertEquals(depart,t.getTexte());
    }

    public void test_inserer(){
        Document t =new Document();

        t.ajouter("lala");

        String result="latu";
        t.remplacer(2,4,"tu");
        assertEquals(result,t.getTexte());
    }
}
