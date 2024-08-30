//Importando o pacote Scanner
import java.util.Locale;
import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) throws Exception {
        
        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldoInicial = 48.0;

        //Menssagem de entrada
        System.out.println(" ");
        System.out.println("+-------------------------------------+");
        System.out.println("|*Seja bem vindo ao terminal do Banco*|");
        System.out.println("| ***Por favor insira seus dados***   |");
        System.out.println("+-------------------------------------+");
        System.out.println(" ");

        //Coletando os dados do usuario
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo a ser depositado: ");
        double saldoDepositado = scanner.nextDouble();

        double saldo = (saldoInicial + saldoDepositado);
        
        System.out.println(" ");
        System.out.println("+------------------------------------+");
        System.out.println("|***Operação realizada com sucesso***|");
        System.out.println("+------------------------------------+");
        System.out.println(" ");
        System.out.println("Olá " + nome + ", seu saldo é: " + saldo + " R$" + " agência: " + agencia + " conta: " + conta); 
        System.out.println(" ");       
        System.out.println("+-------------------------------------+");
        System.out.println("|***** Agradecemos a preferencia *****|");
        System.out.println("+-------------------------------------+");
        System.out.println(" ");
        System.out.println(" ");
        
    }

}