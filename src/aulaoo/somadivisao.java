/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo;

/**
 *
 * @author Noa
 */
public class somadivisao {
    
    public static void main(String[] args) {
        
        int a = Entrada.leiaInt("Informe o primeiro valo da soma: ");
        int b = Entrada.leiaInt("Informe o segundo valor da soma: ");
        int c = Entrada.leiaInt("Informe valor para divisao: ");
        
        int resultado = (a + b) / c;
        
        System.out.println("Calculo: " + a + " + " + b + " / " + c + " = " + (a + b) / c);
        
        if (resultado < 10) {
            System.out.println("Seu resultado foi menor que 10.");
        } else {
            System.out.println("Seu resultado foi maior que 10.");
        }
       
    }
    
}
