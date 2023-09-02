import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner texto = new Scanner(System.in);


        System.out.println("Por favor, digite o número da sua conta");
        int numeroConta = texto.nextInt();
        texto.nextLine();
        
        System.out.println("Por favor, agora digite o número da sua agência");
        String agencia = texto.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = texto.nextLine();

        
        System.out.println("Por favor, digite o seu saldo");
        double saldoConta =  texto.nextDouble();


        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque.";

        System.out.println(mensagem);
        
    }
}
