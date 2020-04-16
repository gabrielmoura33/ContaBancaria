import java.util.Random;

public class PessoaFIsica extends Pessoa {

    private String cpf;
    private String nome;
    protected int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta abrirConta(Banco banco, String tipo,PessoaFIsica pessoa){

        Saldo saldo = new Saldo();
        Random rand = new Random();
        int  numeroConta = rand.nextInt(1500);
        Conta conta;
        conta = new Conta(numeroConta,pessoa, saldo,banco,tipo);
        System.out.println("Numero Da Conta: " + numeroConta);
        ArquivoTextoEscrita arq = new ArquivoTextoEscrita();
        arq.abrirArquivo(banco.getNome().replace(" ", "") + ".txt");
        arq.escrever("\n" + numeroConta + banco.nome + ";" + pessoa.getNome() + ";" + pessoa.getCpf() + ";" + "Saldo: " + saldo.getSaldoTotal() + " ; " + "Tipo de Pessoa: " + tipo);
        arq.fecharArquivo();
        return conta;
    }
}
