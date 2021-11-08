package ac1.lista1;

import ac1.lista1.Exercicio03;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio03Test {

    @Test
    public void somaParRecursivaQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio03.somaParRecursiva(null));
    }

    @Test
    public void somaParRecursivaQuandoDezECincoEQuatroRetornaQuatorze() {
        assertEquals(14, Exercicio03.somaParRecursiva(new int[]{10, 5, 4}));
    }

    @Test
    public void somaParRecursivaQuandoMenosDezEMenosSeteEMenosUmRetornaMenosDez() {
        assertEquals(-10, Exercicio03.somaParRecursiva(new int[]{-10, -7, -1}));
    }


    @Test
    public void somaParRecursivaQuandoMenosDezEQuatroEMenosUmRetornaMenosSeis() {
        assertEquals(-6, Exercicio03.somaParRecursiva(new int[]{-10, 4, -1}));
    }


    @Test
    public void somaParIterativaQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio03.somaParIterativa(null));
    }

    @Test
    public void somaParIterativaQuandoDezECincoEQuatroRetornaQuatorze() {
        assertEquals(14, Exercicio03.somaParIterativa(new int[]{10, 5, 4}));
    }

    @Test
    public void somaParIterativaQuandoMenosDezEMenosSeteEMenosUmRetornaMenosDez() {
        assertEquals(-10, Exercicio03.somaParIterativa(new int[]{-10, -7, -1}));
    }


    @Test
    public void somaParIterativaQuandoMenosDezEQuatroEMenosUmRetornaMenosSeis() {
        assertEquals(-6, Exercicio03.somaParIterativa(new int[]{-10, 4, -1}));
    }

}
