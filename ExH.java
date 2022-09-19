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


public class ExH {
    
    public static void main(String[] args) {
        
        double km , gasolina, conta;
        km = Double.parseDouble(JOptionPane.showInputDialog("Qual foi a distãncia percorrida?  "));
        gasolina = Double.parseDouble(JOptionPane.showInputDialog("Quantos litros de gasolina são gastos por km?  "));
        conta = km / gasolina;
        JOptionPane.showMessageDialog(null, "Seu carro fez por km: " + conta);
        
        
        
        
        
        
    }
    
}
