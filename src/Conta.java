public class Conta {
    int numeroConta;
    Pessoa  titular;
    Saldo saldo;
    Banco banco;
    String tipo;

    public Conta(int numeroConta, Pessoa titular, Saldo saldo, Banco banco, String tipo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.banco = banco;
        this.tipo = tipo;
    }
}
