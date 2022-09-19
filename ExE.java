/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Exercícios;

/**
 *
 * @author igoro
 */
import javax.swing.JOptionPane;

        public class ExE {
    
        public static void main(String[] args) {
        double base , altura , conta ;
    
        base = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a base:  "));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura:  ")); 
        conta = base * altura;       
        JOptionPane.showMessageDialog(null,"O resultado da área do retângulo é:  " + conta);
    

    }

}
