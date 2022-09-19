/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Exercícios;

import javax.swing.JOptionPane;

/**
 *
 * @author igoro
 */
public class ExI {

    public static void main(String[] args) {
        
        double idade , ano , ano2 , calc ;
    
        idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade atual:  "));
        ano = Double.parseDouble(JOptionPane.showInputDialog("Digite o ano atual:  "));
        ano2 = 2100;
        calc = ano2 - ano + idade;
        JOptionPane.showMessageDialog(null,"Resultado:  " + calc);
    
    }
}
