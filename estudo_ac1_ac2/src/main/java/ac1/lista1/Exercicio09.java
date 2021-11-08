package ac1.lista1;

public class Exercicio09 {

    public static String binarioRecursivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Apenas numeros positivos");
        }
        int quociente = n / 2;
        int resto = n % 2;

        if (quociente == 0) {
            return String.valueOf(resto);
        } else {
            return String.format("%s%d", binarioRecursivo(quociente), resto);
        }
    }

    public static String binarioIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Apenas numeros positivos");
        }
        int resto;
        int quociente;
        String soma = "";
        int _n = n;
        do {
            quociente = _n / 2;
            resto = _n % 2;
            soma = String.format("%d%s", resto, soma);
            _n = quociente;
        }
        while (quociente != 0);
        return soma;
    }

}
