package ac1.lista1;

import ac1.lista1.Exercicio02;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio02Test {

    @Test
    public void somaRecursivaQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio02.somaRecursiva(null));
    }

    @Test
    public void somaRecursivaQuandoDezECincoEQuatroRetornaDezenove() {
        assertEquals(19, Exercicio02.somaRecursiva(new int[]{10, 5, 4}));
    }

    @Test
    public void somaRecursivaQuandoMenosDezEMenosSeteEMenosUmRetornaMenosDezoito() {
        assertEquals(-18, Exercicio02.somaRecursiva(new int[]{-10, -7, -1}));
    }

    @Test
    public void somaRecursivaQuandoMenosDezEQuatroEMenosUmRetornaMenosSete() {
        assertEquals(-7, Exercicio02.somaRecursiva(new int[]{-10, 4, -1}));
    }


    @Test
    public void somaIterativaQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio02.somaIterativa(null));
    }

    @Test
    public void somaIterativaQuandoDezECincoEQuatroRetornaDezenove() {
        assertEquals(19, Exercicio02.somaIterativa(new int[]{10, 5, 4}));
    }

    @Test
    public void somaIterativaQuandoMenosDezEMenosSeteEMenosUmRetornaMenosDezoito() {
        assertEquals(-18, Exercicio02.somaIterativa(new int[]{-10, -7, -1}));
    }

    @Test
    public void somaIterativaQuandoMenosDezEQuatroEMenosUmRetornaMenosSete() {
        assertEquals(-7, Exercicio02.somaIterativa(new int[]{-10, 4, -1}));
    }

}
