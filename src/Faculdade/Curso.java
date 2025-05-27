package Faculdade;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Professor> professores;
    List<Aluno> alunos;
    List<Materia> materias;
    List<Aula> aulas;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<Professor>();  
        this.alunos = new ArrayList<Aluno>();
        this.materias = new ArrayList<Materia>();
    }

    public String getName() {
        return this.nome;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }

    public void registrarAula(Professor professor, Materia materia, LocalDate data, String conteudo) {
        Aula aula = new Aula(this, professor, materia, data, conteudo);
        this.aulas.add(aula);
        System.out.println("Aula registrada: " + aula.getResumo());
    }

    public List<Aula> getAulas() {
        return this.aulas;
    }
}

