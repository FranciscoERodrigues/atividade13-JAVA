package atividade13;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {8, 4, 10, 1, 5};
        Arrays.sort(vetor);

        System.out.println("Ordenado: " + Arrays.toString(vetor));
        
        sc.close();
    }
    
    
}
