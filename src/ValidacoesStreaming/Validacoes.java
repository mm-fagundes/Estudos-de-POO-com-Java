package ValidacoesStreaming;

public class Validacoes {


    public static void ValidarPlano(Filmes filme, User user) {
        if(filme.included || user.plano.nome.equals("Plano Plus")){
            System.out.println("Filme permitido");
        }else{
            System.out.println("Filme incluso apenas no Plano Plus.");
        }
    }
}
