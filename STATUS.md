# 📊 État d'avancement – Calculatrice Java

**Dernière mise à jour** : 2026‑03‑25 22:50 GMT+1  
**Repo** : https://github.com/sinchi/calculatrice-en-java  
**Branche active** : `feature/dev-backend-v2`

## 🎯 Objectif
Produire un JAR exécutable `calculatrice.jar` avec une interface CLI interactive.

## 🔧 Migration des modèles
✅ **Tous les agents du pôle tech** migrés vers `ollama‑windows/qwen3.5:latest` (12 agents).  
Les agents marketing conservent leurs modèles actuels.

## 📋 Progression séquentielle

| Phase | Agent | Tâche | Statut | Temps | Tokens |
|-------|-------|-------|--------|-------|---------|
| 1 | Dev Backend | Edit atomique `Calculatrice.java` (ajout modulo, historique) | ✅ **Terminé** | 1m02s | 27,9k |
| 2 | Dev Backend | Edit atomique `CLI.java` (menu étendu, précision décimale) | ✅ **Terminé** | 1m00s | ~16k |
| 3 | DevOps | Amélioration `build.sh` (téléchargement JUnit, CI) | ✅ **Terminé** | 31s | ~13k |
| 4 | QA Tester | Tests d'intégration, validation JAR | ⏳ **En cours** | (début 22h50) | |
| 5 | CTO | Commit, push, PR, merge, build final | 🕒 **En attente** | | |

## 📁 Fichiers modifiés
- `src/main/java/com/autoscore/calculatrice/Calculatrice.java` → ✅ **modifié**
- `src/main/java/com/autoscore/calculatrice/CLI.java` → ✅ **modifié**
- `build.sh` → ✅ **modifié**
- `QA_REPORT.md` → ⏳ **en cours**

## 🚀 Prochaines étapes
1. Fin de l'édition CLI.java (quelques minutes).
2. Lancement de DevOps avec une commande atomique pour améliorer `build.sh`.
3. Lancement de QA avec une commande atomique pour exécuter les tests.
4. Commit, push, création PR.
5. Merge, build final, livraison du JAR.

## 📈 Mesures de performance
- **Dev Backend (qwen3.5:latest)** : capable d'exécuter un `edit` atomique complexe (≈1min, 28k tokens).
- **Limite précédente** : qwen2.5‑coder:14b échouait à enchaîner read → edit (maxTokens 8000 possiblement trop faible).
- **Solution** : migration vers qwen3.5 pour tous les agents tech.

## 🔗 Liens
- **Repo GitHub** : https://github.com/sinchi/calculatrice-en-java
- **Issues** : [#1](https://github.com/sinchi/calculatrice-en-java/issues/1), [#2](https://github.com/sinchi/calculatrice-en-java/issues/2), [#3](https://github.com/sinchi/calculatrice-en-java/issues/3)

---

**Suivi** : Le CTO met à jour ce fichier après chaque phase.