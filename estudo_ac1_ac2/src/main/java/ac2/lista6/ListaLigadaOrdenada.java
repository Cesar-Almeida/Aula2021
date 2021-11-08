package ac2.lista6;

public class ListaLigadaOrdenada extends ListaLigada {

    // Construtor
    public ListaLigadaOrdenada() {
        super();
    }

    // Métodos

    /* Método insereNode - recebe o valor que será o info do novo nó
       Método sobrescrito para que insira de forma que a lista sempre
       esteja ordenada (a partir do head)
     */
    @Override
    public void insereNode(int valor) {
        Node ant = getHead();                   // ant aponta para o head
        Node atual = getHead().getNext();       // atual aponta para o 1o nó da lista
        Node novo = new Node(valor);            // Cria o novo nó, com info igual a valor
        Boolean inseriu = false;                // inseriu é inicializado com false

        while (atual != null && !inseriu) {     // enquanto náo percorreu toda a lista e enquanto náo inseriu
            if (valor <= atual.getInfo()) {     // se achou o lugar onde inserir, deve inserir entre o ant e o atual
                ant.setNext(novo);              // então faz o ant apontar para o novo
                novo.setNext(atual);            //       e o novo apontar para o atual
                inseriu = true;                 //       e seta que já inseriu
            }
            else {
                ant = atual;                    // senão atualiza o ant e o atual
                atual = atual.getNext();
            }
        }

        /* se saiu do loop e não inseriu, é pq ou a lista estava originalmente vazia
           ou porque o valor a ser inserido era maior do que todos da lista */
        if (!inseriu) {             // Se não inseriu
            ant.setNext(novo);      // então faz o ant apontar para o novo
                                    //       se a lista estava vazia antes, ant é o head e o novo passa a ser o único nó da lista
                                    //       se a lista não estava vazia, ant é o último nó da lista, e o novo passa a ser o último
        }
    }

    /* Método buscaNode - recebe o valor que será pesquisado na lista
       Retorna o endereço do nó, caso encontre o valor ou null, caso não encontre
       Este método foi sobrescrito para que deixe de percorrer a lista qdo o valor
       procurado for menor do que o atual.getInfo(), pois a lista está ordenada
       Dessa forma, consegue concluir mais rapidamente que o valor não está na lista
     */
    @Override
    public Node buscaNode(int valor) {
        Node atual = getHead().getNext();        // atual aponta para o 1o nó da lista
        while (atual != null && valor >= atual.getInfo()) {   // enquanto atual é diferente de null E valor sendo procurado for >= info do atual
            if (atual.getInfo() == valor) {                     // se info do atual é o valor procurado
                return atual;                                   // então retorna atual (encontreou o nó)
            }
            atual = atual.getNext();                             // senão faz atual apontar para o próximo nó
        }
        return null;                             // retorna null (porque percorreu a lista toda e não encontrou o valor)
    }

    /* Método removeNode - recebe o valor que será removido da lista
       Retorna true se conseguiu remover ou false caso contrário
       Este método foi sobrescrito para que deixe de percorrer a lista qdo o valor
       procurado for menor do que o atual.getInfo(), pois a lista está ordenada
       Dessa forma, consegue concluir mais rapidamente que o valor não está na lista
     */
    @Override
    public Boolean removeNode(int valor) {
        Node ant = getHead();                    // ant começa valendo head (aponta para o nó anterior ao atual)
        Node atual = getHead().getNext();        // atual aponta para o 1o nó da lista
        while (atual != null && valor >= atual.getInfo()) {   // enquanto atual é diferente de null E valor sendo procurado for >= info do atual
            if (atual.getInfo() == valor) {                       // se info do atual é o valor procurado
                ant.setNext(atual.getNext());                     // então faz ant apontar para o próximo nó do atual
                return true;                                      //       e retorna true
            }
            ant = atual;                                         // senão "avança" ant
            atual = atual.getNext();                             //        e "avança" atual
        }
        return false;                       // retorna false (pq percorreu a lista toda e não encontrou o valor)
    }

}
