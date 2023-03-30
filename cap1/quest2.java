/**
 * Faça um programa que imprima os trinta primeiros elementos da série 
de Fibonacci. A série é a seguinte: 1, 1, 2, 3, 5, 8,13 etc. Para calculá-la, 
o primeiro e segundo elementos valem 1; daí por diante, cada elemento 
vale a soma dos dois elementos anteriores.
 */

package cap1;

public class quest2 {
    private static int fibo(int i) {
        if (i < 2) {
            return i;
        } else {
            return fibo(i - 1) + fibo(i - 2);
        }
    }
    public static void main(String[] args){
        int i;
        for(i = 0; i < 30; i++){
            System.out.print(fibo(i)+ "-");
        }
    }

}

