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

public class ExD {
    
    public static void main(String[] args) {
        
    double salarioBruto, conta , conta2 , salarioLiquido;
    salarioBruto = Double.parseDouble(JOptionPane.showInputDialog(null,"digite seu salário bruto:  "));
    conta = (salarioBruto * 5)/100;
    conta2 = (salarioBruto - ((salarioBruto * 7)/100)) ;
    salarioLiquido = conta2 + conta;
    JOptionPane.showMessageDialog(null,"Aqui está seu salário líquido:   " + salarioLiquido);
    
    
    
    }
    
}
