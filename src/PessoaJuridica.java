import java.util.Random;
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Conta abrirConta(Banco banco, String tipo,PessoaJuridica pessoa){
        Saldo saldo = new Saldo();
        Random rand = new Random();
        int numeroConta = rand.nextInt(1500) + 10000;
        Conta conta;
        conta = new Conta(numeroConta,pessoa, saldo,banco,tipo);
        System.out.println("Numero Da Conta: " + numeroConta);
        return conta;
    }
}
