package ac1.lista2;

public class Exercicio01 {
    private int[] vetor;
    private int topo1;
    private int topo2;

    public Exercicio01(int tamanho) {
        vetor = new int[tamanho];
        topo1 = -1;
        topo2 = vetor.length;
    }

    public boolean isFull() {
        return topo2 - topo1 == 1;
        //return topo1 + 1 == topo2;
    }

    public boolean isEmpty(int pilha) {
        switch (pilha) {
            case 1:
                return topo1 == -1;
            case 2:
                return topo2 == vetor.length;
            default:
                throw new IllegalArgumentException();
        }
    }

    public void push(int pilha, int valor) {
        if (isFull()) {
            throw new IndexOutOfBoundsException();
        }
        switch (pilha) {
            case 1:
                vetor[++topo1] = valor;
                break;
            case 2:
                vetor[--topo2] = valor;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int pop(int pilha) {
        if (isEmpty(pilha)) {
            throw new IndexOutOfBoundsException();
        }
        switch (pilha) {
            case 1:
                return vetor[topo1--];
            case 2:
                return vetor[topo2++];
            default:
                throw new IllegalArgumentException();
        }
    }

    public int peek(int pilha) {
        if (isEmpty(pilha)) {
            throw new IndexOutOfBoundsException();
        }
        switch (pilha) {
            case 1:
                return vetor[topo1];
            case 2:
                return vetor[topo2];
            default:
                throw new IllegalArgumentException();
        }
    }

    public void exibir(int pilha) {
        if (isEmpty(pilha)) {
            System.out.println("Pilha vazia");
        }
        switch (pilha) {
            case 1:
                for (int i = 0; i <= topo1; System.out.println(vetor[i++])) ;
                break;
            case 2:
                for (int i = vetor.length - 1; i >= topo2; System.out.println(vetor[i--])) ;
                break;
            default:
                System.out.println("Pilha não encontrada");
        }
    }

    public static Exercicio01 misturar(int[] vetor) {
        Exercicio01 exercicio = new Exercicio01(vetor.length);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= 0) {
                exercicio.push(1, vetor[i]);
            } else {
                exercicio.push(2, vetor[i]);
            }
        }
        return exercicio;
    }


}
