package Faculdade;

public class Curso {
    String nome;
    // contrutor : -> como vou instanciar um curso ?
    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {
        this.nome = "Curso Defult";
    }

    public String getName() {
        return this.nome;
    }
}

