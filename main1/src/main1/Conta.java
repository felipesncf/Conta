/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author aluno
 */
public class Conta {
    int numero;
    double saldo;
    double limite;
    String nome;
    


public boolean sacar (double valor){
    if(this.saldo+this.limite>=valor){
     this.saldo = this.saldo - valor;   
     return true;
    }
    else{
        return false;
    }
}

public void deposita (double valor){
    this.saldo = this.saldo + valor;
}
}
