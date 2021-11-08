package reforco;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;


public class Exemplo01Test {

    @Test
    public void seTamanhoMenorIgualZeroLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Exemplo01(0));
        assertThrows(IllegalArgumentException.class, () -> new Exemplo01(-10));
        assertThrows(IllegalArgumentException.class, () -> new Exemplo01(-100));
    }

    @Test
    public void adcionarSeCheioLancaIndexOutOfBoundsExceptionEIsFullTrue() {
        Exemplo01 exemplo = new Exemplo01(2);
        exemplo.add(20);
        exemplo.add(-1);
        assertThrows(IndexOutOfBoundsException.class, () -> exemplo.add(10));
        assertTrue(exemplo.isFull());
    }

    @Test
    public void isFullFalseEnquantoPosicaoMenorTamanho() {
        Exemplo01 exemplo = new Exemplo01(5);
        exemplo.add(-10);
        exemplo.add(1);
        exemplo.add(10);
        assertFalse(exemplo.isFull());
    }

    @Test
    public void isEmptyTrueEnquantoPosicaoIgualZero() {
        Exemplo01 exemplo = new Exemplo01(5);
        assertTrue(exemplo.isEmpty());
    }

    @Test
    public void isEmptyFalseEnquantoPosicaoMaiorZero() {
        Exemplo01 exemplo = new Exemplo01(5);
        exemplo.add(-10);
        exemplo.add(1);
        exemplo.add(10);
        assertFalse(exemplo.isEmpty());
    }

    @Test
    public void isFullTrueEnquantoPosicaoMenorTamanho() {
        Exemplo01 exemplo = new Exemplo01(5);
        exemplo.add(-10);
        exemplo.add(5);
        exemplo.add(50);
        exemplo.add(20);
        exemplo.add(30);
        assertTrue(exemplo.isFull());
    }

    @Test
    public void adicionarSeDezEntaoExistsTrue() {
        Exemplo01 exemplo = new Exemplo01(2);
        exemplo.add(10);
        assertTrue(exemplo.exists(10));
    }

    @Test
    public void adicionarSeMenosDezEntaoExistsTrue() {
        Exemplo01 exemplo = new Exemplo01(2);
        exemplo.add(-10);
        assertTrue(exemplo.exists(-10));
    }

    @Test
    public void deleteQuandoVazioLancaIndexOutOfBoundsException() {
        Exemplo01 exemplo = new Exemplo01(10);
        assertThrows(IndexOutOfBoundsException.class, () -> exemplo.delete(10));
    }

    @Test
    public void deleteQuandoValorNaoExisteLancaNoSuchElementException() {
        Exemplo01 exemplo = new Exemplo01(10);
        exemplo.add(-50);
        exemplo.add(10);
        exemplo.add(60);
        assertThrows(NoSuchElementException.class, () -> exemplo.delete(25));
    }

    @Test
    public void deleteQuandoCinquentaExistsFalse() {
        Exemplo01 exemplo = new Exemplo01(5);
        exemplo.add(50);
        exemplo.add(-50);
        exemplo.add(10);
        exemplo.delete(50);
        assertFalse(exemplo.exists(50));
    }

    @Test
    public void deleteQuandoMenosCinquentaExistsFalse() {
        Exemplo01 exemplo = new Exemplo01(5);
        exemplo.add(50);
        exemplo.add(-50);
        exemplo.add(10);
        exemplo.delete(-50);
        assertFalse(exemplo.exists(-50));
    }

}


