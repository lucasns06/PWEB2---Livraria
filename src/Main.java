public class Main {
    public static void main(String[] args)
    {
        //Criar um objeto -> Instanciar um objeto
        Editora rocco = new Editora();
        rocco.nome = "rocco";
        rocco.email = "adm@Leya.com";
        rocco.site = "Leya.com";

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Harry potter";
        meuLivro.autor = "wolf";
        meuLivro.editora = rocco;
        meuLivro.paginas = 464;
        meuLivro.resumo = "miasma ";
        meuLivro.tipoCapa = "Comum";
        meuLivro.valor = 34.99;

        System.out.println(meuLivro.titulo + " \nEscrito por " + meuLivro.autor + " \nCusta "
                + meuLivro.valor + " reais" + "\nPublicado por " + meuLivro.editora.nome + "\nTem "
                + meuLivro.paginas + " paginas");

        //Livro2

        Editora Leya = new Editora();
        Leya.nome = "Leya";
        Leya.email = "adm@Leya.com";
        Leya.site = "Leya.com";

        Livro livroFavorito = new Livro();
        livroFavorito.titulo = "O Jogador Número 1";
        livroFavorito.autor = "Ernest Cline";
        livroFavorito.editora = Leya;
        livroFavorito.paginas = 464;
        livroFavorito.resumo = "Um mundo em jogo, a busca pelo grande prêmio. Você está preparado, Jogador número 1? O ano é 2044 e a Terra não é mais a mesma. ";
        livroFavorito.tipoCapa = "Comum";
        livroFavorito.valor = 20;

        System.out.println("\n" + livroFavorito.titulo + "\nEscrito por " + livroFavorito.autor + " \nCusta "
                + livroFavorito.valor + " reais" + "\nPublicado por " + livroFavorito.editora.nome + "\nTem "
                + livroFavorito.paginas + " paginas");
    }
}