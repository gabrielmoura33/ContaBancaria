import java.util.Random;

public class Banco {
    public String nome;
    public int numero;

    public Banco(){
        nome = "Banco do Brasil";
        numero = 1;
    }
    public Banco(String nome) {
        this.nome = nome;
        Random rand = new Random();
        this.numero = rand.nextInt(1800);
        ArquivoTextoEscrita arq = new ArquivoTextoEscrita();
        arq.abrirArquivo("Banco.txt");
        arq.escrever(numero + ";" + nome + ";");
        arq.fecharArquivo();
    }

}