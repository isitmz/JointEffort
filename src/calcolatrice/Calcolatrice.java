package calcolatrice;

public class Calcolatrice {
    private double risultato;

    public Calcolatrice()
    {
        this.risultato = 0;
    }

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

    public double getRisultato()
    {
        return risultato;
    }
}
