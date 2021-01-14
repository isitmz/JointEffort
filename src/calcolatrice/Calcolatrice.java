package calcolatrice;

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
    public void somma(double num1, double num2)
    {
        risultato = num1 + num2;
    }

    public void sottrazione(double num1, double num2)
    {
        //Lisitano
    }

    public void prodotto(double num1, double num2)
    {
        risultato = num1 * num2;
    }

    public void divisione(double num1, double num2)
    {
        //Corni
    }

    public void modulo(double num1, double num2)
    {
        //Iori
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
            case '+' -> somma(num1, num2);
            case '-' -> sottrazione(num1, num2);
            case '*' -> prodotto(num1, num2);
            case '/' -> divisione(num1, num2);
            case '%' -> modulo(num1, num2);
            default -> throw new IllegalStateException("Unexpected value: " + operazione.charAt(0));
        }
    }
    
    public double getRisultato()
    {
        return risultato;
    }
}
