import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    

        Scanner  scanner = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario:");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Digite sua Agencia: ");
        String agencia =  scanner.nextLine();

        System.out.print("Digite seu Numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        double saldo = 237.48;

    
        System.out.println("Olá " + nomeCliente +  ", obrigado por  criar umma conta em nosso  banco, sua  agência  é " + agencia + ", conta \n" +  + numero + " e seu saldo " + saldo + " já  esta  disponivel para sacar" );
    
 }
    
}
