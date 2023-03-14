package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {
    private double cont;
    List<Conteudo> diciplinaCadastradas = new ArrayList();
    List<Conteudo> diciplinaConcluidas = new ArrayList();
    private double horasAulas;

    public double getHorasAulas() {
        return this.horasAulas;
    }

    public void setHorasAulas(double horasAulas) {
        this.horasAulas = horasAulas;
    }

    public Professor() {
    }

    public void addDiciplinasCadastradas(Conteudo conteudo) {
        this.diciplinaCadastradas.add(conteudo);
    }

    public void listarDiciplinasCadastradas() {
        this.diciplinaCadastradas.forEach((diciplina) -> {
            System.out.println(diciplina.getNome());
        });
    }

    public void addDiciplinasConcluidas(Conteudo conteudo) {
        if (this.diciplinaCadastradas.contains(conteudo)) {
            this.diciplinaCadastradas.remove(conteudo);
            this.diciplinaConcluidas.add(conteudo);
        } else {
            System.out.println("Você nao pode concluir nessa conteudo, devido não esta cadastrado ");
        }

    }

    public void listarDiciplinasConcluidas() {
        this.diciplinaConcluidas.forEach((diciplina) -> {
            System.out.println(diciplina.getNome());
        });
    }

    public String toString() {
        return "Professor{diciplinaCadastradas=" + this.diciplinaCadastradas + ", diciplinaConcluidas=" + this.diciplinaConcluidas + ", horasAulas=" + this.horasAulas + ", id=" + this.id + ", nome='" + this.nome + "'}";
    }

    public double calcularXp() {
        if (this.diciplinaConcluidas.isEmpty()) {
            this.setXP_PADRAO(this.horasAulas);
        } else {
            this.cont = this.horasAulas + (double)this.diciplinaConcluidas.size() + 1.0;
            this.setXP_PADRAO(this.cont);
        }

        return this.getXP_PADRAO();
    }
}

