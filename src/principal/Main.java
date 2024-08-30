package principal;

import enums.TipoCapaEnum;
import model.Editora;
import model.Livro;

public class Main {
    public static void main(String[] args)
    {
        //Criar um objeto -> Instanciar um objeto
        Editora dados = new Editora();

        Editora rocco = new Editora();
        rocco.nome = "rocco";
        rocco.email = "adm@rocco.com";
        rocco.site = "rocco.com";

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry potter";
        meuLivro.autor = "wolf";
        meuLivro.editora = rocco;
        meuLivro.setPaginas(464);
        meuLivro.resumo = "As aventuras do harry potter e a busca das pedrinhas do crack filosoficas ";
        meuLivro.tipoCapa = TipoCapaEnum.DURA;
        meuLivro.valor = 34.99;

        meuLivro.exibirDadosLivro();

        //instanciar o objeto/classe e difinir os atributos (editora)
        Editora Leya = new Editora();
        Leya.nome = "Leya";
        Leya.email = "adm@Leya.com";
        Leya.site = "Leya.com";

        //instanciar o objeto/classe e difinir os atributos (livro)
        Livro livroFavorito = new Livro();
        livroFavorito.titulo = "O Jogador Número 1";
        livroFavorito.autor = "Ernest Cline";
        livroFavorito.editora = Leya;
        livroFavorito.setPaginas(464);
        livroFavorito.resumo = "Um mundo em jogo, a busca pelo grande prêmio. Você está preparado, Jogador número 1? O ano é 2044 e a Terra não é mais a mesma. ";
        livroFavorito.tipoCapa = TipoCapaEnum.COMUM;
        livroFavorito.valor = 20;

        //executa um método que tem a exibição para o usuário
        livroFavorito.exibirDadosLivro();
        double desconto = livroFavorito.aplicarDesconto(5);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor total: " + (livroFavorito.valor-desconto));

        Livro teste = new Livro("uel uel");
        System.out.println(teste.titulo);
    }
}