/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregação.e.composição;

public class Pedido {
    private float valor_total;
    private itemPedido itemPedido;
        
    public void adicionar_item(final itemPedido item){
        int quant;
        float valor;
        this.itemPedido = item;
        valor = itemPedido.getProduto().getValor();
        quant = itemPedido.getQuantidade(); 
        valor_total += quant*valor;
    }
    
    public float obter_total(){
        return this.valor_total;
    }

    String obter_total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
