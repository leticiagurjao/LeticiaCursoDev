package Lista1;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args){
        System.out.println("Informe o salario");
        Scanner sc = new Scanner(System.in);
                double salario = sc.nextDouble();
        System.out.println("Informe o reajuste (ex 15% = 0,15)");
        double reajuste = sc.nextDouble();
        double reajusteSalario = salario*reajuste;

        System.out.println("Reajustado do salario é :" + reajusteSalario);
        double salarioReajuste = salario+reajusteSalario;
        System.out.println("salario reajustado é:"+ salarioReajuste);

    }

}
