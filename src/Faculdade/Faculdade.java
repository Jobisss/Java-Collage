package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    public String nome;
    public String cnpj;
    private List<Curso> cursos;
    private List<Professor> professores;

    public Faculdade(String nome, String cnpj) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }

    public void adicionarCurso(Curso curso) {
        System.out.println("Curso adicionado com sucesso :" + curso.nome);
        this.cursos.add(curso);

        this.listarCursos();
    }

    public void listarCursos() {
        int index = 0;
        for (Curso curso : this.cursos) {
            if (this.cursos.size() == index + 1) {
                System.out.printf(curso.getName() + ".");
                continue;
            }

            System.out.printf(curso.getName() + ",");

            index++;
        }
    }

    public void removerCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    public void adcionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public void listarProfessores() {
        for (Professor professor : this.professores) {
            System.out.println(professor);
        }
    }

    public void adicionarAlunoEmCurso(String nomeCurso, Aluno aluno) {
        for (Curso curso : this.cursos) {
            if (curso.getName().equalsIgnoreCase(nomeCurso)) {
                curso.addAluno(aluno);
                System.out.println("Aluno adicionado com sucesso");
                return;
            }
        }
    }

    public void adicionarProfessorEmCurso(String nomeCurso, Professor professor) {
        for (Curso curso : this.cursos) {
            if (curso.getName().equalsIgnoreCase(nomeCurso)) {
                curso.addProfessor(professor);
                System.out.println("Professor " + professor.getNome() + " adicionado ao curso " + nomeCurso);
                return;
            }
        }
        System.out.println("Curso não encontrado: " + nomeCurso);
    }

}
