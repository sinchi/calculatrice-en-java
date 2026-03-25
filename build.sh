#!/bin/bash

# Build script amélioré pour la calculatrice Java
# Télécharge automatiquement JUnit 5 si absent, exécute les tests, génère un JAR exécutable

set -e

echo "=== Construction de la calculatrice ==="

# Répertoires
SRC_DIR="src/main/java"
TEST_DIR="src/test/java"
CLASS_DIR="target/classes"
TEST_CLASS_DIR="target/test-classes"
JAR_DIR="target/jar"
LIB_DIR="lib"

# Nettoyage
rm -rf target
mkdir -p "$CLASS_DIR" "$TEST_CLASS_DIR" "$JAR_DIR"
mkdir -p "$LIB_DIR"

# Téléchargement de JUnit 5 (si absent)
JUNIT_JAR="$LIB_DIR/junit-platform-console-standalone.jar"
JUNIT_VERSION="1.10.0"
JUNIT_URL="https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/$JUNIT_VERSION/junit-platform-console-standalone-$JUNIT_VERSION.jar"

if [ ! -f "$JUNIT_JAR" ]; then
    echo "Téléchargement de JUnit $JUNIT_VERSION..."
    if command -v curl &> /dev/null; then
        curl -L -o "$JUNIT_JAR" "$JUNIT_URL"
    elif command -v wget &> /dev/null; then
        wget -O "$JUNIT_JAR" "$JUNIT_URL"
    else
        echo "Erreur : ni curl ni wget n'est installé. Impossible de télécharger JUnit."
        echo "Le build continuera sans exécution des tests."
    fi
fi

# Compilation des sources principales
echo "Compilation des sources..."
javac -d "$CLASS_DIR" $(find "$SRC_DIR" -name "*.java")

# Compilation des tests (si JUnit présent)
if [ -f "$JUNIT_JAR" ]; then
    echo "Compilation des tests..."
    javac -d "$TEST_CLASS_DIR" -cp "$CLASS_DIR:$JUNIT_JAR" $(find "$TEST_DIR" -name "*.java")
else
    echo "JUnit non trouvé. Skipping compilation des tests."
fi

# Exécution des tests (si JUnit présent)
if [ -f "$JUNIT_JAR" ] && [ -d "$TEST_CLASS_DIR" ]; then
    echo "Exécution des tests unitaires..."
    java -cp "$TEST_CLASS_DIR:$CLASS_DIR:$JUNIT_JAR" org.junit.platform.console.ConsoleLauncher --scan-classpath --details=summary
    if [ $? -eq 0 ]; then
        echo "✅ Tous les tests ont réussi."
    else
        echo "❌ Certains tests ont échoué. Build interrompu."
        exit 1
    fi
fi

# Création du JAR exécutable
echo "Création du JAR..."
cat > "$JAR_DIR/Manifest.txt" << EOF
Main-Class: com.autoscore.calculatrice.CLI
EOF

jar cfm target/calculatrice.jar "$JAR_DIR/Manifest.txt" -C "$CLASS_DIR" .

echo "✅ Build terminé. JAR disponible : target/calculatrice.jar"
echo "Pour exécuter : java -jar target/calculatrice.jar"