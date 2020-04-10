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
        data.dia =05;
        data.mes=02;
        data.ano=2020;
        
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
        data.dia=10;
        data.mes=07;
        data.ano=2015;
        
        Conta c3 = new Conta();
        Cliente p3 = new Cliente();
        Data data3 = new Data( );
        c3.dataAbertura=data3;
       
        c3.agencia = 1000;
        c3.codigo = 1;
        c3.saldo = 200.000;
        c3.titular = p2;
        p3.codigo = 1001;
        p3.cpf = "000.000.000-00";
        p3.nome = "João";
        p3.sobrenome = "Silva";
        data.dia=03;
        data.mes=04;
        data.ano=2012;
       
        c3 = c2;
       
        
        c1.deposita(300.0);
        System.out.println("Saldo atual:" + c1.saldo);
        c1.saca(150.00);
        System.out.println("Rendimento mensal:" + c1.calculaRendimento());
        System.out.println(c1.recuperaDadosParaImpressao());
        
       

        if (c3 == c2) {
            System.out.println("As Contas são Iguais");
        } else {
            System.out.println("As Contas são Diferentes");
        }

    }
}
