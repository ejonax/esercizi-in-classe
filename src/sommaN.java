
import java.util.Scanner;

/*  Somma dei primi n numeri. Es:
	Input: n
	Output: somma da 1 a n.
*/


public class sommaN {
    public static void main(String[] args) throws Exception {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci il numero N.");

        int inputNumber=input.nextInt();
        int somma= sommaDiN(inputNumber);

        if (inputNumber<=0){
            System.out.println("Per favore inserisci un numero maggiore di 0");
        }
        else {
            System.out.println("La somma da 1 a " + inputNumber + " uguale a " + somma);
        }    
        
        input.close();
    }
        
    public static int sommaDiN (int n){
        int sommaN=0;
        for (int i=1; i<=n; i++) {
            sommaN= sommaN + i;
        }
        return sommaN;
    }
   


}
