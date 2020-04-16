public class BancoDoBrasil extends Banco {


    public BancoDoBrasil(String nome) {
        super(nome);
    }

    @Override
    public void LimiteMaximoDiario() {
        System.out.println("Limite Maximo de saque: R$1000,00");
    }
}
