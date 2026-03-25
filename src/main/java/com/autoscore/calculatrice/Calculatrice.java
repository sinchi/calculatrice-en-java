package com.autoscore.calculatrice;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Calculatrice fournissant les opérations de base.
 */
public class Calculatrice {

    private final List<String> historique = new ArrayList<>();

    /**
     * Additionne deux nombres.
     * @param a premier opérande
     * @param b second opérande
     * @return a + b
     */
    public double addition(double a, double b) {
        double result = a + b;
        ajouterHistorique(String.format("%.2f + %.2f = %.2f", a, b, result));
        return result;
    }

    /**
     * Soustrait b de a.
     * @param a premier opérande
     * @param b second opérande
     * @return a - b
     */
    public double soustraction(double a, double b) {
        double result = a - b;
        ajouterHistorique(String.format("%.2f - %.2f = %.2f", a, b, result));
        return result;
    }

    /**
     * Multiplie deux nombres.
     * @param a premier opérande
     * @param b second opérande
     * @return a * b
     */
    public double multiplication(double a, double b) {
        double result = a * b;
        ajouterHistorique(String.format("%.2f * %.2f = %.2f", a, b, result));
        return result;
    }

    /**
     * Divise a par b.
     * @param a dividende
     * @param b diviseur (ne doit pas être zéro)
     * @return a / b
     * @throws ArithmeticException si b == 0
     */
    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro interdite.");
        }
        double result = a / b;
        ajouterHistorique(String.format("%.2f / %.2f = %.2f", a, b, result));
        return result;
    }

    /**
     * Calcule a modulo b (reste de la division entière).
     * @param a dividende
     * @param b diviseur (ne doit pas être zéro)
     * @return a % b
     * @throws ArithmeticException si b == 0
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro interdite.");
        }
        int result = a % b;
        ajouterHistorique(String.format("%d %% %d = %d", a, b, result));
        return result;
    }

    /**
     * Ajoute une opération à l'historique (limité à 5 entrées).
     * @param operation chaîne décrivant l'opération
     */
    public void ajouterHistorique(String operation) {
        historique.add(operation);
        if (historique.size() > 5) {
            historique.remove(0);
        }
    }

    /**
     * Retourne une copie de l'historique des opérations.
     * @return liste des 5 dernières opérations (la plus récente en dernier)
     */
    public List<String> getHistorique() {
        return new ArrayList<>(historique);
    }
}