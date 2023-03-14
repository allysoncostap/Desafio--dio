package br.com.dio.desafio.dominio;




public class Curso extends Conteudo {
    private int cargaHoraria;

    public double calcularXp() {
        return 10.0 * (double) this.cargaHoraria;
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso{cargaHoraria=" + this.cargaHoraria + ", nome='" + this.nome + "', professor=" + this.professor + "}";
    }
}