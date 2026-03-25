package com.autoscore.calculatrice;

/**
 * Classe Calculatrice fournissant les opérations de base.
 */
public class Calculatrice {

    /**
     * Additionne deux nombres.
     * @param a premier opérande
     * @param b second opérande
     * @return a + b
     */
    public double addition(double a, double b) {
        return a + b;
    }

    /**
     * Soustrait b de a.
     * @param a premier opérande
     * @param b second opérande
     * @return a - b
     */
    public double soustraction(double a, double b) {
        return a - b;
    }

    /**
     * Multiplie deux nombres.
     * @param a premier opérande
     * @param b second opérande
     * @return a * b
     */
    public double multiplication(double a, double b) {
        return a * b;
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
        return a / b;
    }
}