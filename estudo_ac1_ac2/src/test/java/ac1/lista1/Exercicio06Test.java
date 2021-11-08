package ac1.lista1;

import ac1.lista1.Exercicio06;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio06Test {

    @Test
    public void euclidesRecursivoQuandoN1MenorIgualZeroLancaIllegalArgumentException() {
        //assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(0, 2));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(-10, 2));
    }

    @Test
    public void euclidesRecursivoQuandoN2MenorIgualZeroLancaIllegalArgumentException() {
        //assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(2, 0));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(2, -1));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesRecursivo(2, -10));
    }

    @Test
    public void euclidesRecursivoQuandoN1NoventaEN2CinquentaQuatroRetornaDezoito() {
        assertEquals(18, Exercicio06.euclidesRecursivo(90, 54));
    }

    @Test
    public void euclidesRecursivoQuandoN1CinquentaQuatroEN2NoventaRetornaDezoito() {
        assertEquals(18, Exercicio06.euclidesRecursivo(54, 90));
    }

    @Test
    public void euclidesRecursivoQuandoN1UmEN2UmRetornaUm() {
        assertEquals(1, Exercicio06.euclidesRecursivo(1, 1));
    }


    @Test
    public void euclidesIterativoQuandoN1MenorIgualZeroLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(0, 2));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(-10, 2));
    }

    @Test
    public void euclidesIterativoQuandoN2MenorIgualZeroLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(2, 0));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(2, -1));
        assertThrows(IllegalArgumentException.class, () -> Exercicio06.euclidesIterativo(2, -10));
    }

    @Test
    public void euclidesIterativoQuandoN1NoventaEN2CinquentaQuatroRetornaDezoito() {
        assertEquals(18, Exercicio06.euclidesIterativo(90, 54));
    }

    @Test
    public void euclidesIterativoQuandoN1UmEN2UmRetornaUm() {
        assertEquals(1, Exercicio06.euclidesIterativo(1, 1));
    }

    @Test
    public void euclidesIterativoQuandoN1OitentaSeteEN2OitentaSeteRetornaOitentaSete() {
        assertEquals(87, Exercicio06.euclidesIterativo(87, 87));
    }

    @Test
    public void euclidesIterativoQuandoN1CinquentaQuatroEN2NoventaRetornaDezoito() {
        assertEquals(18, Exercicio06.euclidesIterativo(54, 90));
    }
}
