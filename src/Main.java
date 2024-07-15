import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Digite seu nome completo:");
        conta.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o número da agência:");
        conta.setAgencia(scanner.nextLine());

        System.out.println("Digite o número da conta:");
        conta.setNumero(scanner.nextLine());

        System.out.println("Digite o saldo:");
        conta.setSaldo(new BigDecimal(scanner.nextLine()));

        scanner.close();

        String successMessage = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo R$ %s já está disponível para saque",
                conta.getNomeCliente(),
                conta.getAgencia(),
                conta.getNumero(),
                new DecimalFormat("#,##0.00").format(conta.getSaldo())
        );

        System.out.println(successMessage);
    }
}