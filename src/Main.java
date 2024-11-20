import operacoes.*;

public class Main {
    public static void main(String[] args) {
        Adicao adicao = new Adicao();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        Potenciacao potenciacao = new Potenciacao();

        double ad1 = adicao.operacao(1, 2);
        double sb1 = subtracao.operacao(1, 2);
        double mt1 = multiplicacao.operacao(1, 2);
        double dv1 = divisao.operacao(1, 2);
        double pt1 = potenciacao.operacao(3, 2);

        System.out.println("Adição: " + ad1);
        System.out.println("Subtração: " + sb1);
        System.out.println("Multiplicação: " + mt1);
        System.out.println("Divisão: " + dv1);
        System.out.println("Potenciação: " + pt1);

    }
}
