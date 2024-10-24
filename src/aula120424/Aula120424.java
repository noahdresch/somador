/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula120424;


/**
 *
 * @author Noa
 */
public class Aula120424 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String nome = Entrada.leiaString();

        // Ler 2 numeros inteiros. Escrever a soma.
        
        int numero1 = Entrada.leiaInt("Digite um numero:");
        int numero2 = Entrada.leiaInt("Digite um numero:");
        
//  int soma = numero1 + numero2; ou opção de baixo (numero1 + numero2) colocar direto ou criar variavel
        System.out.println("Soma:" + (numero1 + numero2));
        
        
        
        
        System.exit(0);
    }

    private static void SystemPrint(int soma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
