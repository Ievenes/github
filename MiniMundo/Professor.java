public class Professor extends Pessoa{
    private int matricula;

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
