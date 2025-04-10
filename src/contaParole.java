/*
  Conta le parole in una frase. Es:
	Input: "ciao come va?"
	Output: 3
*/
import java.util.Scanner;

public class contaParole {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Per favore inserisci la frase per la qualle vuoi contare le parole!");

        String inputFrase=input.nextLine();
        int numeroParole=contaLeParole(inputFrase);

        System.out.println("La frase inserita è: ");
        System.out.println(inputFrase);
        System.out.println("e ne ha " + numeroParole + " di parole" );

        input.close();
    }

    public static int contaLeParole(String inputStringa){
      int numeroParole=0;
      int stringaLength=inputStringa.length();

      for (int i = 0; i < stringaLength; i++) {
        if ((inputStringa.charAt(i)==' ') || (inputStringa.charAt(i)==',')|| (inputStringa.charAt(i)==';')){
            numeroParole ++ ;
        } 
      }

      numeroParole ++ ;
      return numeroParole;

    }
}
