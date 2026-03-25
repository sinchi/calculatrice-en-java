# Brief Projet Calculatrice Java

## Contexte
Le CTO d'AutoScore Maroc lance un projet side‑project pour entraîner l'équipe à travailler ensemble sur un projet Java simple.

## Objectif
Produire un JAR exécutable `calculatrice.jar` avec une interface CLI interactive.

## Stack
- Java 17+ (présent sur la machine)
- Build via script Bash (pas de Maven requis)
- Tests JUnit 5 (si disponible)
- Packaging JAR standard

## Équipe
- **Product Manager** : backlog, sprint planning, issues GitHub
- **Dev Backend** : implémentation Java (Calculatrice.java, CLI.java)
- **DevOps** : setup build.sh, packaging JAR, CI (optionnel)
- **QA Tester** : tests unitaires, validation du JAR
- **CTO** : orchestration, revue code, merge PR, livraison finale

## Livrables
1. Repo GitHub `sinchi/calculatrice-en-java` (déjà créé)
2. Code source complet dans `src/`
3. Script de build `build.sh` (déjà créé)
4. Tests unitaires dans `src/test/`
5. JAR exécutable `target/calculatrice.jar`
6. README avec instructions

## Contraintes
- Temps : quelques heures maximum
- Qualité : code propre, gestion d'erreurs, tests
- Collaboration : chaque agent travaille sur sa spécialité

## Répartition préliminaire
- **PO** : créer backlog, issues, assigner
- **Dev Backend** : implémenter les opérations + CLI
- **DevOps** : améliorer build.sh, vérifier que `java -jar` fonctionne
- **QA** : écrire tests, valider le JAR
- **CTO** : superviser, merger, build final.

## Token GitHub
Disponible dans `/Users/worker/gh_token.txt`

## Canaux Discord
- #product-manager (1485763697296281751)
- #dev-backend (1485302408681881780)
- #devops (1485760319635718202)
- #qa-tester (1485302480458743881)

## Notes
- Les agents doivent s'annoncer dans leurs canaux respectifs.
- Le CTO suivra l'avancement via les issues GitHub et les messages Discord.
- Deadline : avant minuit (GMT+1).