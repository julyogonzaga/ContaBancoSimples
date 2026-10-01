public class ContadoBanco {
    private Integer numeroConta;
    private String titular;
    private double saldo;

    // Construtor sem depósito inicial
    public ContadoBanco(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Construtor com depósito inicial
    public ContadoBanco(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        depositar(depositoInicial);
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodo para realizar deposito
    public void depositar(double valor) {
        saldo += valor;
    }

    // Metodo para realizar saque + a taxa de 5.75
    public void sacar(double valor) {
        saldo -= valor + 5.75;
    }

    // Metodo para mostrar os status atuais da Conta
    public String toString() {
        return "Conta " + numeroConta
                + ", Titular: " + titular
                + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}