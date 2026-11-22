import java.util.Scanner;

public class Torneio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome:");
        String nome = teclado.next();
        System.out.print("Digite o sua idade:");
        int idade = teclado.nextInt();
        System.out.println("A idade digitada foi: " + idade);
        System.out.println("o nome digitado foi: " + nome);

        if (idade <= 10) {
        System.out.println(nome + " categoria infantil");
    } else if (idade >= 11 && idade <= 15) {
        System.out.println(nome + " categoria juvenil");
    } else if (idade >= 16 && idade <= 19) {
        System.out.println(nome + " categoria pre adulto");
    } else {
        System.out.println(nome + " categoria adulto");
    }
}
}
