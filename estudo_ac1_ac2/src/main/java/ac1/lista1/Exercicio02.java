package ac1.lista1;

public class Exercicio02 {

    public static int somaRecursiva(int[] x) {
        if (x == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        }

        return somaRecursiva(x, 0);

    }

    private static int somaRecursiva(int[] x, int p) {
        return p == x.length ? 0 : x[p] + somaRecursiva(x, p + 1);
    }

    public static int somaIterativa(int[] x) {
        if (x == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        }
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma += x[i];
        }
        return soma;
    }

}
