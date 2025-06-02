package atividade13;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {4, 7, 10, 13, 2};
        int pares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) pares++;
        }
        System.out.println("Quantidade de pares: " + pares);

        
        sc.close();
    }
    
    
}
