package model;
import enums.TipoCapaEnum;

public class Livro
{
    //Atributos
    public String titulo;
    public String autor;
    public double valor;
    public Editora editora;
    private int paginas;
    public String resumo;
    public TipoCapaEnum tipoCapa;

    //modificadores de acesso

    //get => retornar a informação
    public int getPaginas()
    {
        return this.paginas;
    }

    //set
    public void setPaginas(int paginas)
    {
        if(paginas > 0)
            this.paginas = paginas;
    }

    //construtores
    public Livro(){}//Construtor padrão (vazio)

    public Livro(String titulo)
    {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, double valor, Editora editora, int paginas, String resumo, TipoCapaEnum tipoCapa)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }
    //Métodos
    public void exibirDadosLivro(){
        System.out.println("===============================");
        System.out.println("Nome: " + titulo);
        System.out.println("Resumo: " + resumo);
        System.out.println("Preço: " + valor);
        System.out.println("Paginas: " + paginas);
        System.out.println("Autor: " + autor);
        System.out.println("Capa: " + TipoCapaEnum.COMUM);
        if(temEditora()==true)
           editora.exibirEditora();
        System.out.println("===============================");
    }
    public boolean temEditora()
    {
        if (editora == null)
            return false;
        else
            return true;
        /*
            SIMPLIFICADO.
            return editora != null;
        */
    }

    public double aplicarDesconto(double porcentagemDesconto)
    {
        return  this.valor + porcentagemDesconto/100;
    }
}
