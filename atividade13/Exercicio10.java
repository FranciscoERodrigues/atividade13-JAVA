package atividade13;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = {1, 2, 3};
        int[] vetorB = {4, 5};
        int[] uniao = new int[vetorA.length + vetorB.length];
        for (int i = 0; i < vetorA.length; i++) uniao[i] = vetorA[i];
        for (int i = 0; i < vetorB.length; i++) uniao[vetorA.length + i] = vetorB[i];
        System.out.println("União: " + Arrays.toString(uniao));

        sc.close();
    }
}
