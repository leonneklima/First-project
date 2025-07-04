public class main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Bem-Vindo ao Java!");

        String nome = "Leonardo";
        int idade = 19;
        double altura = 1.78;
        boolean estudante = true;
        

        System.out.println("\n--- Informações ---");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade + "anos");
        System.out.println("Altura:" + altura + "m");
        System.out.println("É estudante:" + estudante);


        int a = 10;
        int b = 5;

        System.out.println("\n--- Operações ---");
        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));


        if (idade >= 18) {
            System.out.println("\n" + nome + "é maior de idade!");

        } else {
            System.out.println("\n" + nome + "é menor de idade");
        }

        System.out.println("\n--- Contando até 5 ---");
        for(int i =1; i <= 5; i++) {
            System.out.println("Número:" + i);
        }






    }
}
