package atividade13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        
        int[] vetor = {1, 3, 2, 3, 4, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a remover: ");
        int remover = sc.nextInt();

        ArrayList<Integer> novoVetor = new ArrayList<>();
        for (int num : vetor) {
            if (num != remover) novoVetor.add(num);
        }

        System.out.println("Vetor após remoção: " + novoVetor);
        
        sc.close();
    }
}
