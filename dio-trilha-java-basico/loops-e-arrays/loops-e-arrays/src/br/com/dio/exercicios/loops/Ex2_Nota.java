package br.com.dio.exercicios.loops;
import java.util.Scanner;
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Digite uma nota de 0 a 10: ");
        nota = sc.nextInt();
        while(nota < 0 || nota > 10) {
                System.out.print("Nota inválida! Digite novamente: ");
                nota = sc.nextInt();
        }
        System.out.println("Nota aceita!");
    }
}
