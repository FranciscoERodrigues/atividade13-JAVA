package atividade13;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {2, 5, 7, 10, 3};
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println("Soma dos elementos: " + soma);

        sc.close();
    }
    
   
}
