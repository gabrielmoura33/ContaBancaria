import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Aplicacao {
    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        Banco bancoEscolhido = new Banco();
        int escolha = 0;
            do {
                System.out.println("Escolha uma opcao");
                System.out.println("1 - Escolher um Banco");
                System.out.println("2 - Cadastrar nova Conta");
                System.out.println("3 - Sair");
                escolha = entrada.nextInt();
                if (escolha == 1)
                {
                    System.out.println("Escolha uma opcao");
                    System.out.println("1 -  Banco do Brasil");
                    System.out.println("2 - Banco Itau");
                    System.out.println("3 - Cadastrar novo Banco");
                    int escolhaBanco = entrada.nextInt();

                    switch (escolhaBanco) {
                        case 1:
                            System.out.println("Banco Do Brasil");
                            var bb = new Banco("Banco Do Brasil");
                            bancoEscolhido = bb;
                            break;
                        case 2:
                            System.out.println("Banco Itau");
                            var itau = new Banco("Banco Itau");
                            bancoEscolhido = itau;
                            break;
                        case 3:
                            System.out.println("Digite o Nome do Banco");
                            String nomeBanco = entrada.next();
                            var newBanco = new Banco(nomeBanco);
                            bancoEscolhido = newBanco;
                            break;
                    }


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
                        int abrirConta = Integer.parseInt(entrada.next());
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

                    } else if (cpfCpnj.length() < 13){
                        PessoaFIsica pessoa = new PessoaFIsica();
                        pessoa.setCpf(cpfCpnj);

                        System.out.println("Digite sua idade");
                        int idade = Integer.parseInt(entrada.next());
                        pessoa.setIdade(idade);

                        System.out.println("Digite seu Nome: ");
                        String nome = entradaString.nextLine();
                        pessoa.setNome(nome);

                        System.out.println("Digite seu endereco");
                        String endereco = entradaString.next();
                        pessoa.endereco = endereco;

                        System.out.println("Deseja Abrir uma Conta? 1 - Sim, 2 - Nao");
                        int abrirConta = Integer.parseInt(entrada.next());
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
