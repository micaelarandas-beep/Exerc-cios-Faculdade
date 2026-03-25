import java.util.Scanner;

public class Exercício13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Qual operação deseja? (somar, subtrair, multiplicar, dividir): ");
        String operacao = scanner.nextLine().toLowerCase(); 

        System.out.println("Coloque o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Coloque o segundo numero: ");
        double n2 = scanner.nextDouble();

        if (operacao.equals("somar")) {
            System.out.println("A soma é: " + (n1 + n2));
        } 
        else if (operacao.equals("subtrair")) {
            System.out.println("A subtração é: " + (n1 - n2));
        } 
        else if (operacao.equals("multiplicar")) {
            System.out.println("A multiplicação é: " + (n1 * n2));
        } 
        else if (operacao.equals("dividir")) {
            if (n2 != 0) {
                System.out.println("A divisão é: " + (n1 / n2));
            } else {
                System.out.println("Erro: Não é possível dividir por zero!");
            }
        } 
        else {
            System.out.println("Operação inválida!");
        }

        scanner.close();
    }
}