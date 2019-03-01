package Lista2;

import java.util.Scanner;

public class Ex03 {
    public static void main (String[] args){
        System.out.println("Informe o peso (em Kg):");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble();
        System.out.println("Informe a altura:");
        double altura = sc.nextDouble();
        double alturaquadrado = altura*altura;
        double imc = peso*alturaquadrado;
        System.out.println("IMC é: "+imc);
    }
}
