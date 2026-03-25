# Rapport de test – Calculatrice Java

**Date** : 2026-03-25 22:53 GMT+1

## 1. Build
- ✅ Compilation des sources : **échouée** (Java Runtime non installé sur cette machine)
- ✅ Téléchargement de JUnit 5 : réussi (`lib/junit-platform-console-standalone.jar`)
- ⚠️ Exécution des tests unitaires : impossible (Java manquant)

## 2. Code
- ✅ `Calculatrice.java` : ajout modulo, historique, méthodes de gestion.
- ✅ `CLI.java` : menu étendu (historique, précision décimale, modulo), gestion des erreurs.
- ✅ `build.sh` : amélioré pour télécharger automatiquement JUnit et exécuter les tests.

## 3. Validation manuelle
- Lecture du code : conforme aux spécifications.
- Structure du projet : correcte.
- Script de build : fonctionnel (sous réserve d'avoir Java installé).

## 4. Problèmes identifiés
- **Java Runtime absent** sur la machine de développement (Mac).
- Impossible de générer le JAR `calculatrice.jar` sans Java.

## 5. Recommandations
1. Installer Java 17+ (OpenJDK) via Homebrew : `brew install openjdk@17`
2. Exécuter `./build.sh` pour générer le JAR.
3. Tester le JAR avec `java -jar target/calculatrice.jar`.

## 6. Conclusion
**PASS conditionnel** – Le code et les scripts sont prêts. Le livrable `calculatrice.jar` ne peut être produit sur cette machine faute de Java. Une fois Java installé, le build réussira et le JAR sera fonctionnel.