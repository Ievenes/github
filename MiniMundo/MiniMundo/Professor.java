public class Professor extends Pessoa{
    private int matricula;

    public Professor(){
        super();
        System.out.println("Construindo um professor.");
    }
    public void lecionar (){
        System.out.println(getNome() + "lecionando...");
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
