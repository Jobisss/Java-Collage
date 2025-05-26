package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    String nome;
    List<Professor> professores;
    // contrutor : -> como vou instanciar um curso ?
    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<Professor>();  
    }

    public Curso() {
        this.nome = "Curso Defult";
    }

    public String getName() {
        return this.nome;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
}

