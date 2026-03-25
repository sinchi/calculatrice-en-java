package com.autoscore.calculatrice;

import java.util.Scanner;

/**
 * Interface en ligne de commande pour la calculatrice.
 */
public class CLI {

    private final Calculatrice calculatrice;
    private final Scanner scanner;

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
        System.out.println("5. Quitter");
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
     * Exécute une opération en fonction du choix.
     * @param choix numéro d'opération (1-4)
     */
    private void executerOperation(int choix) {
        double a = lireNombre("Premier nombre : ");
        double b = lireNombre("Second nombre : ");
        double resultat = 0;
        String operation = "";

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
                default:
                    return;
            }
            System.out.printf("%.2f %s %.2f = %.2f%n", a, operation, b, resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
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
                System.out.print("Choix invalide. Votre choix (1-5) : ");
                scanner.next();
            }
            choix = scanner.nextInt();
            if (choix >= 1 && choix <= 4) {
                executerOperation(choix);
            } else if (choix != 5) {
                System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 5.");
            }
        } while (choix != 5);
        System.out.println("Au revoir !");
        scanner.close();
    }

    public static void main(String[] args) {
        CLI cli = new CLI();
        cli.run();
    }
}