
import java.util.Scanner;

public class PasswordGenerator{
    public static void main(String[] args) throws Exception {
        //chiedere all'utente e salvare risultato
        Scanner input = new Scanner(System.in);
        //nome
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        //cognome
        System.out.print("Inserisci il tuo cognome: ");
        String cognome = input.nextLine();
        //colore preferito
        System.out.print("Inserisci il tuo colore preferito: ");
        String colore = input.nextLine();
        //giorno di nascita
        System.out.print("Inserisci il tuo giorno di nascita: ");
        int giorno = input.nextInt();
        //mese di nascita
        System.out.print("Inserisci il tuo mese di nascita: ");
        int mese = input.nextInt();
        //anno di nascita
        System.out.print("Inserisci il tuo anno di nascita: ");
        int anno = input.nextInt();
        System.out.println(nome +(" ") +cognome +(" ")+ colore);
        System.out.println(giorno +(" ")+ mese +(" ")+ anno);
        //generare password con nome,cognome,colore e somma della data di nascita concatenati
        int somma = giorno + mese + anno;
        System.out.println(somma);
        //stampare password
        System.out.println("La password generata è : " + nome + cognome + colore + somma);

    }
}
