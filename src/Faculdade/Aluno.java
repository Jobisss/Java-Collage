package Faculdade;

public class Aluno extends Pessoa {

    int semestre;

    public Aluno(String nome, int idade) {
        super(nome, idade);
        this.semestre = 1;
    }
}
