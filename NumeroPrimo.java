/*
* 
*@author RIchard Ponick
** **Crie um programa que teste se um número é primo**

*/
public class NumeroPrimo {
    public static void main(String[] args) {
        int num = 2;
        int i=0;
        int resultado=0;
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
               resultado++;
               break;
            }
         }
         
         if (resultado == 0)
           System.out.println("PRIMO");
         else
         System.out.println("NAO PRIMO");
    }
}