package Faculdade;
import java.util.List;

public class Professor extends Pessoa{

    List<Materia> materias;
    Professor() {
        super();
    }

    public void addMateria(Materia materia) {
        this.materias.add(materia);
    }
}
