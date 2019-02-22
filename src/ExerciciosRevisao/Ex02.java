package ExerciciosRevisao;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args){
        System.out.println("Informe a quantidade de cópias: ");
        Scanner sc = new Scanner(System.in);
        int totalFolha = sc.nextInt();
        double resultado;
        if (totalFolha <= 100){
            resultado = totalFolha*0.25;
        }else{
            resultado = totalFolha*0.20;
        }
        System.out.println(resultado);
    }
}
