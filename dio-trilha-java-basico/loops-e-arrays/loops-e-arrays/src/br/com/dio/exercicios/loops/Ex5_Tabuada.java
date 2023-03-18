package br.com.dio.exercicios.loops;
import java.util.Scanner;
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* System.out.print("Tabuada: ");
        int tabuada = sc.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++) {
            System.out.println(tabuada + "x" + i + " = " + (tabuada * i));
        }*/

        System.out.print("Tabuada: ");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada de " + tabuada);

        int cont = 0;
        while(cont <= 10) {
            System.out.println(tabuada + "x" + cont + " = " + (tabuada * cont));
            cont++;
        }

    }
}
