/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo;

/**
 *
 * @author Noa
 */
public class Fibonacci {
    
    public static void main(String[] args) {
         int quantidade = Entrada.leiaInt( "Quantos numeros voce deseja imprimir? ");
        
        System.out.println("Os " + quantidade + " primeiros numeros da sequencia Fibonacci sao:");
        
        int anterior = 0;
        int atual = 1;
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        
        System.out.println();
    }
    
        
        
    }
}
