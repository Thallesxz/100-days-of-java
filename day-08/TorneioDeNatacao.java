public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome = "Joao";
        int idade = 14;
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