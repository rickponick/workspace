/*
*
*@author RIchard Ponick
*
12) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
Base                     | Alíquota
---------                | ------
Até 1.903,98             | Isento
De 1.903,99 até 2.826,65 | 7,5%
De 2.826,66 até 3.751,05 | 15%
De 3.751,06 até 4.664,68 | 22,5%
Acima de 4.664,68        | 27,5%
*/
public class Salario{
    public static void main(String[] args) {
        double salario = 1;
            if (salario<=1903.98) {
                System.out.println("Isento");
            } else if (salario>=1903.99 && salario<=2826.65){
                    System.out.println("7,5%");	
                }else if (salario>=2826.66 && salario<=3751.05){
                        System.out.println("15%");	
                    }else if (salario>=3751.06 && salario<=4664.68){
                            System.out.println("22,5%");	
                        }else if (salario>4664.68){
                                System.out.println("27,5%");	
                        }
    }
}