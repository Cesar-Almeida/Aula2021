package ac1.prova.estacionamento1;

public class Fila {

    private int[] vetor;
    private int tamanho;

    public Fila(int tamanho) {
        this.vetor = new int[tamanho];
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == vetor.length;
    }

    public void insert(int valor) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        vetor[tamanho++] = valor;
    }

    public int poll() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        int valor = vetor[0];
        for (int i = 1; i < tamanho; i++) {
            vetor[i - 1] = vetor[i];
        }
        tamanho--;
        return valor;
    }

    public int peek() {
        return vetor[0];
    }

    public int getTamanho() {
        return this.tamanho;
    }

}
