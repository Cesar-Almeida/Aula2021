package ac1.lista1;

public class Exercicio03 {

    public static int somaParRecursiva(int[] v) {
        return somaParRecursiva(v, 0);

    }

    private static int somaParRecursiva(int[] v, int p) {
        if (v == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        } else if (p == v.length) {
            return 0;
        } else {
            return v[p] % 2 == 0 ? v[p] + somaParRecursiva(v, p + 1) : somaParRecursiva(v, p + 1);
        }

    }

    public static int somaParIterativa(int[] v) {
        if (v == null)
            throw new IllegalArgumentException("Parâmetro inválido");

        int soma = 0;

        for (int i : v)
            if (i % 2 == 0)
                soma += i;

        return soma;
    }

}
