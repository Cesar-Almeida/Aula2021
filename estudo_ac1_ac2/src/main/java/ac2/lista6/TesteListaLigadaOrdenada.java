package ac2.lista6;

public class TesteListaLigadaOrdenada {

    public static void main(String[] args) {
        Node retornado;
        ListaLigadaOrdenada lista = new ListaLigadaOrdenada();

        lista.insereNode(10);
        lista.insereNode(5);
        lista.insereNode(20);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        lista.insereNode(15);
        lista.insereNode(30);
        lista.insereNode(25);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        retornado = lista.buscaNode(12);
        if (retornado == null) {
            System.out.println("Valor 12 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        retornado = lista.buscaNode(25);
        if (retornado == null) {
            System.out.println("Valor 25 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        if (lista.removeNode(20)) {
            System.out.println("Valor 20 removido com sucesso");
        }
        else {
            System.out.println("Valor 20 não foi encontrado para remoção");
        }

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        if (lista.removeNode(27)) {
            System.out.println("Valor 27 removido com sucesso");
        }
        else {
            System.out.println("Valor 27 não foi encontrado para remoção");
        }

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

    }
}
