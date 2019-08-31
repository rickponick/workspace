/*
*
*@author RIchard Ponick
*
10) Crie um programa que compare dois valores Strings
*/

public class ComparaString {
    public static void main(String[] args) {

        String str1 = "teste";
        String str2 = "Oteste".substring(1);
        if(str1 == str2) {
            System.out.println("1 igual a 2");
        }
        else {
            System.out.println("1 diferente de 2");
        }
    }
}