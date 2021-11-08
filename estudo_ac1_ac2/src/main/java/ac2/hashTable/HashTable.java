package ac2.hashTable;

public class HashTable {

    // Atributo
    private ListaLigada[] table;

    // Construtor
    public HashTable(int tam) {
        this.table = new ListaLigada[tam];
        for (int i = 0; i < table.length; i++) {
            table[i] = new ListaLigada();
        }
    }

    // Métodos

    public int funcaoHash(int valor){
        int tam = table.length;
        int lugar = valor%tam;
        return lugar;
    }

    public void insere(int valor) {
        this.table[funcaoHash(valor)].insereNode(valor);
    }

    public boolean busca(int valor) {
        return this.table[funcaoHash(valor)]
                .buscaNode(valor) == null ? false : true;
    }

    public boolean remove(int valor) {
        return this.table[funcaoHash(valor)]
                .removeNode(valor);
    }

    public void exibe(){
        for (ListaLigada lista: this.table) {
            lista.exibe();
        }
    }





}
