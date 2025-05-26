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
        Professor professor6 = new Professor("Michael", 12);
        Professor professor7 = new Professor("Tomya", 12);
        Professor professor8 = new Professor("Paulinho", 12);
        Professor professor9 = new Professor("Avila", 12);
        Professor professor10 = new Professor("Giulio", 12);

        Curso curso1 = new Curso("Analise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Farmácia");
        Curso curso3 = new Curso("Computaria");
        Curso curso4 = new Curso("Estelionato");
        Curso curso5 = new Curso("Agiotagem");
        Faculdade univale = new Faculdade("Univale", "85348183000193");

        curso2.addProfessor(professor1);
        curso2.addProfessor(professor2);
        curso2.addProfessor(professor3);
        curso2.addProfessor(professor4);
        curso2.addProfessor(professor5);
        
        curso1.addProfessor(professor6);
        curso1.addProfessor(professor7);
        curso1.addProfessor(professor8);
        curso1.addProfessor(professor9);
        curso1.addProfessor(professor10);

        univale.adicionarCurso(curso1);
        univale.adicionarCurso(curso2);
        univale.adicionarCurso(curso3);
        univale.adicionarCurso(curso4);
        univale.adicionarCurso(curso5);

        univale.adcionarProfessor(professor1);
        univale.adcionarProfessor(professor2);
        univale.adcionarProfessor(professor3);
        univale.adcionarProfessor(professor4);
        univale.adcionarProfessor(professor5);

    }
}