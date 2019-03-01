package Vetores;

import java.util.Scanner;

public class Vetor {
    public static void main (String[] args){
        int[] idades = new int[10];

        for(int i = 0; i<idades.length; i++){
            System.out.println("Entre com a idade "+i);
            Scanner sc = new Scanner(System.in);
            idades[i] = sc.nextInt();
        }
        for(int i=0; i<idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}
