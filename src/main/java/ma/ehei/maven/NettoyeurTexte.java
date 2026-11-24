package ma.ehei.maven;

import org.apache.commons.lang3.StringUtils;

public class NettoyeurTexte {

    public String nettoyer(String texte) {
        if (texte == null) {
            return "";
        }
        return StringUtils.normalizeSpace(texte);
    }
}
