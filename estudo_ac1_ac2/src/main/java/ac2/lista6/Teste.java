package ac2.lista6;

public class Teste {

    public static void main(String[] args) {
        Node retornado;
        ListaLigada lista1 = new ListaLigada();
        ListaLigada lista2 = new ListaLigada();
        ListaLigada lista3 = new ListaLigada();
        ListaLigada lista4 = new ListaLigada();

        lista1.insereNode(10);
        lista1.insereNode(20);
        lista1.insereNode(30);
        lista1.insereNode(40);

        lista2.insereNode(111);
        lista2.insereNode(222);
        lista2.insereNode(333);

        lista3.insereNode(111);
        lista3.insereNode(222);
        lista3.insereNode(333);

        lista4.insereNode(1);
        lista4.insereNode(2);
        lista4.insereNode(3);

        System.out.println("\nLista1:");
        lista1.exibe();

        System.out.println("\nLista2:");
        lista2.exibe();

        lista1.concatena(lista2);
        System.out.println("\nLista1 após a concatenação:");
        lista1.exibe();

        System.out.println("\nLista3:");
        lista3.exibe();

        System.out.println("\nLista4:");
        lista4.exibe();

        System.out.println("Lista1 e Lista3 são iguais? " + lista1.compara(lista2));
        System.out.println("Lista2 e Lista3 são iguais? " + lista2.compara(lista3));
        System.out.println("Lista3 e Lista4 são iguais? " + lista3.compara(lista4));

        lista3.inverte();
        System.out.println("\nLista3 após inverter:");
        lista3.exibe();

        lista4.inverte();
        System.out.println("\nLista4 após inverter:");
        lista4.exibe();

        System.out.println("\nLista4 exibida pelo método recursivo");
        lista4.exibeRecursivo(lista4.getHead().getNext());
        System.out.println("Tamanho da lista: " + lista4.getTamanhoRecursivo(lista4.getHead().getNext()));

        System.out.println("\nTeste do buscaNodeRecursivo:");
        retornado = lista4.buscaNodeRecursivo(2, lista4.getHead().getNext());
        if (retornado == null) {
            System.out.println("Valor 2 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        retornado = lista4.buscaNodeRecursivo(77, lista4.getHead().getNext());
        if (retornado == null) {
            System.out.println("Valor 77 não foi encontrado");
        }
        else {
            System.out.println("Encontrado node com valor " + retornado.getInfo());
        }

        System.out.println("\nTeste do removeNodeRecursivo:");
        if (lista4.removeNodeRecursivo(2, lista4.getHead())) {
            System.out.println("Valor 2 removido com sucesso");
        }
        else {
            System.out.println("Valor 2 não foi encontrado para remoção");
        }

        if (lista4.removeNodeRecursivo(100, lista4.getHead())) {
            System.out.println("Valor 100 removido com sucesso");
        }
        else {
            System.out.println("Valor 100 não foi encontrado para remoção");
        }

        System.out.println("\nLista4 exibida pelo método recursivo após a remoção do valor 2");
        lista4.exibeRecursivo(lista4.getHead().getNext());
        System.out.println("Tamanho da lista: " + lista4.getTamanhoRecursivo(lista4.getHead().getNext()));








    }

}
