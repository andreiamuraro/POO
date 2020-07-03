/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregação.e.composição;

class Produto {
    private final int codigo;
    private final float valor;
    private final String descricao;
    
    public Produto(int c, float v, String d){
        this.codigo = c;
        this.valor = v;
        this.descricao = d;
    }

    public float getValor(){
        return this.valor;
    }
        
}
