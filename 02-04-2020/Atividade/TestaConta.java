/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaconta;

public class TestaConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Cliente p1 = new Cliente();
        Data data = new Data( );
        c1.dataAbertura=data;
        
        p1.codigo = 1001;
        p1.cpf = "000.000.000-00";
        p1.nome = "Maria";
        p1.sobrenome = "Silva";

       
        c1.agencia = 1000;
        c1.codigo = 1;
        c1.saldo = 1500;
        c1.titular = p1;
        
        c1.dataAbertura.dia=05;
        c1.dataAbertura.mes=02;
        c1.dataAbertura.ano=2020;
        
        Conta c2 = new Conta();
        Cliente p2 = new Cliente();
        Data data2 = new Data( );
        c2.dataAbertura=data2;
        
        
        c2.agencia = 1000;
        c2.codigo = 1;
        c2.saldo = 1900;
        c2.titular = p2;

        p2.codigo = 1001;
        p2.cpf = "000.000.000-00";
        p2.nome = "João";
        p2.sobrenome = "Silva";

        c2.dataAbertura.dia=10;
        c2.dataAbertura.mes=07;
        c2.dataAbertura.ano=2015;
        
        c1.deposita(300.0);
        System.out.println("Saldo atual:" + c1.saldo);
        System.out.println("Rendimento mensal:" + c1.calculaRendimento());
        System.out.println(c1.recuperaDadosParaImpressao());

        if (c1 == c2) {
            System.out.println("As Contas são Iguais");
        } else {
            System.out.println("As Contas são Diferentes");
        }

    }
}
