package Curso4.Practice2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastrar{
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void cadastrarProdutos(Scanner sc){

        boolean continuar = true;
        double preco;
        String entrada;
        String select;



        while(continuar) {


            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            entrada = sc.nextLine().replace("," , ".");
            preco = Double.parseDouble(entrada);

            System.out.print("Digite a quantidade de produtos: ");
            entrada = sc.nextLine();
            int quantidade = Integer.parseInt(entrada);

            while (true) {
                System.out.print("O produto é perecivel? Use S ou N: ");
                select = sc.nextLine().trim().toUpperCase();
                LocalDate dataValidade = null;
                if (select.equals("N")) {
                    Produto produto = new Produto(nome, preco, quantidade);
                    listaProdutos.add(produto);
                    break;
                } else if (select.equals("S")) {
                    System.out.print("Digite a data de validade(AAAA-MM-DD): ");
                    entrada = sc.nextLine();
                    dataValidade = LocalDate.parse(entrada);
                } else {
                    System.out.println("Caráctere inválido, tente novamente.");
                    continue;
                }

                ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(nome, preco, quantidade, dataValidade);
                listaProdutos.add(produtoPerecivel);
                break;

            }



            while (true){
                System.out.println("Deseja adicionar mais um produto? Use S ou N: ");
                select = sc.nextLine().toUpperCase().trim();

                if (select.equals("N")) {
                    continuar = false;
                    break;
                } else if (select.equals("S")) {
                    break;
                }
                else{
                    System.out.println("Caráctere inválido, escolha apenas S ou N.");
                }
            }


        }
    }

    public void exibirLista(){

        if(listaProdutos.isEmpty()){
            System.out.println("Nenhum produto adicionado.");
            return;
        }

        for (int i = 0; i < listaProdutos.size(); i++){
            System.out.println((i + 1)+"| " + listaProdutos.get(i));
        }
    }

}
