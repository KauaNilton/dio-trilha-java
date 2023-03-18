package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior_Numero = 0;
        double media = 0;
        int soma = 0;

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();
            count++;
            media += numero;
            soma += numero;
            if (numero > maior_Numero) {
                maior_Numero = numero;
            }
        } while (count < 5);

        media /= 5;
        System.out.println("O maior número foi: " + maior_Numero);
        System.out.println("A soma dos números foi: " + soma);
        System.out.println("A media dos números foi: " + media);

    }
}
