public class Aluno extends Pessoa{
    int ra;

    public Aluno(){
        super();
        System.out.println("Contruindo um aluno.");
    }

    public Aluno(String nome, int idade, int ra){
        super(nome, idade);
        this.ra = ra;
        System.out.println("Contruindo aluno...");
    }
    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

}
