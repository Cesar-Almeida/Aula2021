package ac1.lista1;

import ac1.lista1.Exercicio09;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio09Test {

    @Test
    public void binarioRecursivoQuandoNegativoLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio09.binarioRecursivo(-1));
        assertThrows(IllegalArgumentException.class, () -> Exercicio09.binarioRecursivo(-20));
    }

    @Test
    public void binarioRecursivoQuandoDozeRetornaUmUmZeroZero() {
        assertEquals("1100", Exercicio09.binarioRecursivo(12));
    }

    @Test
    public void binarioRecursivoQuandoNoveRetornaUmZeroZeroUm() {
        assertEquals("1001", Exercicio09.binarioRecursivo(9));
    }

    @Test
    public void binarioRecursivoQuandoTrintaDoisRetornaUmZeroZeroZeroZeroZero() {
        assertEquals("100000", Exercicio09.binarioRecursivo(32));
    }

    @Test
    public void binarioRecursivoQuandoZeroRetornaZero() {
        assertEquals("0", Exercicio09.binarioRecursivo(0));
    }

    @Test
    public void binarioIterativoQuandoNegativoLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio09.binarioIterativo(-1));
        assertThrows(IllegalArgumentException.class, () -> Exercicio09.binarioIterativo(-20));
    }

    @Test
    public void binarioIterativoQuandoDozeRetornaUmUmZeroZero() {
        assertEquals("1100", Exercicio09.binarioIterativo(12));
    }

    @Test
    public void binarioIterativoQuandoNoveRetornaUmZeroZeroUm() {
        assertEquals("1001", Exercicio09.binarioIterativo(9));
    }

    @Test
    public void binarioIterativoQuandoTrintaDoisRetornaUmZeroZeroZeroZeroZero() {
        assertEquals("100000", Exercicio09.binarioIterativo(32));
    }

}
