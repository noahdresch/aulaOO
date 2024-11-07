/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo;

/**
 *
 * @author Noa
 */
public class vetordez {
    
    public static void main(String[] args) {
        
        // Inicializando o vetor com 10 posições
        int[] vetor = new int[10];
        
        // Solicitando ao usuário que insira os valores no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("");
            vetor[i] = Entrada.leiaInt("Digite o valor para a posição " + i + ": ");
        }
        
        // Encontrando o maior e o menor valor no vetor
        int maior = vetor[0];
        int menor = vetor[0];
        int indiceMaior = 0;
        int indiceMenor = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                indiceMenor = i;
            }
        }
        
        // Imprimindo o maior e o menor valor, juntamente com suas posições no vetor
        System.out.println("O maior valor e " + maior + " na posicao " + indiceMaior);
        System.out.println("O menor valor e " + menor + " na posicao " + indiceMenor);
        
    }
    
}
