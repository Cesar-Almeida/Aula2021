package ac1.lista1;

public class Exercicio08 {

    public static int somaRecursvia(int n) {
        int numero = n / 10;
        int resto = n % 10;

        if (numero == 0) {
            return resto;
        }
        return resto + somaRecursvia(numero);

    }

    public static int somaIterativa(int n) {
        int resto = n % 10;
        int soma = 0;
        while (n != 0){
            n /= 10;
            soma += resto;
            resto = n % 10;
        }

        return soma;
    }
}
