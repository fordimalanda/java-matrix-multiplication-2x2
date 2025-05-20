# java-matrix-multiplication-2x2

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
![Project Status](https://img.shields.io/badge/Status-Active-brightgreen)

Un programme Java éducatif pour le calcul du produit de deux matrices 2x2, développé avec une architecture modulaire.

**Auteur** : Fordi Malanda  
**Institution** : Université de Kinshasa, Faculté des Sciences et Technologies, Département Mathématiques, Statistique et Informatiques

## 📦 Structure du Projet
src/
- └── main/
-       └── java/
└── com/
└── fordimalanda/
└── matrix/
├── Matrix.java # Représente une matrice
├── MatrixCalculator.java # Logique de calcul
├── MatrixInputHandler.java # Gestion des entrées
├── MatrixPrinter.java # Affichage des matrices
└── MatrixMultiplicationApp.java # Point d'entrée


## 🚀 Comment Exécuter

### Prérequis
- JDK 17+ installé
- Terminal/Command Prompt

### Compilation et Exécution
```bash
# Compilation
javac src/com/fordimalanda/matrix/*.java

# Exécution
java -cp src com.fordimalanda.matrix.MatrixMultiplicationApp

## 📝 Exemple d'Usage
```
Entrez les valeurs pour la matrice A
Format: ( a1 a2 )
        ( a3 a4 )

Entrez la valeur de a1
5
...
```

## 📊 Fonctionnalités
- [x] Saisie interactive
- [x] Visualisation des matrices
- [x] Calcul précis
- [ ] Extension aux matrices NxM (à venir)

## 📜 License
MIT © [Fordi Malanda](https://github.com/fordimalanda)
