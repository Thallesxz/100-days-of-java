public class Calculadora {
    public static void main(String[] args) {
        double salario = 3000;
        double porcentagem = 20;

        double resultado = (porcentagem / 100) * salario;

        System.out.printf("%.0f%% de R$ %.2f = R$ %.2f%n", porcentagem, salario, resultado);

    }
}