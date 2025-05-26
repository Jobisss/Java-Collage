package Faculdade;

public class Aluno extends Pessoa {

    int semestre;

    Aluno(String nome, int idade) {
        super(nome, idade);
        this.semestre = 1;
    }
}
