package ac1.lista1;

import ac1.lista1.Exercicio04;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio04Test {

    @Test
    public void contadorImparRecursivoQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio04.contadorImparRecursivo(null));
    }

    @Test
    public void contadorImparRecursivoQuandoDezECincoEQuatroRetornaUm() {
        assertEquals(1, Exercicio04.contadorImparRecursivo(new int[]{10, 5, 4}));
    }

    @Test
    public void contadorImparRecursivoQuandoMenosDezEMenosSeteEMenosUmRetornaDois() {
        assertEquals(2, Exercicio04.contadorImparRecursivo(new int[]{-10, -7, -1}));
    }


    @Test
    public void contadorImparRecursivoQuandoMenosDezEQuatroEMenosUmRetornaUm() {
        assertEquals(1, Exercicio04.contadorImparRecursivo(new int[]{-10, 4, -1}));
    }


    @Test
    public void contadorImparIterativoQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio04.contadorImparIterativo(null));
    }

    @Test
    public void contadorImparIterativoQuandoDezECincoEQuatroRetornaUm() {
        assertEquals(1, Exercicio04.contadorImparIterativo(new int[]{10, 5, 4}));
    }

    @Test
    public void contadorImparIterativoQuandoMenosDezEMenosSeteEMenosUmRetornaDois() {
        assertEquals(2, Exercicio04.contadorImparIterativo(new int[]{-10, -7, -1}));
    }


    @Test
    public void contadorImparIterativoQuandoMenosDezEQuatroEMenosUmRetornaUm() {
        assertEquals(1, Exercicio04.contadorImparIterativo(new int[]{-10, 4, -1}));
    }

}
