package Faculdade;

import java.time.LocalDate;

public class Aula {
    private Curso curso;
    private Professor professor;
    private Materia materia;
    private LocalDate data;
    private String conteudo;

    public Aula(Curso curso, Professor professor, Materia materia, LocalDate data, String conteudo) {
        this.curso = curso;
        this.professor = professor;
        this.materia = materia;
        this.data = data;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }

    public String getResumo() {
        return String.format("Aula de  %s (%s) no cuso em %s. Conteudo: %s", materia.nome, professor.getNome(), curso.getName(), this.getConteudo());
    }
}
