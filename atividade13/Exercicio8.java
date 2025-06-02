package atividade13;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = {3, 6, 9, 12, 15};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor a buscar: ");
        int valor = sc.nextInt();
        boolean encontrado = false;

        for (int num : vetor) {
            if (num == valor) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "Valor encontrado." : "Valor não encontrado.");
        
        sc.close();
    }
    
    
}
