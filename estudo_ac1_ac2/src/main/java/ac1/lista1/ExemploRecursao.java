package ac1.lista1;

public class ExemploRecursao {
    public static void contagemRegressivaIterativa(int n)
    {
        for (int i = n; i >= 0; i--)
        {
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n)
    {
        if (n == 0)
        {
            System.out.println(n);
        }else
        {
            System.out.println(n);
            contagemRegressivaRecursiva(n-1);
        }
    }

    public static int fatorial(int n)
    {
        if (n == 0)
        {
           return  1;
        } else if (n < 0)
        {
            throw new IllegalArgumentException("N não pode ser negativo");
        }
        return n * fatorial(n - 1);
    }
    public static void main(String[] args)
    {
        System.out.println("Contagem regressiva iterativa do 6:");
        contagemRegressivaIterativa(6);
        System.out.println("Contagem regressiva recursiva do 8:");
        contagemRegressivaRecursiva(8);
    }
}
