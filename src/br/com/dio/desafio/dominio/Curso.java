package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", cargaHoraria='" + getCargaHoraria() + "'" +
            "}";
    }
}
