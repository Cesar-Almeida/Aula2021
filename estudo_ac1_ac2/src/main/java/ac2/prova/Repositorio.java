package ac2.prova;

import java.util.NoSuchElementException;

public class Repositorio {

    private Linha linha = new LinhaImpl();

    private Linha getUltimoElemento() {
        Linha aux = linha;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        return aux;
    }

    private Linha getElemento(int valor) {
        Linha aux = linha.getNext();
        while (aux != null && aux.getValor() != valor && aux.getNext() != null) {
            aux = aux.getNext();
        }
        if (aux != null && aux.getValor() == valor) {
            return aux;
        } else {
            return null;
        }
    }

    public int[] findAll() {
        int[] valores = new int[count()];
        Linha aux = linha.getNext();
        for (int i = 0; i < count(); i++) {
            valores[i] = aux.getValor();
            aux = aux.getNext();
        }
        return valores;
    }

    public int[] findAllByOrderByValorAsc() {
        int[] valores = findAll();
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < valores.length - 1; i++) {
                if (valores[i] > valores[i + 1]) {
                    aux = valores[i];
                    valores[i] = valores[i + 1];
                    valores[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return valores;
    }

    public int[] findAllByOderByValorDesc() {
        int[] valores = findAll();
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < valores.length - 1; i++) {
                if (valores[i] < valores[i + 1]) {
                    aux = valores[i];
                    valores[i] = valores[i + 1];
                    valores[i + 1] = aux;
                    troca = true;
                }
            }
        }
        return valores;
    }

    public void save(int valor) {
        if (exists(valor)) {
            throw new IllegalArgumentException();
        }
        Linha ultima = getUltimoElemento();
        Linha retorno = new LinhaImpl(valor);
        ultima.setNext(retorno);
    }

    public void saveAll(int[] valores) {
        if (valores == null) {
            throw new IllegalArgumentException();
        }
        Linha ultima = getUltimoElemento();
        for (int i = 0; i < valores.length; i++) {
            if (!exists(valores[i])) {
                Linha aux = new LinhaImpl(valores[i]);
                ultima.setNext(aux);
                ultima = aux;
            }
        }
    }

    public void deleteAll() {
        if (linha.getNext() == null) {
            throw new IndexOutOfBoundsException();
        }
        linha.setNext(null);
    }

    public void delete(int valor) {
        if (linha.getNext() == null) {
            throw new IndexOutOfBoundsException();
        }
        Linha elemento = getElemento(valor);
        if (elemento == null) {
            throw new NoSuchElementException();
        }
        Linha ultimoAntesElemento = linha;
        while (!ultimoAntesElemento.getNext().equals(elemento)) {
            ultimoAntesElemento = ultimoAntesElemento.getNext();
        }
        Linha primeiroDepoisElemento = elemento.getNext();
        ultimoAntesElemento.setNext(primeiroDepoisElemento);
    }

    public int count() {
        int contador = 0;
        Linha aux = linha.getNext();
        while (aux != null) {
            contador++;
            aux = aux.getNext();
        }
        return contador;
    }

    public boolean exists(int valor) {
        return getElemento(valor) != null;
    }

}
