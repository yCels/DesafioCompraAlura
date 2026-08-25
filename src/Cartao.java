import java.util.ArrayList;

public class Cartao {
    private double saldo;
    private double limite;
    private ArrayList<Compra> compras = new ArrayList<Compra>();


    public String lancaCompra(Compra compra){
        if (this.saldo >= compra.getPreco()){
            this.saldo -= compra.getPreco();
            this.compras.add(compra);
            return "Compra realizada com sucesso!";
        }else {
            return "Compra negada saldo insuficiente!";
        }
    }

    public Cartao(double saldo, double limite, ArrayList<Compra> compras){
        this.saldo = saldo;
        this.limite = saldo;
        this.compras = new ArrayList<>();
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }


}
