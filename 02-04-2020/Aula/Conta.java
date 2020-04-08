/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

public class Conta {
   int codigo;
    Cliente titular;
    double saldo;
    
    boolean saca(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        
        return false;
    }
    
    void deposita(double valor) {
        this.saldo += valor; // é a mesma coisa que this.saldo = this.salvo + valor;
    }
    
    boolean transfere(Conta destino, double valor) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        
        return false;  
    }
}