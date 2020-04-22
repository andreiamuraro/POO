package classes;

public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void status() {
        System.out.println("Modelo" + this.modelo);
        System.out.println("Uma caneta" + this.cor);
        System.out.println("Ponta" + this.ponta);
        System.out.println("Carga" + this.carga);
        System.out.println("está tampada?" + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }

    }

    public void tampar() {
        this.tampada = true;

    }

    public void destampar() {
        this.tampada = false;

    }
}
