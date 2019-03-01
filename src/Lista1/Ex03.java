package Lista1;

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args){
        System.out.println("Informe o comprimento (em metros): ");
        Scanner sc = new Scanner(System.in);
        double comprimento = sc.nextDouble();
        System.out.println("Informe a largura (em metros): ");
        double largura = sc.nextDouble();
        double medida = comprimento*largura;
        System.out.println("A área da sala é "+medida+ "m²");
    }
}
