public class calculadoraTeste {
    public static void main(String[] args) {
        calculadora calc = new calculadora(8);
        //testar soma
        double soma = calc.somar(2, 3);
        System.out.println(soma);
        //testar subtracao
        double sub = calc.subtrair(2, 3);
        System.out.println(sub);
        //testar multiplicacao
        double mult = calc.multiplicar(2, 3);
        System.out.println(mult);
        //testar divisao
        double div = calc.divisao(2, 3);
        System.out.println(div);
        //testar raiz
        double raizz = calc.raiz(2, 3);
        System.out.println(raizz);
        //teste professor
        System.out.println(calc.somarPref(2));
    }
}
