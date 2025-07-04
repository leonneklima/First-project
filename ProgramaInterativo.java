import java.util.Scanner;

public class ProgramaInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("___ CADASTRO PESSOAL___");



        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Você é estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();


        System.out.println("\n___ SUAS INFORMAÇÕES ___");
        System.out.println("Olá " + nome + ", você tem " + idade + " anos" + " e tem "  + altura + "m" + " de altura e " + (estudante ? "sim," : "não,") + " você estuda.");








        
    }
    
}
