/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercícios;

import javax.swing.JOptionPane;

/**
 *
 * @author igoro
 */
public class ExA {
    
    public static void main(String[] args) {       
        //System.out.println("Hello World!");
        //String valor = "2";
        //String valor1 = "2";
        
        double primeiroValor , segundoValor, terceiroValor, resultado;
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:  "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:  "));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor:  "));
        resultado = primeiroValor * segundoValor * terceiroValor;
        JOptionPane.showMessageDialog(null,"O resultado da multiplicação é:  " + resultado);
        
        
                
    }
    
    
}





