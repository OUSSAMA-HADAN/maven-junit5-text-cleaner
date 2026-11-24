package ma.ehei.maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NettoyeurTexteTest {

    private final NettoyeurTexte nettoyeur = new NettoyeurTexte();

    @Test
    void supprimeEspacesDebutFinEtMilieu() {
        assertEquals("Bonjour Maven", nettoyeur.nettoyer("   Bonjour    Maven   "));
    }

    @Test
    void remplaceTabulationEtSautDeLigne() {
        assertEquals("Bonjour Maven", nettoyeur.nettoyer("Bonjour\t\nMaven"));
    }

    @Test
    void laisseTexteDejaNormalise() {
        assertEquals("Bonjour Maven", nettoyeur.nettoyer("Bonjour Maven"));
    }

    @Test
    void texteUniquementEspacesDevientVide() {
        assertEquals("", nettoyeur.nettoyer("     "));
    }

    @Test
    void texteNullDevientVide() {
        assertEquals("", nettoyeur.nettoyer(null));
    }
}
