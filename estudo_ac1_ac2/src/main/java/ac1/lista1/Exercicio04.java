package ac1.lista1;

public class Exercicio04 {

    public static int contadorImparRecursivo(int[] v) {
        return contadorImparRecursivo(v, 0);
    }

    private static int contadorImparRecursivo(int[] v, int p) {
        if (v == null) throw new IllegalArgumentException("Parâmetro inválido");

        if (p == v.length) {
            return 0;
        } else {
            if (v[p] % 2 != 0) {
                return contadorImparRecursivo(v, p + 1) + 1;
            } else {
                return contadorImparRecursivo(v, p + 1);
            }
        }
    }

    public static int contadorImparIterativo(int[] v) {
        if (v == null)
            throw new IllegalArgumentException("Parâmetro inválido");
        int impares = 0;
        for (int i : v) {
            if (i % 2 != 0)
                impares++;
        }
        return impares;
    }

}
