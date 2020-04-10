/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

public class Conta {

    int codigo;
    int agencia;
    Data dataAbertura;
    Cliente titular;
    double saldo;
    private double calculaRendimento;

    double saldo() {
        return saldo;
    }

    void saca(double valor) {
            this.saldo -= valor;
        }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        calculaRendimento = saldo * 0.1;
        return calculaRendimento;

    }

    String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular.nome;
        dados += "\nNúmero: " + this.codigo;
        dados += "\nAgencia:  " + this.agencia;
        dados += "\nData de Abertura Dia :  " + this.dataAbertura.formatada();
        dados += "\nRendimento:  " + this.calculaRendimento;
        return dados;
    }

}
