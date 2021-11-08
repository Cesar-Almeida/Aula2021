package ac2.prova;

public class LinhaImpl implements Linha {

    private int valor;
    private Linha linha;

    LinhaImpl(int valor) {
        this.valor = valor;
    }

    LinhaImpl() {
        this(0);
    }

    @Override
    public int getValor() {
        return this.valor;
    }

    @Override
    public Linha getNext() {
        return this.linha;
    }

    @Override
    public void setNext(Linha linha) {
        this.linha = linha;
    }

}
