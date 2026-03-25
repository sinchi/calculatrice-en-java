# Tâche DevOps

**Agent** : devops
**Projet** : Calculatrice en Java
**Issue GitHub** : (à créer par le PO)

## Objectif
Assurer le build, le packaging et la livraison du JAR exécutable.

## Travail à réaliser

### 1. Vérifier le build existant
Le CTO a créé `build.sh` et `run.sh`. Vérifie qu'ils fonctionnent sur la machine (Java 17 présente).

### 2. Améliorations demandées
- Modifier `build.sh` pour **télécharger automatiquement JUnit 5** (si absent) dans `lib/`.
- Ajouter une **étape de test automatique** : exécuter les tests unitaires après compilation.
- Créer un **workflow GitHub Actions** qui :
  - Lance le build sur chaque push.
  - Exécute les tests.
  - Publie le JAR en tant qu'artifact (nom `calculatrice.jar`).
- Configurer **Badges** dans le README (build status, version Java).

### 3. Contraintes techniques
- Le JAR doit être exécutable avec `java -jar target/calculatrice.jar`.
- Le script `build.sh` doit fonctionner sur macOS (actuel) et Linux (pour CI).
- Utiliser `curl` ou `wget` pour télécharger JUnit.

### 4. Livrable
- Script `build.sh` amélioré.
- Fichier `.github/workflows/build.yml`.
- README mis à jour avec badges.
- Pull Request vers `main` avec titre `[OPS] CI/CD et amélioration build`.

## Instructions
- Travaille dans ta branche `feature/devops-calculatrice`.
- Utilise le token GitHub (`/Users/worker/gh_token.txt`) pour pousser.
- Annonce ton avancement dans le canal Discord #devops.
- Une fois terminé, notifie le CTO pour review.

## Deadline
A définir par le PO (probablement 2 jours).