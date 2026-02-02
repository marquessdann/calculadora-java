import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- Calculadora Java ---");
        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        double resultado;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        leitor.close();
        System.out.println("------------------------");
    }
}