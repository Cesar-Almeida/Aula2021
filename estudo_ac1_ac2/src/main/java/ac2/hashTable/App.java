package ac2.hashTable;

public class App {

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);

        ht.insere(21);
        ht.insere(54);
        ht.insere(15);
        ht.insere(46);
        ht.insere(7);
        ht.insere(33);
        ht.insere(9);

        ht.exibe();

        System.out.println("\n21 está na ht? " + ht.busca(21));
        System.out.println("77 está na ht? " + ht.busca(77));

        System.out.println("\nRemovendo o 21");
        ht.remove(21);

        System.out.println("\nExibindo a hash table após a remoção");
        ht.exibe();
    }
}
