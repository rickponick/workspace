/*
*
*@author RIchard Ponick
*4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
*
*/
public class MaiorDobroValor{
    public static void main(String[] args) {
        float valor1=3;
        float valor2=2;
        float totalvalor2=0;
        float totalvalor1=0;
        totalvalor2=valor2*2;
        totalvalor1=valor1*2;
        if (totalvalor1<totalvalor2){
            System.out.println("O valor 2 é maior que o valor 1");
        }else{
            System.out.println("O valor 1 é maior que o valor 2");

        }
    }
}
