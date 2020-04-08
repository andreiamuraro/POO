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
        
        p1.codigo = 1001;
        p1.cpf = "000.000.000-00";
        p1.nome = "José";
        p1.sobrenome = "Silva";
        
        c1.codigo = 1;
        c1.saldo = 1000;
        c1.titular = p1;
        
        System.out.println("Cliente: " + c1.titular.nome + " Saldo: " + c1.saldo); 
        
        Conta c2 = new Conta();
        
        c2.codigo = 2;
        c2.saldo = 200;
        c2.titular = new Cliente();
        
        c2.titular.codigo =  2002;
        c2.titular.nome = "Maria";
        c2.titular.sobrenome = "Sauro";
        c2.titular.cpf = "111.111.111-11";
        
        System.out.println("Cliente: " + c2.titular.nome + " Saldo: " + c2.saldo); 
        
        Conta c3 = new Conta();
        
        c3.codigo = 3;
        c3.saldo = 3000;
        
        System.out.println("Cliente: " + c3.titular.nome + " Saldo: " + c3.saldo);
    }
    
}
