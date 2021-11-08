package reforco;

import java.util.NoSuchElementException;

public class Exemplo01 {

    private int[] vetor;
    private int posicao;

    public Exemplo01(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException();
        }
        vetor = new int[tamanho];
        posicao = 0;
    }

    public boolean isFull() {
        return posicao == vetor.length;
    }

    public boolean isEmpty() {
        return posicao == 0;
    }

    public boolean exists(int valor) {
        return getPosicaoByValor(valor) != -1;
    }

    public void add(int valor) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        } else if (getPosicaoByValor(valor) != -1) {
            throw new IllegalArgumentException();
        }
        vetor[posicao++] = valor;
    }

    public void delete(int valor) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }

        int indice = getPosicaoByValor(valor);
        if (indice == -1) {
            throw new NoSuchElementException();
        }

        for (int i = indice; i < posicao; i++) {
            vetor[i] = vetor[i + 1];
        }
        posicao--;
    }

    private int getPosicaoByValor(int valor) {
        int indice = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                indice = i;
            }
        }
        return indice;
    }

}
