import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 500.25;

        System.out.println("Olá, seja bem-vindo(a) ao banco DIO! ");
        
        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCompletoCliente = input.nextLine();
        
        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = input.nextLine();
        
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = input.nextInt();
        

        // Linha de comando caso o cliente queira adicionar saldo em sua conta. (mesmo não fazendo parte do exercicio, achei legal fazer para exercicitar o que está disponivel na linguagem.)
        
        System.out.println("Deseja realizar um depósito? [s/n] ");
        if(input.next().equalsIgnoreCase("s")) {
            System.out.print("Valor a ser depositado R$");
            double novoSaldo = input.nextDouble();
        

            BigDecimal b1 = new BigDecimal(Double.toString(saldo));
            BigDecimal b2 = BigDecimal.valueOf(novoSaldo);
            System.out.println(b1.add(b2));


            
        System.out.println("Olá " + nomeCompletoCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + b1.add(b2) + " já esta disponível para saque. ");
    }
        else {
            System.out.println("Olá " + nomeCompletoCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já esta disponível para saque. ");
            
        }
        }
        
}



