package Curso4.Practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    public void addPessoa(Pessoa pessoa){
        listaPessoas.add(pessoa);
    }

    public void exibirLista(){
        if (!listaPessoas.isEmpty()) {
            for (int i = 0; i < listaPessoas.size(); i++) {
                System.out.format("""
                    FICHA TÉCNICA
                    Nome: %s
                    Idade: %d
                    Estado Civil: %s
                    Tamanho da lista: %d
                    --------------------
                    """, listaPessoas.get(i).getNome(), listaPessoas.get(i).getIdade(), listaPessoas.get(i).getEstadoCivil(), listaPessoas.size());
            }
        }else{
            System.out.println("Nenhuma pessoa foi registrada.");
        }
    }

    public void perguntarAddPessoa(Scanner sc) {


        System.out.print("Deseja adicionar alguma pessoa na lista? (Use S ou N): ");
        String cont = sc.nextLine();

        if (cont.equals("S")) {
            var pessoa = new Pessoa();
            listaPessoas.add(pessoa);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            listaPessoas.getLast().setNome(nome);

            System.out.print("Idade: ");
            Integer idade = sc.nextInt();
            sc.nextLine();
            listaPessoas.getLast().setIdade(idade);

            System.out.print("Estado Civil: ");
            String estadoCivil = sc.nextLine();
            listaPessoas.getLast().setEstadoCivil(estadoCivil);

            if (nome.isBlank()) {
                System.out.print("Nome não definido, continuar sem nome? (Use S ou N): ");
                cont = sc.nextLine();
                if (cont.equals("N")) {
                    System.out.println("Digite o nome: ");
                    nome = sc.nextLine();
                    listaPessoas.getLast().setNome(nome);
                } else {
                    listaPessoas.getLast().setNome("Não definido");
                }
            }
            if (idade == null || idade < 0) {
                System.out.print("Idade inválida (São aceitas apenas idades positivas), definir novamente? (Use S ou N): ");
                cont = sc.nextLine();
                if (cont.equals("S")) {
                    System.out.println("Digite a idade: ");
                    idade = sc.nextInt();
                    listaPessoas.getLast().setIdade(idade);
                } else {
                    listaPessoas.getLast().setIdade(null);
                }
            }
            if (estadoCivil.isBlank()) {
                System.out.print("Estado Civil não definido, continuar sem estado civil? (Use S ou N): ");
                cont = sc.nextLine();
                if (cont.equals("N")) {
                    System.out.println("Digite o Estado Civil: ");
                    estadoCivil = sc.nextLine();
                    listaPessoas.getLast().setEstadoCivil(estadoCivil);
                } else {
                    listaPessoas.getLast().setEstadoCivil("Não definido");
                }
            }
        }
        System.out.print("Deseja exibir a lista? (Use S ou N): ");
        cont = sc.nextLine();
        if (cont.equals("S")) {
            exibirLista();
        }

    }
}
