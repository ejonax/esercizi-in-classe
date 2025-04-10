/*
Scrivi un programma che:
	- prende in input un numero intero positivo
	- conta quante cifre contiene quel numero
	- stampa il risultato.
	Es:
	Input: 5        → Output: 1
	Input: 123      → Output: 3
	Input: 10000    → Output: 5 
 */

import java.util.Scanner;

public class ciffreInput {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Per favore inserisci un numero positivo intero");

        int inputIntero=input.nextInt();
        int numeroCiffre=contaLeCiffre(inputIntero);

        System.out.println("Il numero inserito è : " + inputIntero + " e ne ha " + numeroCiffre + " ciffre");
 
        input.close();
    }


    public static int contaLeCiffre(int inputInterger){
        int numeroCiffre;

      String intToString=Integer.toString(inputInterger);
      numeroCiffre=intToString.length();
  
        return numeroCiffre;
  
      }
    
}
