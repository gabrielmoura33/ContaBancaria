public class BancoItau extends Banco {
    public BancoItau(String nome) {
        super(nome);
    }

    @Override
    public void LimiteMaximoDiario() {
        System.out.println("Limite Maximo de saque diario: R$2000.00");
    }
}
