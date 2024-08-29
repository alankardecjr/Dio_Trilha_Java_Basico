//TODO: Conhecer e importar a classe scanner
//Exibir as mensagens para o usuario
//Obter pelo scanner os valores digitados no terminal
//Exibir a mensagem "conta criada com sucesso"

//Importando o pacote Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Criando o codigo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Menssagem de entrada
        System.out.println("---------------------------------------");
        System.out.println("|*Seja bem vindo ao terminal do Banco*|");
        System.out.println("| ***Por favor insira seus dados***   |");
        System.out.println("---------------------------------------");
        System.out.println(" ");

        //Coletando os dados do usuario
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo a ser depositado: ");
        int saldo = scanner.nextInt();


        System.out.println(" ");
        System.out.println("--------------------------------");
        System.out.println("*Operação realizada com sucesso*");
        System.out.println("--------------------------------");
        System.out.println(" ");
        System.out.println("Olá " + nome + " obrigado por acessar nosso terminal,foi depositado o valaor de: " + saldo + " R$ " + " na agência: " + agencia + " ,conta: " + conta);        
        System.out.println(" ");
        
        
    }
}
