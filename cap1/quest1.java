/**
 * Faça um programa que dada a idade de uma pessoa verifique sua classe 
eleitoral:
•	 menor que 16 anos não pode votar;
•	 com 16 ou 17 anos ou mais que 65 anos, votar é facultativo;
•	 entre 18 e 65 anos (inclusive), votar é obrigatório. */ 

package cap1;
import java.util.Scanner;

public class quest1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Fale a idade: ");
        int idade = scan.nextInt();
        if(idade<=16){
            System.out.println("Não pode votar");
        }else if (idade>=18 && idade <=65){
            System.out.println("Votar é obrigatório");
        } else{
            System.out.println("Votar é facultativo");
        }
    }
}