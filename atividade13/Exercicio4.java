package atividade13;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.print("Vetor invertido: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        sc.close();
    }
}
