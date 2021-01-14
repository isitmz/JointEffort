package calcolatrice;
import java.util.Scanner;

/**
 * La classe Main contiene il metodo main
 */
public class Main {
    public static void main(String[] args) {
        Calcolatrice c = new Calcolatrice();
        Scanner stringInput = new Scanner(System.in);
        Scanner doubleInput = new Scanner(System.in);
        String risposta, operazione;
        double n1, n2;

        do {
            System.out.println("Inserisci il primo numero: ");
            n1 = doubleInput.nextDouble();
            System.out.println("Inserisci il secondo numero: ");
            n2 = doubleInput.nextDouble();
            do {
                System.out.println("Operazione: +, -, *, /: ");
                operazione = stringInput.nextLine();
            } while(operazione.charAt(0) != '+' && operazione.charAt(0) != '-' && operazione.charAt(0) != '*' && operazione.charAt(0) != '/' && operazione.charAt(0) != '%');

            c.calcolo(operazione, n1, n2);

            System.out.println("Risultato: " + c.getRisultato());
            do {
                do {
                    System.out.println("\nDesideri continuare[s/n] o ricominciare [r]?: ");
                    risposta = stringInput.nextLine();
                } while (risposta.charAt(0) != 's' && risposta.charAt(0) != 'n' && risposta.charAt(0) != 'r');
                switch (risposta.charAt(0))
                {
                    case 'S', 's' ->{
                        System.out.println("Inserisci il numero: ");
                        n2 = doubleInput.nextDouble();
                        do {
                            System.out.println("Operazione: +, -, *, /: ");
                            operazione = stringInput.nextLine();
                        } while(operazione.charAt(0) != '+' && operazione.charAt(0) != '-' && operazione.charAt(0) != '*' && operazione.charAt(0) != '/' && operazione.charAt(0) != '%');
                        c.calcolo(operazione, c.getRisultato(), n2);
                        System.out.println("Risultato: " + c.getRisultato());
                    }
                    case 'N', 'n', 'R', 'r' ->{
                    }
                    default -> throw new IllegalStateException("Unexpected value: " + risposta.charAt(0));
                }
            } while (risposta.charAt(0) == 's');

        } while (risposta.charAt(0) == 'r');
    }
}