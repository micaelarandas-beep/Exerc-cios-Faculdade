import java.util.Scanner;

public class Exercício11 {

    public static void main(String[] args) {
        System.out.println("Qual a sua idade:");
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        if(idade >= 5 && idade <= 7){
            System.out.println("Sua categoria é InfantilA");
        }else if (idade >= 8 && idade <= 10){
            System.out.println("Sua categoria é InfantilB");
        }else if(idade >= 11 && idade <= 13){
            System.out.println("Sua categoria é JuvenilA");
        }else if (idade >=14 && idade <= 17) {
            System.out.println("Sua categoria é JuvenilB");
        }else if(idade >=18){
            System.out.println("Sua categoria é Sênior");
        }

        
        
    }
}