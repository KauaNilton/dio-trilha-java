import java.util.Scanner;

public class Contador {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = sc.nextInt();
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = sc.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.err.println("ERRO: O segundo parâmetro deve ser maior que o primeiro");
            }

        }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
            if (parametroUm > parametroDois) {
               throw new ParametrosInvalidosException();
            }

            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
}
