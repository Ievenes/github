public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorHorista professorHorista = new ProfessorHorista();
        professorHorista.setNome("Bonato");
        ProfessorPesquisador professorPesquisador = new ProfessorPesquisador();
        professorPesquisador.setNome("Anderson");
        professorHorista.lecionar();
        professorPesquisador.lecionar();
    }
}
