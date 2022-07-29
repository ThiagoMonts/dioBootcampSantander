/* Faça um programa que peça uma nota, entre zero e dez.
   Mostre uma mensagem caso o valor seja inválidoe continue 
   pedindo até que o usuário informe um valor válido.*/

package loops;

import java.util.Scanner;

public class ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
