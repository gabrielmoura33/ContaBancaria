import java.util.Random;

public class Banco {
    protected String nome;

    protected int numero;

    public Banco(String nome) {
        this.nome = nome;
        nome = nome.replace(" ", "");
        Random rand = new Random();
        this.numero = rand.nextInt(1800);
        ArquivoTextoEscrita arq = new ArquivoTextoEscrita();
        arq.abrirArquivo(nome + ".txt");
        arq.escrever(numero + ";" + nome + ";");
        arq.fecharArquivo();
    }
    public Banco(){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void LimiteMaximoDiario(){

    };
}