/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregação.e.composição;


class itemPedido {
    private final int quantidade;
    private final Produto produto;
    
    itemPedido(Produto p, int q){
        this.quantidade = q;
        this.produto = p;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

}
