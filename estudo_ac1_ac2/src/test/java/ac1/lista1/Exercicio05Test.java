package ac1.lista1;

import ac1.lista1.Exercicio05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio05Test {

    @Test
    public void contadorOcorrenciaIterativoQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio05.contadorOcorrenciaIterativo(null, 0));
    }

    @Test
    public void contadorOcorrenciaIterativoQuandoDezECincoEQuatroEBuscaQuatroRetornaUm() {
        assertEquals(1, Exercicio05.contadorOcorrenciaIterativo(new int[]{10, 5, 4}, 4));
    }

    @Test
    public void contadorOcorrenciaIterativoQuandoMenosDezEMenosSeteEMenosUmEBuscaMenosSeteRetornaDois() {
        assertEquals(2, Exercicio05.contadorOcorrenciaIterativo(new int[]{-10, -7, -7}, -7));
    }


    @Test
    public void contadorOcorrenciaIterativoQuandoMenosDezEQuatroEMenosUmEBuscaDezRetornaTres() {
        assertEquals(3, Exercicio05.contadorOcorrenciaIterativo(new int[]{4, 4, 4}, 4));
    }

    @Test
    public void contadorOcorrenciaIterativoQuandoMenosDezEQuatroEMenosUmEBuscaTrezeRetornaZero() {
        assertEquals(0, Exercicio05.contadorOcorrenciaIterativo(new int[]{10, 2, -7}, 13));
    }


    @Test
    public void contadorOcorrenciaRecursivoQuandoNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio05.contadorOcorrenciaRecursivo(null, 0));
    }

    @Test
    public void contadorOcorrenciaRecursivoQuandoDezECincoEQuatroEBuscaQuatroRetornaUm() {
        assertEquals(1, Exercicio05.contadorOcorrenciaRecursivo(new int[]{10, 5, 4}, 4));
    }

    @Test
    public void contadorOcorrenciaRecursivoQuandoMenosDezEMenosSeteEMenosUmEBuscaMenosSeteRetornaDois() {
        assertEquals(2, Exercicio05.contadorOcorrenciaRecursivo(new int[]{-10, -7, -7}, -7));
    }


    @Test
    public void contadorOcorrenciaRecursivoQuandoMenosDezEQuatroEMenosUmEBuscaDezRetornaTres() {
        assertEquals(3, Exercicio05.contadorOcorrenciaRecursivo(new int[]{4, 4, 4}, 4));
    }

    @Test
    public void contadorOcorrenciaRecursivoQuandoMenosDezEQuatroEMenosUmEBuscaTrezeRetornaZero() {
        assertEquals(0, Exercicio05.contadorOcorrenciaRecursivo(new int[]{10, 2, -7}, 13));
    }

}
