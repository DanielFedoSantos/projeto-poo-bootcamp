package br.com.dio.desafio.dominio;

// é abstrata para o metodo poder ser redefinido nas filhas e nao pode ser instanciada
public abstract class Conteudo {

    // final é tipo o const, o static diz que pode ser acessado de fora da classe
    protected static double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
