# Tâche QA Tester

**Agent** : qa-tester
**Projet** : Calculatrice en Java
**Issue GitHub** : (à créer par le PO)

## Objectif
Garantir la qualité du code et du livrable via des tests et des validations.

## Travail à réaliser

### 1. Vérifier les tests existants
Le CTO a créé `src/test/java/com/autoscore/calculatrice/CalculatriceTest.java`. Vérifie qu'ils passent.

### 2. Améliorations demandées
- Ajouter des **tests d'intégration** pour la CLI (simuler des entrées utilisateur).
- Tester les **cas limites** : nombres négatifs, très grands, division par zéro, saisie invalide.
- Vérifier que le **JAR produit est exécutable** et fonctionne comme attendu.
- Créer un **plan de test** (liste des scénarios) dans un fichier `TEST_PLAN.md`.
- Exécuter les tests sur la machine et sur le workflow CI (une fois mis en place par DevOps).

### 3. Contraintes techniques
- Utiliser JUnit 5 (si disponible).
- Les tests doivent être **indépendants** et **reproductibles**.
- Fournir un **rapport de test** (PASS/FAIL) dans le canal Discord.

### 4. Livrable
- Tests supplémentaires dans `src/test/`.
- Fichier `TEST_PLAN.md`.
- Rapport de test (format libre).
- Pull Request vers `main` avec titre `[QA] Ajout tests intégration et validation`.

## Instructions
- Travaille dans ta branche `feature/qa-calculatrice`.
- Utilise le token GitHub (`/Users/worker/gh_token.txt`) pour pousser.
- Annonce ton avancement dans le canal Discord #qa-tester.
- Une fois terminé, notifie le CTO pour review.

## Deadline
A définir par le PO (probablement 2 jours).