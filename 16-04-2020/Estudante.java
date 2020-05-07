/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;


public class Estudante {
    
    private final  int codigo;
    private final  String nome;
    private Data dataNasc;
    private double notMat;
    private double notPort;
    private double notCien;
    private double media;

    public Estudante(int cod, String nome) {
        this.codigo = cod;
        this.nome = nome;
    }

    

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNotas() {
        return "Matematica:" + notMat + " Portugues:" + notPort + " Ciências:" + notCien;
    }

    public void setNotas(final int mat, final int por, final int cie) {
        this.notMat = mat;
        this.notPort = por;
        this.notCien = cie;
    }

    public double calculaMedia(){
        this.media = this.notCien + this.notMat + this.notPort;
        return this.media/3;
    }

    public double calculaMedia(int e){
        this.media = this.notCien + this.notMat + this.notPort;
        return (this.media/3) + e;
    }
    
}
