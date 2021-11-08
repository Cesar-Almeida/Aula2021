package ac1.lista1;

import ac1.lista1.Exercicio01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio01Test {

    @Test
    public void somaRecursivaQuandoZeroRetornaZero() {
        assertEquals(0, Exercicio01.somaRecursiva(0));
    }

    @Test
    public void somaRecursivaQuandoNegativoLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio01.somaRecursiva(-1));
    }

    @Test
    public void somaRecursivaQuandoCincoRetornaQuinze() {
        assertEquals(15, Exercicio01.somaRecursiva(5));
    }

    @Test
    public void somaRecursivaQuandoDezRetornaCinquentaCinco() {
        assertEquals(55, Exercicio01.somaRecursiva(10));
    }


    @Test
    public void somaIterativaQuandoZeroRetornaZero() {
        assertEquals(0, Exercicio01.somaIterativa(0));
    }

    @Test
    public void somaIterativaQuandoNegativoLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio01.somaIterativa((-1)));
    }

    @Test
    public void somaIterativaQuandoCincoRetornaQuinze() {
        assertEquals(15, Exercicio01.somaIterativa(5));
    }

    @Test
    public void somaIterativaQuandoDezRetornaCinquentaCinco() {
        assertEquals(55, Exercicio01.somaIterativa(10));
    }

}
