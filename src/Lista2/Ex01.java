package Lista2;

import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args){
        System.out.println("Informe a distância percorrida (em km): ");
        Scanner sc = new Scanner(System.in);
        double distancia = sc.nextDouble();
        System.out.println("Informe a quantidade de combustível necessária para completar o tanque (em litros): ");
        double combustível = sc.nextDouble();
        double consumoMedio = distancia/combustível;
        System.out.println("Consumo médio do veículo é: " + consumoMedio);
    }
}
