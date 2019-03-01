package Lista2;

import java.util.Scanner;

public class Exe02 {
    public static void main (String [] args){
        System.out.println("informe a area da sala em (metros quadrados)");
        Scanner sc = new Scanner(System.in);
        double areaSala = sc.nextDouble();
        System.out.println("preco do metro quadrado do carpete");
        double precoCarpete = sc.nextDouble();
        double precoTotal = areaSala*precoCarpete;
                System.out.println("preco total é:" + precoTotal);
    }

}
