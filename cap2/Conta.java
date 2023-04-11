package cap2;

public class Conta {
    int numero;
    String nome_titular;
    double saldo;

    public void depositar(double valor) { // metodos
        this.saldo = this.saldo + valor;
    };

    public boolean sacar(double valor) { // metodos
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else return false;
    }
}