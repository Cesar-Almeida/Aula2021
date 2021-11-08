package ac1.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercicio01Test {

    @Test
    public void isFullTrueQuandoPilha1Preenchida() {
        Exercicio01 exercicio = new Exercicio01(5);
        exercicio.push(1, 10);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 20);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 30);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 40);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 50);
        assertTrue(exercicio.isFull());
    }

    @Test
    public void isFullTrueQuandoPilha2Preenchida() {
        Exercicio01 exercicio = new Exercicio01(5);
        exercicio.push(2, 10);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 20);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 30);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 40);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 50);
        assertTrue(exercicio.isFull());
    }

    @Test
    public void isFullTrueQuandoPilha1PreenchidaPilha2Preenchida() {
        Exercicio01 exercicio = new Exercicio01(5);
        exercicio.push(2, 10);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 20);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 30);
        assertFalse(exercicio.isFull());
        exercicio.push(1, 40);
        assertFalse(exercicio.isFull());
        exercicio.push(2, 50);
        assertTrue(exercicio.isFull());
    }

    @Test
    public void isEmptyQuandoPilha1Vazia() {
        Exercicio01 exercicio = new Exercicio01(8);
        assertTrue(exercicio.isEmpty(1));
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(1, 40);
        exercicio.push(1, 50);
        exercicio.push(1, 60);
        exercicio.push(1, 70);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertFalse(exercicio.isEmpty(1));
        exercicio.pop(1);
        assertTrue(exercicio.isEmpty(1));
    }

    @Test
    public void isEmptyQuandoPilha2Vazia() {
        Exercicio01 exercicio = new Exercicio01(8);
        assertTrue(exercicio.isEmpty(2));
        exercicio.push(2, 10);
        exercicio.push(2, 20);
        exercicio.push(2, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        exercicio.push(2, 70);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertFalse(exercicio.isEmpty(2));
        exercicio.pop(2);
        assertTrue(exercicio.isEmpty(2));
    }

    @Test
    public void isEmptyQuandoPilhaNaoEncontradaLancaIllegalArgumentException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IllegalArgumentException.class, () -> exercicio.isEmpty(3));
        assertThrows(IllegalArgumentException.class, () -> exercicio.isEmpty(-1));
    }

    @Test
    public void peekQuandoPilha1IndiceDoisRetornaTrinta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(30, exercicio.peek(1));
    }

    @Test
    public void peekQuandoPilha2IndiceDoisRetornaSessenta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(60, exercicio.peek(2));
    }

    @Test
    public void peekQuandoPilha1VaziaLancaIndexOutOfBoundsException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.peek(1));
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.pop(1);
        exercicio.pop(1);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.peek(1));
    }

    @Test
    public void peekQuandoPilha2VaziaLancaIndexOutOfBoundsException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.peek(2));
        exercicio.push(2, 10);
        exercicio.push(2, 20);
        exercicio.pop(2);
        exercicio.pop(2);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.peek(2));
    }

    @Test
    public void peekQuandoPilhaNaoEncontradaLancaIllegalArgumentException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IllegalArgumentException.class, () -> exercicio.peek(3));
        assertThrows(IllegalArgumentException.class, () -> exercicio.peek(-1));
    }

    @Test
    public void popLancaIndexOutOfBoundsExceptionQuandoPilha1Vazia() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.pop(1));
        exercicio.push(1, 2);
        exercicio.push(1, 3);
        exercicio.pop(1);
        exercicio.pop(1);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.pop(1));
    }

    @Test
    public void popLancaIndexOutOfBoundsExceptionQuandoPilha2Vazia() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.pop(2));
        exercicio.push(2, 2);
        exercicio.push(2, 3);
        exercicio.pop(2);
        exercicio.pop(2);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.pop(2));
    }

    @Test
    public void popQuandoPilha1RetornaTrinta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(30, exercicio.pop(1));
    }

    @Test
    public void popQuandoPilha1RetornaVinte() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(30, exercicio.pop(1));
        assertEquals(20, exercicio.pop(1));
    }

    @Test
    public void popQuandoPilha2RetornaSessenta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(60, exercicio.pop(2));
    }

    @Test
    public void popQuandoPilha2RetornaCinquenta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(60, exercicio.pop(2));
        assertEquals(50, exercicio.pop(2));
    }

    @Test
    public void popQuandoPilha1Pilha2RetornaVintaECinquenta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        exercicio.push(1, 20);
        exercicio.push(1, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        assertEquals(60, exercicio.pop(2));
        assertEquals(30, exercicio.pop(1));
        assertEquals(50, exercicio.pop(2));
        assertEquals(20, exercicio.pop(1));
    }

    @Test
    public void popQuandoPilhaNaoExisteLancaIllegalArgumentException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IllegalArgumentException.class, () -> exercicio.pop(3));
        assertThrows(IllegalArgumentException.class, () -> exercicio.pop(-1));
    }

    @Test
    public void pushLancaIndexOutOfBoundsExceptionQuandoPilha1Cheia() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 30);
        exercicio.push(1, 40);
        exercicio.push(1, 50);
        exercicio.push(1, 60);
        exercicio.push(1, 70);
        exercicio.push(1, 80);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.push(1, 90));
    }

    @Test
    public void pushLancaIndexOutOfBoundsExceptionQuandoPilha2Cheia() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(2, 30);
        exercicio.push(2, 40);
        exercicio.push(2, 50);
        exercicio.push(2, 60);
        exercicio.push(2, 70);
        exercicio.push(2, 80);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.push(2, 90));
    }

    @Test
    public void pushLancaIndexOutOfBoundsExceptionQuandoPilha1EPilha2Cheia() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 30);
        exercicio.push(1, 40);
        exercicio.push(1, 50);
        exercicio.push(2, 60);
        exercicio.push(2, 70);
        exercicio.push(2, 80);
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.push(1, 90));
        assertThrows(IndexOutOfBoundsException.class, () -> exercicio.push(2, 90));
    }

    @Test
    public void pushQuandoPilha1RetornaTrinta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(1, 10);
        assertEquals(10, exercicio.peek(1));
        exercicio.push(1, 20);
        assertEquals(20, exercicio.peek(1));
        exercicio.push(1, 30);
        assertEquals(30, exercicio.peek(1));
        exercicio.push(2, 40);
        assertEquals(40, exercicio.peek(2));
        assertEquals(30, exercicio.peek(1));
    }

    @Test
    public void pushQuandoPilha2RetornaSessenta() {
        Exercicio01 exercicio = new Exercicio01(6);
        exercicio.push(2, 40);
        assertEquals(40, exercicio.peek(2));
        exercicio.push(2, 50);
        assertEquals(50, exercicio.peek(2));
        exercicio.push(2, 60);
        assertEquals(60, exercicio.peek(2));
        exercicio.push(1, 10);
        assertEquals(10, exercicio.peek(1));
        assertEquals(60, exercicio.peek(2));
    }

    @Test
    public void pushQuandoPilhaNaoExisteLancaIllegalArgumentException() {
        Exercicio01 exercicio = new Exercicio01(6);
        assertThrows(IllegalArgumentException.class, () -> exercicio.push(3, 10));
        assertThrows(IllegalArgumentException.class, () -> exercicio.push(-1, 10));
    }

    @Test
    public void misturarQuandoPositivoRetornaPilha1PreenchidaOrdemInversaPilha2Vazia() {
        Exercicio01 exercicio = Exercicio01.misturar(new int[]{1, 2, 40, 50, 100});
        assertTrue(exercicio.isEmpty(2));
        assertFalse(exercicio.isEmpty(1));
        assertEquals(100, exercicio.pop(1));
        assertEquals(50, exercicio.pop(1));
        assertEquals(40, exercicio.pop(1));
        assertEquals(2, exercicio.pop(1));
        assertEquals(1, exercicio.pop(1));
    }

    @Test
    public void misturarQuandoNegativoRetornaPilha1VaziaPilha2PreenchidaOrdemInversa() {
        Exercicio01 exercicio = Exercicio01.misturar(new int[]{-1, -2, -40, -50, -100});
        assertFalse(exercicio.isEmpty(2));
        assertTrue(exercicio.isEmpty(1));
        assertEquals(-100, exercicio.pop(2));
        assertEquals(-50, exercicio.pop(2));
        assertEquals(-40, exercicio.pop(2));
        assertEquals(-2, exercicio.pop(2));
        assertEquals(-1, exercicio.pop(2));
    }

    @Test
    public void misturarQuandoPositivoNegativoRetornaPilha1PreenchidaOrdemInversaPilha2PreenchidaOrdemInversa() {
        Exercicio01 exercicio = Exercicio01.misturar(new int[]{-1, -2, 40, 50, -100});
        assertFalse(exercicio.isEmpty(2));
        assertFalse(exercicio.isEmpty(1));
        assertEquals(-100, exercicio.pop(2));
        assertEquals(50, exercicio.pop(1));
        assertEquals(-2, exercicio.pop(2));
        assertEquals(40, exercicio.pop(1));
        assertEquals(-1, exercicio.pop(2));
    }

}
