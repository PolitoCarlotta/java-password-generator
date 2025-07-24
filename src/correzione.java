
import java.util.Scanner;

public class correzione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome, cognome, colore preferito e data di nascita(divisa in giorno,mese e anno) per generare una password");

        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String cognome = input.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = input.nextLine();

        System.out.print("Inserisci il giorno di nascita: ");
        int giorno = input.nextInt();

        System.out.print("Inserisci il mese di nascita: ");
        int mese = input.nextInt();

        System.out.print("Inserisci l'anno di nascita: ");
        int anno = input.nextInt();

        int somma = giorno + mese + anno;

        String password = nome + "-" + cognome + "-" + colore + "-" + somma;
        System.err.println("la password generata è: " + password);
    }
}
