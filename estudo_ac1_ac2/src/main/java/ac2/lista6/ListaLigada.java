package ac2.lista6;

public class ListaLigada {

    // Atributos
    private Node head;              // nó cabeça da lista

    // Construtor
    public ListaLigada() {
        head = new Node(0);     // cria o nó head
    }

    // Métodos

    /* Método insereNode - recebe o valor que será o info do novo nó
       Insere o novo nó logo após o head
     */
    public void insereNode(int valor) {
        Node novo = new Node(valor);    // cria um novo nó com info igual a valor
        novo.setNext(head.getNext());   // nó novo passa a apontar para o nó que era o 1o da lista
        head.setNext(novo);             // head passa a apontar para o nó novo (que se torna o 1o da lista)
    }

    /* Método exibe - percorre a lista, exibindo os infos dos nós
     */
    public void exibe()
    {
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null (enquanto não acabou a lista)
            System.out.println(atual.getInfo());    // exibe o info do atual
            atual = atual.getNext();                // faz atual apontar para o próximo do atual
        }
    }

    /* Método buscaNode - recebe o valor que será pesquisado na lista
       Retorna o endereço do nó, caso encontre o valor ou null, caso não encontre
     */
    public Node buscaNode(int valor) {
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null
            if (atual.getInfo() == valor) {     // se info do atual é o valor procurado
                return atual;                   // então retorna atual (encontreou o nó)
            }
            atual = atual.getNext();            // senão faz atual apontar para o próximo nó
        }
        return null;                        // retorna null (porque percorreu a lista toda e não encontrou o valor)
    }

    /* Método removeNode - recebe o valor que será removido da lista
       Retorna true se conseguiu remover ou false caso contrário
     */
    public Boolean removeNode(int valor) {
        Node ant = head;                    // ant começa valendo head (aponta para o nó anterior ao atual)
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista
        while (atual != null) {             // enquanto atual é diferente de null
            if (atual.getInfo() == valor) {     // se info do atual é o valor procurado
                ant.setNext(atual.getNext());   // então faz ant apontar para o próximo nó do atual
                return true;                    //       e retorna true
            }
            ant = atual;                        // senão "avança" ant
            atual = atual.getNext();            //        e "avança" atual
        }
        return false;                       // retorna false (pq percorreu a lista toda e não encontrou o valor)
    }

    /* Método getTamanho - percorre a lista, calculando o seu tamanho
     */
    public int getTamanho() {
        Node atual = head.getNext();    // atual aponta para o 1o nó da lista
        int tam = 0;                    // tam é inicializado com zero
        while (atual != null) {         // enquanto atual é diferente de null (enquanto não acabou a lista)
            tam++;                      //   incrementa tam
            atual = atual.getNext();    //    e "avança" atual
        }
        return tam;                     // retorna tam
    }

    /* Getter do head */
    public Node getHead() {
        return head;
    }

    /* Método concatena - recebe um objeto lista2 como argumento
       Concatena a lista do objeto atual com a lista recebida como argumento
     */
    public void concatena (ListaLigada lista2) {
        Node ant = head;                    // ant começa valendo head (aponta para o nó anterior ao atual)
        Node atual = head.getNext();        // atual aponta para o 1o nó da lista

        // Percorre a lista para encontrar o último nó
        while (atual != null) {
            ant = atual;
            atual = atual.getNext();
        }

        /* ant aponta para o último nó da lista
           Faz o ant apontar para o primeiro nó da lista2 */
        ant.setNext(lista2.getHead().getNext());
    }

    /* Método compara - recebe um objeto lista2 como argumento
       Compara se as 2 listas são iguais, retornando true em caso afirmativo
       e false em caso negativo
     */
    public Boolean compara (ListaLigada lista2) {
        Node atual = head.getNext();                // atual aponta para 1o nó da lista
        Node atual2 = lista2.getHead().getNext();   // atual2 aponta para 1o nó da lista2

        /* se os tamanhos das 2 listas forem diferentes, retorna false */
        if (getTamanho() != lista2.getTamanho()) {
            return false;
        }

        // Percorre as 2 listas
        while (atual != null) {     // enquanto não percorreu toda a lista
            if (atual.getInfo() != atual2.getInfo()) {  // se info da atual for diferente do info do atual2
                return false;                           // então retorna false
            }
            atual = atual.getNext();                    // senão atualiza o atual e o atual2
            atual2 = atual2.getNext();
        }

        return true;        // se chegou aqui, é porque as listas são iguais
    }


    /* Método inverte - inverte os ponteiros da lista, fazendo com que o 1o nó passe a ser o último,
       o 2o passe a ser o penúltimo e assim sucessivamente
     */
    public void inverte() {
        Node ant = head;                // ant começa apontando para o head
        Node atual = head.getNext();    // atual começa apontando para o 1o nó da lista
        Node aux;                       // auxiliar para salvar o next do atual

        while (atual != null) {         // enquanto não acabou a lista
            aux = atual.getNext();      //   salva em aux o next do atual
            if (ant == head) {          //   se atual é o 1o da lista
                atual.setNext(null);    //   então faz o next do atual receber null (será o último após a inversão)
            }
            else {                      //   senão faz o next do atual receber ant (inverte apontando para o anterior)
                atual.setNext(ant);
            }
            ant = atual;                //   atualiza o ant
            atual = aux;                //   atualiza o atual (com o aux, que é o antigo ponteiro para o próx do atual)
        }

        // após percorrer a lista, falta fazer o head apontar para o último nó da lista, que agora passa a ser o primeiro
        // porém faz isso somente se a lista não estiver vazia
        if (ant != head) {          // se a lista não está vazia
            head.setNext(ant);      // então faz o next do head apontar para o ant, que é o último nó da lista original
        }
    }

    /* Versão recursiva do exibe */
    public void exibeRecursivo (Node atual) {
        if (atual != null) {                    // se não é final da lista
            System.out.println(atual.getInfo());    // então exibe o info do atual
            exibeRecursivo (atual.getNext());       // e chama recursivamente para exibir a partir do próx do atual
        }
    }

    /* Versão recursiva do exibe */
    public Node buscaNodeRecursivo (int valor, Node atual) {
        if (atual == null) {        // se já chegou ao final da lista,
            return null;            // é pq não encontrou o valor e retorna null
        }
        else {
            if (atual.getInfo() == valor) { // se o info do atual é o valor procurado
                return atual;               // então retorna atual
            }
            else {                          // senão chama recursivamente para buscar o nó a partir
                                            // do próximo do atual
                return buscaNodeRecursivo(valor, atual.getNext());
            }
        }
    }

    /* Versão recursiva do removeNode */
    public Boolean removeNodeRecursivo (int valor, Node ant) {
        Node atual = ant.getNext();
        if (atual == null) {        // se já chegou ao final da lista,
            return false;            // é pq não encontrou o valor e retorna false
        }
        else {
            if (atual.getInfo() == valor) { // se o info do atual é o valor procurado
                ant.setNext(atual.getNext()); //  então faz o ant apontar para o next do atual
                return true;                   //       e retorna true
            }
            else {                          // senão chama recursivamente para buscar o nó a partir
                                            // do próximo do atual
                return removeNodeRecursivo(valor, atual);
            }
        }
    }

    /* Versão recursiva do getTamanho */
    public int getTamanhoRecursivo (Node atual) {
        if (atual == null) {    // se  é final da lista
            return 0;           // então retorna zero
        }
        else {                  // senão obtém o tamanho da lista recursivamente a partir do próx do atual
                                //       e retorna esse tamanho + 1
            return getTamanhoRecursivo (atual.getNext()) + 1;
        }
    }

}
