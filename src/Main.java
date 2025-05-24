import Faculdade.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Analise e Desenvolvimento de Sistemas");
        Curso curso2 = new Curso("Farmácia");
        Curso curso3 = new Curso("Computaria");
        Curso curso4 = new Curso("Estelionato");
        Curso curso5 = new Curso("Agiotagem");
        Faculdade univale = new Faculdade("Univale", "85348183000193");

        univale.adicionarCurso(curso5);

    }
}