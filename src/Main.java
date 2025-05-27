import Faculdade.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Hamilton", 12);
        Professor professor2 = new Professor("Silvia", 12);
        Professor professor3 = new Professor("Luciane", 12);
        Professor professor4 = new Professor("Emily", 12);
        Professor professor5 = new Professor("Janete", 12);

        Materia materia1 = new Materia("Matemática");
        Materia materia2 = new Materia("Português");
        Materia materia3 = new Materia("História");
        Materia materia4 = new Materia("Geografia");
        Materia materia5 = new Materia("Filosofia");

        Aluno aluno1 = new Aluno("José", 12);
        Aluno aluno2 = new Aluno("Mario", 12);
        Aluno aluno3 = new Aluno("Leandro", 12);
        Aluno aluno4 = new Aluno("Gabrielito", 12);
        Aluno aluno5 = new Aluno("Josimar", 12);

        Curso curso2 = new Curso("Farmácia");
        Faculdade univale = new Faculdade("Univale", "85348183000193");

        curso2.addMateria(materia5);
        curso2.addMateria(materia4);
        curso2.addMateria(materia3);
        curso2.addMateria(materia2);
        curso2.addMateria(materia1);

        univale.adicionarProfessorEmCurso("Farmácia", professor1);
        univale.adicionarProfessorEmCurso("Farmácia", professor2);
        univale.adicionarProfessorEmCurso("Farmácia", professor3);
        univale.adicionarProfessorEmCurso("Farmácia", professor4);
        univale.adicionarProfessorEmCurso("Farmácia", professor5);
     
        univale.adicionarAlunoEmCurso("Farmácia", aluno1);
        univale.adicionarAlunoEmCurso("Farmácia", aluno2);
        univale.adicionarAlunoEmCurso("Farmácia", aluno3);
        univale.adicionarAlunoEmCurso("Farmácia", aluno4);
        univale.adicionarAlunoEmCurso("Farmácia", aluno5);

        univale.adcionarProfessor(professor1);
        univale.adcionarProfessor(professor2);
        univale.adcionarProfessor(professor3);
        univale.adcionarProfessor(professor4);
        univale.adcionarProfessor(professor5);

    }
}