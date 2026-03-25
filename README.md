# Calculatrice en Java

Projet de calculatrice en ligne de commande (CLI) réalisé par l'équipe AutoScore Maroc.

## Objectif

Produire un JAR exécutable `calculatrice.jar` avec les fonctionnalités suivantes :

- Addition, soustraction, multiplication, division
- Interface CLI interactive (menu)
- Gestion des erreurs (division par zéro)
- Tests unitaires avec JUnit 5
- Packaging via script Bash (ou Maven si disponible)

## Stack

- Java 17+
- JUnit 5
- Bash (build script)
- GitHub Actions (CI optionnel)

## Structure

```
src/main/java/com/autoscore/calculatrice/Calculatrice.java
src/main/java/com/autoscore/calculatrice/CLI.java
src/test/java/com/autoscore/calculatrice/CalculatriceTest.java
build.sh
run.sh
README.md
```

## Équipe

- **Product Manager** : backlog, user stories, sprint planning
- **Dev Backend** : implémentation Java
- **DevOps** : setup build, packaging JAR
- **QA Tester** : tests, validation
- **CTO** : orchestration, revue, livraison

## Livrable

`calculatrice.jar` exécutable via `java -jar calculatrice.jar`

---

**Repo GitHub** : https://github.com/sinchi/calculatrice-en-java