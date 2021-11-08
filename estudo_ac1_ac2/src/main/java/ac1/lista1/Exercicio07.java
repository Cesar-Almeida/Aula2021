package ac1.lista1;

public class Exercicio07 {

    public static int maiorRecursivo(int[] v) {
        if (v == null) {
            throw new IllegalArgumentException();
        }
//        return maiorRecursivo(v, 1, 0);
        return maiorRecursivo(v, 0);
    }

    private static int maiorRecursivo(int[] v, int i) {
        if (i == v.length -1){
            return v[i];
        }else {
            int maior = maiorRecursivo(v, i+1);
            return v[i] > maior ? v[i] : maior;
        }

    }

    private static int maiorRecursivo(int[] v, int i, int iMaior) {
        if (i == v.length - 1) {
            return v[iMaior];
        } else if (v[i] > v[iMaior]) {
            return maiorRecursivo(v, i + 1, i);
        } else {
            return maiorRecursivo(v, i + 1, iMaior);
        }
    }

    public static int maiorIterativo(int[] v) {
        if (v == null) throw new IllegalArgumentException();
//        int aux = Integer.MIN_VALUE;
        int aux = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > aux)
                aux = v[i];
        }
        return aux;
    }

}
