package ac2.listaLigada;

public class Teste {

    public static void main(String[] args) {
        Node retornado;
        ListaLigada lista = new ListaLigada();

        lista.insereNode(10);
        lista.insereNode(20);
        lista.insereNode(30);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        lista.insereNode(40);
        lista.insereNode(50);

        lista.exibe();
        System.out.println("Tamanho da lista: " + lista.getTamanho());

        retornado = lista.buscaNode(40);
        if (retornado == null) {
            System.out.println("Valor 40 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        retornado = lista.buscaNode(77);
        if (retornado == null) {
            System.out.println("Valor 77 não foi encontrado");
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

        if (lista.removeNode(100)) {
            System.out.println("Valor 100 removido com sucesso");
        }
        else {
            System.out.println("Valor 100 não foi encontrado para remoção");
        }

    }
}
