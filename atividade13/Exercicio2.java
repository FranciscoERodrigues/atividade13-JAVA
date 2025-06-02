package atividade13;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {15, 2, 9, 22, 7};
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) maior = vetor[i];
            if (vetor[i] < menor) menor = vetor[i];
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);

        
        sc.close();
    }
}
