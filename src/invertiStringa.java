
import java.util.Scanner;


/*  Inverti una stringa. Es:
	Input: "ciao"
	Output: "oaic"
    */

public class invertiStringa {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Per favori inserisci la stringa che vuoi invertire");

        String inputStringa=input.nextLine();
        String outputStringa=invertiLaStringa(inputStringa);
        System.out.println(outputStringa);

        System.out.println("La stringa originale inserita è ale" + inputStringa + " la stringa invertita è " + outputStringa);
        
        input.close();
    }

    public static String invertiLaStringa (String stringaInput){
       String stringaOutput = "";
       int stringaLength=stringaInput.length();
      
      
       for (int i = stringaLength-1; i >= 0 ; i--) {
           stringaOutput = stringaOutput + stringaInput.charAt(i);
       }

       return stringaOutput;

    }

}
