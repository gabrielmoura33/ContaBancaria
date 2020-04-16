import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Banco bancoEscolhido = new Banco();
        int escolha = 0;
            do {
                System.out.println("Escolha uma opcao");
                System.out.println("1 - Cadastrar um novo banco");
                System.out.println("2 - Cadastrar nova Conta");
                System.out.println("3 - Sair");
                escolha = entrada.nextInt();
                if (escolha == 1)
                {
                    System.out.println("Digite o nome do banco");
                    String bancoNome = entrada.next();
                    Banco banco = new Banco(bancoNome);
                    bancoEscolhido = banco;

                }else if (escolha == 2){
                    System.out.println("Digite Seu CPF/CNPJ");
                    String cpfCpnj = entrada.next();

                    if (cpfCpnj.length() > 13){
                        PessoaJuridica pessoa = new PessoaJuridica();
                        pessoa.setCnpj(cpfCpnj);
                        System.out.println("Digite sua Razao Social: ");
                        pessoa.setRazaoSocial(entrada.next());
                        System.out.println("Digite seu endereco");
                        pessoa.endereco = entrada.next();
                        System.out.println("Deseja Abrir uma Conta? 1 - Sim, 2 - Nao");
                        int abrirConta = entrada.nextInt();
                        switch (abrirConta){
                            case 1:
                                pessoa.abrirConta(bancoEscolhido,"Juridica",pessoa);
                                break;
                            case 2:
                                System.out.println("Cadastro COncluido");
                                break;
                            default:
                                System.out.println("Opcao Invalida");
                                break;
                        }

                    }else if (cpfCpnj.length() < 13){
                        PessoaFIsica pessoa = new PessoaFIsica();
                        pessoa.setCpf(cpfCpnj);
                        System.out.println("Digite seu Nome: ");
                        pessoa.setNome(entrada.next());
                        System.out.println("Digite sua idade");
                        pessoa.setIdade(entrada.nextInt());
                        System.out.println("Digite seu endereco");
                        pessoa.endereco = entrada.next();
                        System.out.println("Deseja Abrir uma Conta? 1 - Sim, 2 - Nao");
                        int abrirConta = entrada.nextInt();
                        switch (abrirConta) {
                            case 1:
                                pessoa.abrirConta(bancoEscolhido,"Fisica",pessoa);
                                break;
                            case 2:
                                System.out.println("Cadastro COncluido");
                                break;
                            default:
                                System.out.println("Opcao Invalida");
                                break;
                        }
                    }
                }else if (escolha == 3)
                {
                    System.out.println("Saindo");
                }else
                {
                    System.out.println("Escolha Incorreta");
                }
             } while (escolha != 3);
    }
}
