package Curso4.Practice2;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade,LocalDate dataValidade){
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

}
