/* Fa�a um programa que pe�a uma nota, entre zero e dez.
   Mostre uma mensagem caso o valor seja inv�lidoe continue 
   pedindo at� que o usu�rio informe um valor v�lido.*/

package loops;

import java.util.Scanner;

public class ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inv�lida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
