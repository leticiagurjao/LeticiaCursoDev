package Lista1;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args){
    System.out.println("informe o total de vendas: ");
        Scanner sc = new Scanner(System.in);
        double totalVendas = sc.nextDouble();
        double comissao = totalVendas *=0.1;
        System.out.println(comissao);
    }
}