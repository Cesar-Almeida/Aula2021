package ac1.prova.estacionamento1;

public class Pilha {
    private int[] vetor;
    private int topo;

    public Pilha(int tamanho) {
        vetor = new int[tamanho];
        topo = -1;
    }

    public boolean isFull() {
        return vetor.length - 1 == topo;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public void push(int valor) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        vetor[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            // Ver nos testes
        }
        return vetor[topo--];
    }

    public int peek() {
        if (isEmpty()) {
            // Ver nos testes
        }
        return vetor[topo];
    }

    public int getTopo() {
        return this.topo;
    }
}
