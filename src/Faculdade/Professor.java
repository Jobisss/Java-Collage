package Faculdade;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{

    List<Materia> materias;
    public Professor(String nome, int idade) {
        super(nome,idade);
        this.materias = new ArrayList<Materia>();
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }
}
