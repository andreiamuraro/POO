/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

public class Conta {

    private int codigo;
    private int agencia;
    private Data dataAbertura;
    private Cliente titular;
    private double saldo;
    private double calculaRendimento;
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCalculaRendimento() {
        return calculaRendimento;
    }

    public void setCalculaRendimento(double calculaRendimento) {
        this.calculaRendimento = calculaRendimento;
    }

    
    public double saldo() {
        return saldo;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        calculaRendimento = saldo * 0.1;
        return calculaRendimento;

    }

    public String recuperaDadosParaImpressao() {
        String dados = "Titular: " + this.titular.nome;
        dados += "\nNúmero: " + this.codigo;
        dados += "\nAgencia:  " + this.agencia;
        dados += "\nData de Abertura Dia :  " + this.dataAbertura.formatada();
        dados += "\nRendimento:  " + this.calculaRendimento;
        return dados;
    }

}
