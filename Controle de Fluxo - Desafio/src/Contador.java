import java.util.Scanner;  // Importação correta da classe Scanner

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Instanciando o objeto Scanner
        
        System.out.println("Digite o primeiro parametro: ");
        int parametroUM = scanner.nextInt();  // Lendo o primeiro número inteiro

        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();  // Lendo o segundo número inteiro

        try {
            contar(parametroUM, parametroDois);  // Chama o método para contar
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());  // Imprime a mensagem da exceção
        }
    }

    static void contar(int parametroUM, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUM > parametroDois) {  // Verifica se o primeiro parâmetro é maior
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUM;  // Calcula a quantidade de iterações

        for (int i = 1; i <= contagem; i++) {  // Laço de repetição para imprimir os números
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
