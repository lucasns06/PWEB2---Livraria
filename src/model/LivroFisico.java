package model;

import enums.TipoCapaEnum;

public class LivroFisico extends Livro
{
    public double getTaxaImpressao()
        {
            return valor * 0.05;
        }

    public LivroFisico() {
    }

    public LivroFisico(String titulo) {
        super(titulo);
    }

    public LivroFisico(String titulo, String autor, double valor, Editora editora, int paginas, String resumo, TipoCapaEnum tipoCapa) {
        super(titulo, autor, valor, editora, paginas, resumo, tipoCapa);
    }
}
