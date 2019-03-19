/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Conta conta1 = new Conta();
       conta1.nome = JOptionPane.showInputDialog("Insira o seu nome: ");
       conta1.numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da sua conta: "));
       conta1.limite = Double.parseDouble(JOptionPane.showInputDialog("Insira um limite para sua conta: "));
       conta1.saldo = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da sua conta: "));
       
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Insira a opcao desejada: \nSaque - 1\nDeposito - 2\n"));
        if(opcao==1){
            double valorsaque = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja sacar: "));
            if(conta1.sacar(valorsaque)){
                System.out.println("BOA! Seu novo saldo é: "+conta1.saldo);
            }
            else{
                System.out.println("Lamento, você não pode sacar!");
            }
        }
        if(opcao==2){
            double valordeposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja depositar: "));
            conta1.deposita(valordeposito);
            System.out.println("O novo valor do saldo eh: "+conta1.saldo);
        }
        
        
        
    }
    
}
