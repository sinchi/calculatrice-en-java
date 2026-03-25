#!/bin/bash

# Build script pour la calculatrice Java
# Utilise javac et jar (Java 17+ requis)

set -e

echo "=== Construction de la calculatrice ==="

# Répertoires
SRC_DIR="src/main/java"
TEST_DIR="src/test/java"
CLASS_DIR="target/classes"
TEST_CLASS_DIR="target/test-classes"
JAR_DIR="target/jar"

# Nettoyage
rm -rf target
mkdir -p "$CLASS_DIR" "$TEST_CLASS_DIR" "$JAR_DIR"

# Compilation des sources principales
echo "Compilation des sources..."
javac -d "$CLASS_DIR" $(find "$SRC_DIR" -name "*.java")

# Compilation des tests (nécessite JUnit dans le classpath)
# Si JUnit n'est pas installé, on saute cette étape
if [ -f "lib/junit-platform-console-standalone.jar" ]; then
    echo "Compilation des tests..."
    javac -d "$TEST_CLASS_DIR" -cp "$CLASS_DIR:lib/junit-platform-console-standalone.jar" $(find "$TEST_DIR" -name "*.java")
else
    echo "JUnit non trouvé dans lib/. Skipping compilation des tests."
fi

# Création du JAR exécutable
echo "Création du JAR..."
cat > "$JAR_DIR/Manifest.txt" << EOF
Main-Class: com.autoscore.calculatrice.CLI
EOF

jar cfm target/calculatrice.jar "$JAR_DIR/Manifest.txt" -C "$CLASS_DIR" .

echo "✅ Build terminé. JAR disponible : target/calculatrice.jar"
echo "Pour exécuter : java -jar target/calculatrice.jar"