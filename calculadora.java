/**
 * calculadora
 */
public class calculadora {

    private double Pref;

    calculadora(double Pref){
        this.Pref = Pref;
    }

    public double somar(double a, double b){
        return a + b;
    }
    public double subtrair(double a, double b){
        return a - b;
    }
    public double multiplicar(double a, double b){
        return a * b;
    }
    public double divisao(double a, double b){
        return a / b;
    }
    public double raiz(double a, double b){
        return Math.pow(a,b);
    }
    public double somarPref (double a) {
        return a + Pref;
    }
}