/**
 * Crie um programa que armazene um vetor com as notas de dez alunos, 
calcule e imprima a média dessas notas e depois informe a quantidade 
de notas acima e abaixo da média calculada.
 */

package cap1;
import java.util.Scanner;

public class quest3 {
    public static void main(String[] args){
      Scanner scan =  new Scanner(System.in);

      System.out.print("Informe a quantidade de notas a serem digitadas: ");
      int quant = scan.nextInt();
      
      float notas[] = new float[quant];
      int soma = 0;
 
      for (int i = 0; i < notas.length; i++){
        System.out.println("Digite a nota do aluno: ");
        notas[i] = scan.nextFloat();
        soma += notas[i];
      }

      for (int i = 0; i < notas.length; i++){
        System.out.println("Nota do aluno: " + i + " foi " + notas[i]); 
      }
      float media = soma / notas.length;
      int acimaMedia = 0, abaixoMedia = 0;
      for (float f : notas) {
        if(f>=media){
          acimaMedia++;
        } else{
          abaixoMedia++;
        } 
      }
      System.out.println("A média da turma com " + notas.length + " alunos foi " + media + ", quantidade abaixo da media foi "+ abaixoMedia + " e acima é "+ acimaMedia);
    }
}
