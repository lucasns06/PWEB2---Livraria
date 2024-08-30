package model;

public class LivroDigital extends Livro
{

    private String marcaDagua;

    public String getMarcaDagua() {
        return marcaDagua;
    }

    public void setMarcaDagua(String marcaDagua) {
        this.marcaDagua = marcaDagua;
    }

    public LivroDigital(String titulo, String marcaDagua) {
        super(titulo);
        this.marcaDagua = marcaDagua;
    }

    @Override
    public double aplicarDesconto(double porcentagemDesconto)
    {
        if(porcentagemDesconto < 0.15)
        {
            System.out.println("Desconto nao permitido");
            return valor;
        }
            else
                return valor = valor+porcentagemDesconto;
    }
}
