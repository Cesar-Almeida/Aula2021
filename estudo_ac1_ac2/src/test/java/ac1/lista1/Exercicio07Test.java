package ac1.lista1;

import ac1.lista1.Exercicio07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercicio07Test {

    @Test
    public void maiorRecursivoQuandoVNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio07.maiorRecursivo(null));
    }

    @Test
    public void maiorRecursivoQuandoVDezVinteQuarentaTrintaRetornaQuarenta() {
        assertEquals(40, Exercicio07.maiorRecursivo(new int[]{10, 20, 40, 30}));
    }

    @Test
    public void maiorRecursivoQuandoVSessentaVinteDezTrintaSessentaRetornaSessenta() {
        assertEquals(60, Exercicio07.maiorRecursivo(new int[]{60, 20, 10, 30, 60}));
    }

    @Test
    public void maiorRecursivoQuandoVMenosSessentaMenosVinteMenosDezMenosQuarentaMenosTrintaRetornaMenosDez() {
        assertEquals(-10, Exercicio07.maiorRecursivo(new int[]{-60, -20, -10, -40, -30}));
    }

    @Test
    public void maiorRecursivoQuandoVMenosSessentaMenosVinteDezQuarentaMenosTrintaRetornaMenosQuarenta() {
        assertEquals(40, Exercicio07.maiorRecursivo(new int[]{-60, -20, 10, 40, -30}));
    }

    @Test
    public void maiorIterativoQuandoVNullLancaIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Exercicio07.maiorIterativo(null));
    }

    @Test
    public void maiorIterativoQuandoVDezVinteQuarentaTrintaRetornaQuarenta() {
        assertEquals(40, Exercicio07.maiorIterativo(new int[]{10, 20, 40, 30}));
    }

    @Test
    public void maiorIterativoQuandoVSessentaVinteDezTrintaSessentaRetornaSessenta() {
        assertEquals(60, Exercicio07.maiorIterativo(new int[]{60, 20, 10, 30, 60}));
    }

    @Test
    public void maiorIterativoQuandoVMenosSessentaMenosVinteMenosDezMenosQuarentaMenosTrintaRetornaMenosDez() {
        assertEquals(-10, Exercicio07.maiorIterativo(new int[]{-60, -20, -10, -40, -30}));
    }

    @Test
    public void maiorIterativoQuandoVMenosSessentaMenosVinteDezQuarentaMenosTrintaRetornaMenosQuarenta() {
        assertEquals(40, Exercicio07.maiorIterativo(new int[]{-60, -20, 10, 40, -30}));
    }
}
