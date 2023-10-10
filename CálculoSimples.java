
package com.mycompany.Exercícios;
import javax.swing.JOptionPane;
public class ExA {
    
    public static void main(String[] args) {       
       
        double primeiroValor , segundoValor, terceiroValor, resultado;
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:  "));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:  "));
        terceiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor:  "));
        resultado = primeiroValor * segundoValor * terceiroValor;
        JOptionPane.showMessageDialog(null,"O resultado da multiplicação é:  " + resultado);
                 
    }
     
}





