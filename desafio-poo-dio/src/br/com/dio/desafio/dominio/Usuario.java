package br.com.dio.desafio.dominio;

public abstract class Usuario {
    protected Long id;
    protected String nome;
    protected double XP_PADRAO = 0.0;

    public Usuario() {
    }

    public abstract double calcularXp();

    public String getNome() {
        return this.nome;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getXP_PADRAO() {
        return this.XP_PADRAO;
    }

    public void setXP_PADRAO(double XP_PADRAO) {
        this.XP_PADRAO = XP_PADRAO;
    }
}

