package ac1.lista1;

import ac1.lista1.Exercicio08;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio08Test {

    @Test
    public void somaRecursivaQuandoNZeroRetornaZero() {
        assertEquals(0, Exercicio08.somaRecursvia(0));
    }

    @Test
    public void somaRecursivaQuandoNCentoTrintaDoisRetornaSeis() {
        assertEquals(6, Exercicio08.somaRecursvia(132));
    }

    @Test
    public void somaRecursivaQuandoNMenosCentoTrintaDoisRetornaMenosSeis() {
        assertEquals(-6, Exercicio08.somaRecursvia(-132));
    }

    @Test
    public void somaIterativaQuandoNZeroRetornaZero() {
        assertEquals(0, Exercicio08.somaIterativa(0));
    }

    @Test
    public void somaIterativaQuandoNCentoTrintaDoisRetornaSeis() {
        assertEquals(6, Exercicio08.somaIterativa(132));
    }

    @Test
    public void somaIterativaQuandoNMenosCentoTrintaDoisRetornaMenosSeis() {
        assertEquals(-6, Exercicio08.somaIterativa(-132));
    }

}
