public class TesteNovosContrutores {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 37);
        Aluno a = new Aluno("Maria", 19,233334);

        System.out.printf("Aluno nome: %s, idade: %d, ra: %d\n",
        a.getNome(), a.getIdade(),a.getRa());
    }
}
