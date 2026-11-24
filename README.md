# TP Maven – Nettoyeur de texte

Projet de TP (EHEI) pour pratiquer **Maven**, l'ajout d'une dépendance externe (**Apache Commons Lang 3**) et les tests unitaires avec **JUnit 5**.

## Fonctionnalité

La classe `NettoyeurTexte` normalise les espaces d'une chaîne de caractères :

- supprime les espaces en début et en fin de texte ;
- remplace les suites d'espaces, tabulations et sauts de ligne par un seul espace ;
- retourne une chaîne vide si le texte est `null`.

```java
NettoyeurTexte nettoyeur = new NettoyeurTexte();
nettoyeur.nettoyer("   Bonjour \t\n   Maven   "); // "Bonjour Maven"
nettoyeur.nettoyer(null);                         // ""
```

## Technologies

| Outil              | Version |
|--------------------|---------|
| Java               | 17      |
| Maven              | 3.x     |
| Commons Lang 3     | 3.20.0  |
| JUnit Jupiter      | 5.11.4  |

## Structure

```
tp-maven/
├── pom.xml
└── src/
    ├── main/java/ma/ehei/maven/NettoyeurTexte.java
    └── test/java/ma/ehei/maven/NettoyeurTexteTest.java
```

## Utilisation

Compiler le projet :

```bash
mvn compile
```

Lancer les tests :

```bash
mvn test
```

Générer le JAR :

```bash
mvn package
```

## Tests

| Test                               | Cas vérifié                                   |
|------------------------------------|-----------------------------------------------|
| `supprimeEspacesDebutFinEtMilieu`  | Espaces multiples au début, au milieu, à la fin |
| `remplaceTabulationEtSautDeLigne`  | Tabulations et sauts de ligne                  |
| `laisseTexteDejaNormalise`         | Texte déjà propre inchangé                     |
| `texteUniquementEspacesDevientVide`| Texte composé uniquement d'espaces             |
| `texteNullDevientVide`             | Entrée `null`                                  |

## Auteur

Oussama hdn – EHEI
