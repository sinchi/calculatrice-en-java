#!/bin/bash

# Exécute la calculatrice (compile si nécessaire)

set -e

if [ ! -f "target/calculatrice.jar" ]; then
    echo "JAR non trouvé. Lancement du build..."
    ./build.sh
fi

echo "=== Lancement de la calculatrice ==="
java -jar target/calculatrice.jar