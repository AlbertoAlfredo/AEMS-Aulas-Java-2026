import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.printf("Olá, %s! Seja bem-vindo ao Java.\n", nome);

        scan.close();
    }
}