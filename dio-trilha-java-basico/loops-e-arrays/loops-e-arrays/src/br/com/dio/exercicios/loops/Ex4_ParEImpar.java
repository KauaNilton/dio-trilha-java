package br.com.dio.exercicios.loops;
import java.util.Scanner;
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros, numero;
        int count = 0;
        int numeros_Impares = 0, numeros_Pares = 0;

        System.out.print("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            if(numero % 2 == 0) numeros_Pares++;
            else numeros_Impares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade de números ímpares: " + numeros_Impares);
        System.out.println("Quantidade de números pares: " + numeros_Pares);

    }
}
