/**
 * Faça um programa que fique em laço solicitando a digitação de números 
inteiros maiores ou iguais a zero. Quando o usuário digitar um número 
menor que zero, o programa deve exibir a quantidade de números digitados e a média desses números.
 */

package cap1;
import java.util.Scanner;

public class quest4 {
     public static void main(String[] args) {
        int resp;
        int cont = 0;
        int soma = 0;
        do { 
            System.out.print("\nDigite um numero inteiro: ");
            Scanner scan =  new Scanner(System.in);
            resp = scan.nextInt();
            if(resp > 0) {
                cont++;
                soma += resp;
 
            }
        } while (resp > 0); 
        System.out.println(cont);
        System.out.println("A média é: " + soma/(double)cont);
    }
}
