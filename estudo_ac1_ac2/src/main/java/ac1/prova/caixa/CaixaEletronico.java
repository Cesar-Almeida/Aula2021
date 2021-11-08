package ac1.prova.caixa;

public class CaixaEletronico {

    private int quantidadeNotasDuzentos;
    private int quantidadeNotasCem;
    private int quantidadeNotasCinquenta;
    private int quantidadeNotasVinte;
    private int quantidadeNotasDez;
    private int quantidadeNotasCinco;
    private int quantidadeNotasDois;
    private int quantidadeNotasUm;

    public int getQuantidadeNotasDuzentos() {
        return quantidadeNotasDuzentos;
    }

    public int getQuantidadeNotasCem() {
        return quantidadeNotasCem;
    }

    public int getQuantidadeNotasCinquenta() {
        return quantidadeNotasCinquenta;
    }

    public int getQuantidadeNotasVinte() {
        return quantidadeNotasVinte;
    }

    public int getQuantidadeNotasDez() {
        return quantidadeNotasDez;
    }

    public int getQuantidadeNotasCinco() {
        return quantidadeNotasCinco;
    }

    public int getQuantidadeNotasDois() {
        return quantidadeNotasDois;
    }

    public int getQuantidadeNotasUm() {
        return quantidadeNotasUm;
    }

    public void sacar(int valor) {
        if (valor <= 0 || valor >= 5_000) {
            throw new IllegalArgumentException();
        }
        sacar(valor, 200);
    }

    private void sacar(int valor, int nota) {
        int quociente = valor / nota;
        int resto = valor % nota;

        switch (nota) {
            case 200:
                this.quantidadeNotasDuzentos = quociente;
                sacar(resto, 100);
                break;
            case 100:
                this.quantidadeNotasCem = quociente;
                sacar(resto, 50);
                break;
            case 50:
                this.quantidadeNotasCinquenta = quociente;
                sacar(resto, 20);
                break;
            case 20:
                this.quantidadeNotasVinte = quociente;
                sacar(resto, 10);
                break;
            case 10:
                this.quantidadeNotasDez = quociente;
                sacar(resto, 5);
                break;
            case 5:
                this.quantidadeNotasCinco = quociente;
                sacar(resto, 2);
                break;
            case 2:
                this.quantidadeNotasDois = quociente;
                sacar(resto, 1);
                break;
            case 1:
                this.quantidadeNotasUm = quociente;
                break;
        }
    }



}
