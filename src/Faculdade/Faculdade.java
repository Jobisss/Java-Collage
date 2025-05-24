package Faculdade;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    public String nome;
    public String cnpj;
    private List<Curso> cursos;

    public Faculdade (String nome, String cnpj) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }
    public void adicionarCurso(Curso curso) {
        System.out.println("Curso adicionado com sucesso :" + curso.nome);
        this.cursos.add(curso);

        this.listCursos();
    }

    public void listCursos() {
        int index = 0;
        for(Curso curso : this.cursos) {
            if(this.cursos.size() == index + 1) {
                System.out.printf(curso.getName() + ".");
                continue;
            }

            System.out.printf(curso.getName() + ",");

            index++;
        }
    }

}
