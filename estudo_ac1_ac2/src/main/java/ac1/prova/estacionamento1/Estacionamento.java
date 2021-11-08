package ac1.prova.estacionamento1;

public class Estacionamento {

    private Pilha terreno1;
    private Fila terreno2;


    public Estacionamento() {
        terreno1 = new Pilha(10);
        terreno2 = new Fila(10);
    }

    public void adicionarCarro(int identificador, int estacionamento) {
        if (identificador <= 0) {
            throw new IllegalArgumentException();
        }
        switch (estacionamento) {
            case 1:
                terreno1.push(identificador);
                break;
            case 2:
                terreno2.insert(identificador);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean removerCarro(int identificador, int estacionamento) {
        if (identificador <= 0) {
            throw new IllegalArgumentException();
        }
        switch (estacionamento) {
            case 1:
                Pilha aux1 = new Pilha(10);
                int valor1;

                do {
                    valor1 = terreno1.pop();
                    aux1.push(valor1);
                }
                while (!terreno1.isEmpty() && valor1 != identificador);

                boolean carroEncontrado1 = valor1 == identificador;

                if (carroEncontrado1) {
                    aux1.pop();
                }

                while (!aux1.isEmpty()) {
                    terreno1.push(aux1.pop());
                }

                return carroEncontrado1;
            case 2:
                Fila aux2 = new Fila(10);
                int valor2;

                do {
                    valor2 = terreno2.poll();
                    aux2.insert(valor2);
                } while (!terreno2.isEmpty() && valor2 != identificador);

                boolean carroEncontrado2 = valor2 == identificador;

                while (aux2.getTamanho() != 1) {
                    terreno2.insert(aux2.poll());
                }

                if (!carroEncontrado2) {
                    terreno2.insert(aux2.poll());
                }

                /*
                while ((!carroEncontrado2 && !aux2.isEmpty()) || (carroEncontrado2 && aux2.getTamanho() != 1)) {
                    terreno2.insert(aux2.poll());
                }
                 */

                return carroEncontrado2;

            default:
                throw new IllegalArgumentException();
        }
    }


    public int getQuantidadeVagasOcupadas(int estacionamento) {
        switch (estacionamento) {
            case 1:
                return terreno1.getTopo() + 1;
            case 2:
                return terreno2.getTamanho() ;
            default:
                throw new IllegalArgumentException();
        }
    }
}
