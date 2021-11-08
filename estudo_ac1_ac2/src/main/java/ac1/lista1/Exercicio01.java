package ac1.lista1;

public class Exercicio01 {

    public static int somaRecursiva(int n) {
        if (n == 0) {
            return 0;
        } else if (n > 0) {
            return n + somaRecursiva(n - 1);
        } else {
            throw new IllegalArgumentException("Parâmetro inválido");
        }
    }

    public static int somaIterativa(int n) {
        int soma=0;
        if (n < 0){
            throw new IllegalArgumentException("Parâmetro inválido");
        }
        for (int i=1; i<=n; i++){
            soma += i;
        }
        return soma;
    }

}
