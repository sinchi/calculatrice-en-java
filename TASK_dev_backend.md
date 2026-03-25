# Tâche Dev Backend

**Agent** : dev-backend
**Projet** : Calculatrice en Java
**Issue GitHub** : (à créer par le PO)

## Objectif
Implémenter la logique de la calculatrice et l'interface CLI.

## Travail à réaliser

### 1. Vérifier le code existant
Le CTO a déjà créé :
- `src/main/java/com/autoscore/calculatrice/Calculatrice.java` (opérations de base)
- `src/main/java/com/autoscore/calculatrice/CLI.java` (interface interactive)

### 2. Améliorations demandées
- Ajouter une opération **modulo** (`%`) pour les entiers.
- Gérer les erreurs de saisie (lettres au lieu de nombres) de manière robuste.
- Ajouter une **historique des 5 dernières opérations** (affichage en fin de session).
- Permettre de **choisir la précision décimale** (nombre de décimales affichées).

### 3. Contraintes techniques
- Respecter les principes SOLID.
- Écrire des commentaires Javadoc pour chaque méthode ajoutée.
- Ne pas casser les tests existants (s'ils existent).

### 4. Livrable
- Code source modifié dans le repo GitHub.
- Pull Request vers `main` avec titre `[DEV] Ajout modulo, historique, gestion erreurs`.

## Instructions
- Travaille dans ta branche `feature/dev-backend-calculatrice`.
- Utilise le token GitHub (`/Users/worker/gh_token.txt`) pour pousser.
- Annonce ton avancement dans le canal Discord #dev-backend.
- Une fois terminé, notifie le CTO pour review.

## Deadline
A définir par le PO (probablement 2 jours).