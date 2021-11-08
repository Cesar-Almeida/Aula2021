package ac1.prova;

import ac1.prova.estacionamento1.Estacionamento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Estacionamento1Test {

    @Test
    public void adicionarCarroQuandoQuatroCarrosEstacionamentoUmQuantidadeVagasOcupadasIgualQuatro() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
    }

    @Test
    public void adicionarCarroQuandoMaiorDezEstacionamentoUmLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(5, 1);
        estacionamento.adicionarCarro(6, 1);
        estacionamento.adicionarCarro(7, 1);
        estacionamento.adicionarCarro(8, 1);
        estacionamento.adicionarCarro(9, 1);
        estacionamento.adicionarCarro(10, 1);
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.adicionarCarro(11, 1));
    }

    @Test
    public void adicionarCarroQuandoQuatroCarrosEstacionamentoDoisQuantidadeVagasOcupadasIgualQuatro() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void adicionarCarroQuandoMaiorDezEstacionamentoDoisLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        estacionamento.adicionarCarro(5, 2);
        estacionamento.adicionarCarro(6, 2);
        estacionamento.adicionarCarro(7, 2);
        estacionamento.adicionarCarro(8, 2);
        estacionamento.adicionarCarro(9, 2);
        estacionamento.adicionarCarro(10, 2);
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.adicionarCarro(11, 2));
    }

    @Test
    public void adicionarCarroQuandoQuatroCarrosEstacionamentoUmDoisQuantidadeVagasOcupadasIgualQuatroETres() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorMenorIgualZeroLancaIllegalArgumentException() {
        Estacionamento estacionamento = new Estacionamento();
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(0, 1));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1, 1));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1000, 1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorMenorIgualZeroLancaIllegalArgumentException() {
        Estacionamento estacionamento = new Estacionamento();
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(0, 2));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1000, 2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(2, 1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(2, 2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(2, 1));
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(2, 2));
    }


    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorUmExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(1, 1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorUmExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(1, 2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorUmExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(1, 1));
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(1, 2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorUmDoisTresQuatroExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(3, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(4, 1));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorUmDoisTresQuatroExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(3, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(4, 2));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorUmDoisTresQuatroExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(3, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(4, 1));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(1));
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(3, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(4, 2));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorNaoExisteEVazioLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(1));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1, 1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorNaoExisteEVazioLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(2));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1, 2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorNaoExisteEVazioLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(1, 2);
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(1));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1, 1));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas(2));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1, 2));
    }


    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorUmEDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(1, 1));
        assertFalse(estacionamento.removerCarro(2, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorUmEDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(1, 2));
        assertFalse(estacionamento.removerCarro(2, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorUmEDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(1, 1));
        assertTrue(estacionamento.removerCarro(2, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(1, 1));
        assertFalse(estacionamento.removerCarro(2, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(1, 2));
        assertTrue(estacionamento.removerCarro(2, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(1, 2));
        assertFalse(estacionamento.removerCarro(2, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmIdentificadorQuatroETresExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(3, 1));
        assertTrue(estacionamento.removerCarro(4, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(3, 1));
        assertFalse(estacionamento.removerCarro(4, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
    }

    @Test
    public void removerCarroQuandoEstacionamentoDoisIdentificadorQuatroETresExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(3, 2));
        assertTrue(estacionamento.removerCarro(4, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(3, 2));
        assertFalse(estacionamento.removerCarro(4, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
    }

    @Test
    public void removerCarroQuandoEstacionamentoUmDoisIdentificadorQuatroETresExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1, 1);
        estacionamento.adicionarCarro(2, 1);
        estacionamento.adicionarCarro(3, 1);
        estacionamento.adicionarCarro(4, 1);
        estacionamento.adicionarCarro(1, 2);
        estacionamento.adicionarCarro(2, 2);
        estacionamento.adicionarCarro(3, 2);
        estacionamento.adicionarCarro(4, 2);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(1));
        assertTrue(estacionamento.removerCarro(3, 1));
        assertTrue(estacionamento.removerCarro(4, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertFalse(estacionamento.removerCarro(3, 1));
        assertFalse(estacionamento.removerCarro(4, 1));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(1));
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas(2));
        assertTrue(estacionamento.removerCarro(3, 2));
        assertTrue(estacionamento.removerCarro(4, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
        assertFalse(estacionamento.removerCarro(3, 2));
        assertFalse(estacionamento.removerCarro(4, 2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas(2));
    }

}
