package atividade13;

import java.util.HashMap;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = {2, 3, 2, 4, 3, 3, 5};
        HashMap<Integer, Integer> frequencia = new HashMap<>();

        for (int num : vetor) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }

        for (int chave : frequencia.keySet()) {
            System.out.println(chave + " aparece " + frequencia.get(chave) + " vezes");
        }
        sc.close();
    }
}
