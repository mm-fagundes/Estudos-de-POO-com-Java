package ExerciciosGettersSetters;

public class Produto {

    private String nome;
    private double preco;
    private String descricao;
    private String marca;
    private double desconto;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    void desconto(){
        System.out.println("O valor sem desconto era: "+preco);
        this.desconto = this.desconto/100;
        preco -= (this.desconto * preco);
        System.out.println("O novo valor com desconto é: "+preco);

    }
}
