package ac1.lista1;

public class Exercicio05 {

    public static int contadorOcorrenciaRecursivo(int v[], int x) {
        return contadorOcorrenciaRecursivo(v, x, 0);
    }

    public static int contadorOcorrenciaRecursivo(int v[], int x, int p) {
        if (v == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        } else if (v.length == p) {
            return 0;
        } else if (v[p] == x) {
            return contadorOcorrenciaRecursivo(v, x, p + 1) + 1;
        } else {
            return contadorOcorrenciaRecursivo(v, x, p + 1);
        }
    }

    public static int contadorOcorrenciaIterativo(int[] v, int x) {
        if (v == null) {
            throw new IllegalArgumentException("Parâmetro inválido");
        } else {
            int resultado = 0;
            for (int i = 0; i < v.length; i++) {
                if (v[i] == x) {
                    resultado++;
                }
            }
            return resultado;
        }
    }

}
