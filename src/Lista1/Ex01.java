package Lista1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
      System.out.println("Informe o número: ");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        double dobro = numero*2;
        System.out.println("O dobro do número é: "+dobro);

    }
}
