package ac1.prova.estacionamento2;

public class Estacionamento {

    Pilha terreno;

    public Estacionamento() {
        this.terreno = new Pilha(10);
    }

    public void adicionarCarro(int identificador) {
        if (identificador <= 0) {
            throw new IllegalArgumentException();
        }
        this.terreno.push(identificador);
    }

    public boolean removerCarro(int identificador) {
        if (identificador <= 0) {
            throw new IllegalArgumentException();
        }

        Pilha aux = new Pilha(10);
        int valor;

        do {
            valor = terreno.pop();
            aux.push(valor);
        } while (!terreno.isEmpty() && valor != identificador);

        boolean carroEncontrado = valor == identificador;

        if (carroEncontrado) {
            aux.pop();
        }

        while (!aux.isEmpty()) {
            terreno.push(aux.pop());
        }

        return carroEncontrado;
    }

    public int getQuantidadeVagasOcupadas() {
        return terreno.getTopo() + 1;
    }

}
