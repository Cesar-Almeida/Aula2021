package ac1.lista1;

public class Exercicio06 {

    public static int euclidesRecursivo(int n1, int n2) {
//        if (n1 <= 0 || n2 <= 0)
//            throw new IllegalArgumentException();
//        int resto = n1 % n2;
//
//        if (resto == 0) {
//            return n2;
//        }
//        return euclidesRecursivo(n2, resto);
        if (n1 < 0 || n2 < 0)
            throw new IllegalArgumentException();

        if(n2 == 0){
            return n1;
        }

        return euclidesRecursivo(n2, n1 % n2);
    }

    public static int euclidesIterativo(int n1, int n2) {
        if (n1 <= 0 || n2 <= 0){
            throw new IllegalArgumentException();
        }

        if (n2 > n1){
            int n3;
            n3 = n1;
            n1 = n2;
            n2 = n3;
        }
        int maiorDivisor = n2;
        for (int i = n1%n2; i > 0; i = n1%n2){
            n1 = n2;
            n2 = i;
            maiorDivisor = i;
        }

        return maiorDivisor;
    }

}
