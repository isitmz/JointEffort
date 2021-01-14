package calcolatrice;

/**
 * La classe calcolatrice permette di effettuare calcoli.
 * Permette di effettuare somma, differenza, prodotto, divisione e resto
 *
 * @author Marius Zaharia
 * @author Mattia Mercadante
 * @author Federico Corni
 * @author Marco Iori
 * @author Francesco Lisitano
 * @version 1.0
 *
 */
public class Calcolatrice {
    private double risultato;

    public Calcolatrice()
    {
        this.risultato = 0;
    }
    
    /**
     * Somma due numeri e conserva il risultato / Svolto da Mattia Mercadante
     * @param num1 il primo numero da sommare
     * @param num2 il secondo numero da sommare
     */
    public double somma(double num1, double num2)
    {
        return num1 + num2;
    }
    
    /**
     * Fa la moltiplicazione tra due numeri e conserva il risultato / Svolto da Lisitano
     * @param num1 il primo numero da moltiplicare
     * @param num2 il secondo numero da moltiplicare
     */

    public double sottrazione(double num1, double num2)
    {
        return num1-num2;
    }

    /**
     * Fa la moltiplicazione tra due numeri e conserva il risultato / Svolto da Marius Zaharia
     * @param num1 il primo numero da moltiplicare
     * @param num2 il secondo numero da moltiplicare
     */
    public double prodotto(double num1, double num2)
    {
        return num1 * num2;
    }

    /**
     * Fa la divisione tra due numeri e conserva il risultato / Svolto da Corni
     * @param num1 il primo numero da dividere
     * @param num2 il secondo numero da dividere
     */

    public double divisione(double num1, double num2)
    {
        return num1 / num2;
    }

    public double modulo(double num1, double num2)
    {
        return 0; //Iori
    }

    /**
     * Esegue il calcolo in base all'operazione / Svolto da Mattia Mercadante e Marius Zaharia
     * @param operazione l'operazione da eseguire
     * @param num1 il primo numero passato dal main
     * @param num2 il secondo numero passato dal main
     */
    public void calcolo(String operazione, double num1, double num2)
    {
        switch (operazione.charAt(0))
        {
            case '+' -> risultato = somma(num1, num2);
            case '-' -> risultato = sottrazione(num1, num2);
            case '*' -> risultato = prodotto(num1, num2);
            case '/' -> risultato = divisione(num1, num2);
            case '%' -> risultato = modulo(num1, num2);
            default -> throw new IllegalStateException("Unexpected value: " + operazione.charAt(0));
        }
    }

    /**
     * Mostra il risultato
     * @return risultato della calcolatrice
     */
    public double getRisultato()
    {
        return risultato;
    }
}
