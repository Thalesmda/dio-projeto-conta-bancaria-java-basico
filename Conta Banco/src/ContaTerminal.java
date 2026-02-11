
/**
 * Classe ContaTerminal
 * 
 * Esta classe representa um programa de terminal para criação de uma conta bancária.
 * O usuário é solicitado a informar o número da conta, agência, nome do cliente e saldo inicial.
 * Após o preenchimento, uma mensagem de confirmação é exibida com os dados informados.
 * 
 * Utiliza a classe Scanner para entrada de dados via console.
 *
 * @author ThalesDev
 * @since 2025
 */


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.next();

        System.out.println("Digite o saldo inicial da conta:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia
                + ", conta " + numeroConta + " e seu saldo é R$ " + saldo + ",  já está disponível para saque.");

    }
}
