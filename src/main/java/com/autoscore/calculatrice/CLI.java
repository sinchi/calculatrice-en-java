package com.autoscore.calculatrice;

import java.util.Scanner;
import java.util.List;

/**
 * Interface en ligne de commande pour la calculatrice.
 */
public class CLI {

    private final Calculatrice calculatrice;
    private final Scanner scanner;
    private int precisionDecimale = 2;

    public CLI() {
        this.calculatrice = new Calculatrice();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Affiche le menu principal.
     */
    public void afficherMenu() {
        System.out.println("\n=== CALCULATRICE AUTO-SCORE ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo (entiers)");
        System.out.println("6. Afficher l'historique");
        System.out.println("7. Définir la précision décimale (actuelle: " + precisionDecimale + ")");
        System.out.println("8. Quitter");
        System.out.print("Votre choix : ");
    }

    /**
     * Lit un nombre depuis l'entrée standard.
     * @param message message d'invite
     * @return le nombre saisi
     */
    private double lireNombre(String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Veuillez saisir un nombre valide : ");
            scanner.next(); // consomme l'entrée invalide
        }
        return scanner.nextDouble();
    }

    /**
     * Lit un entier depuis l'entrée standard.
     * @param message message d'invite
     * @return l'entier saisi
     */
    private int lireEntier(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Veuillez saisir un entier valide : ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    /**
     * Exécute une opération en fonction du choix.
     * @param choix numéro d'opération (1-5)
     */
    private void executerOperation(int choix) {
        double a = 0, b = 0;
        int aInt = 0, bInt = 0;
        double resultat = 0;
        int resultatInt = 0;
        String operation = "";
        boolean estModulo = (choix == 5);

        if (!estModulo) {
            a = lireNombre("Premier nombre : ");
            b = lireNombre("Second nombre : ");
        } else {
            aInt = lireEntier("Premier entier : ");
            bInt = lireEntier("Second entier : ");
        }

        try {
            switch (choix) {
                case 1:
                    resultat = calculatrice.addition(a, b);
                    operation = "+";
                    break;
                case 2:
                    resultat = calculatrice.soustraction(a, b);
                    operation = "-";
                    break;
                case 3:
                    resultat = calculatrice.multiplication(a, b);
                    operation = "*";
                    break;
                case 4:
                    resultat = calculatrice.division(a, b);
                    operation = "/";
                    break;
                case 5:
                    resultatInt = calculatrice.modulo(aInt, bInt);
                    operation = "%";
                    break;
                default:
                    return;
            }

            if (estModulo) {
                System.out.printf("%d %s %d = %d%n", aInt, operation, bInt, resultatInt);
            } else {
                String format = "%." + precisionDecimale + "f";
                System.out.printf(format + " %s " + format + " = " + format + "%n",
                        a, operation, b, resultat);
            }
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    /**
     * Affiche l'historique des opérations.
     */
    private void afficherHistorique() {
        List<String> hist = calculatrice.getHistorique();
        if (hist.isEmpty()) {
            System.out.println("Historique vide.");
        } else {
            System.out.println("=== Historique (5 dernières opérations) ===");
            for (String op : hist) {
                System.out.println(op);
            }
        }
    }

    /**
     * Définit la précision décimale pour l'affichage.
     */
    private void definirPrecision() {
        int p = lireEntier("Nouvelle précision décimale (0-10) : ");
        if (p < 0 || p > 10) {
            System.out.println("La précision doit être entre 0 et 10.");
        } else {
            precisionDecimale = p;
            System.out.println("Précision définie à " + p + " décimales.");
        }
    }

    /**
     * Lance la boucle interactive.
     */
    public void run() {
        System.out.println("Bienvenue dans la calculatrice AutoScore !");
        int choix;
        do {
            afficherMenu();
            while (!scanner.hasNextInt()) {
                System.out.print("Choix invalide. Votre choix (1-8) : ");
                scanner.next();
            }
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    executerOperation(choix);
                    break;
                case 6:
                    afficherHistorique();
                    break;
                case 7:
                    definirPrecision();
                    break;
                case 8:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 8.");
            }
        } while (choix != 8);
        scanner.close();
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.run();
    }
}