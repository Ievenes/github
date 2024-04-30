/**
 * TesteComHerança1
 */
public class TesteComHerança1 {

    public static void main(String[] args) {
        AlunoDeGraduacao aluno = new AlunoDeGraduacao();
        aluno.setNome("José");
        aluno.setIdade(19);
        aluno.setRa(2312345);
        System.out.printf("\nnome: %s, idade: %d, ra: %d\n", aluno.getNome(), aluno.getIdade(),aluno.getRa());
    }
}