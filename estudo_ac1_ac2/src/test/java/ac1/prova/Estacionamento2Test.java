package ac1.prova.estacionamento2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Estacionamento2Test {

    @Test
    public void adicionarCarroQuandoQuatroCarrosQuantidadeVagasOcupadasIgualQuatro() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
    }


    @Test
    public void adicionarCarroQuandoMaiorDezLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        estacionamento.adicionarCarro(5);
        estacionamento.adicionarCarro(6);
        estacionamento.adicionarCarro(7);
        estacionamento.adicionarCarro(8);
        estacionamento.adicionarCarro(9);
        estacionamento.adicionarCarro(10);
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.adicionarCarro(11));
    }

    @Test
    public void removerCarroQuandoIdentificadorMenorIgualZeroLancaIllegalArgumentException() {
        Estacionamento estacionamento = new Estacionamento();
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(0));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1));
        assertThrows(IllegalArgumentException.class, () -> estacionamento.removerCarro(-1000));
    }


    @Test
    public void removerCarroQuandoIdentificadorMaiorZeroESemCarrosLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(5));
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(7));
    }

    @Test
    public void removerCarroQuandoIdentificadorDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(2));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas());
        assertFalse(estacionamento.removerCarro(2));
    }


    @Test
    public void removerCarroQuandoIdentificadorUmExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas());
        assertFalse(estacionamento.removerCarro(1));
    }

    @Test
    public void removerCarroQuandoIdentificadorUmDoisTresQuatroExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(1));
        assertEquals(3, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(3));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(2));
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(4));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas());
    }

    @Test
    public void removerCarroQuandoIdentificadorNaoExisteEVazioLancaIndexOutOfBoundsException() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        assertEquals(1, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(1));
        assertEquals(0, estacionamento.getQuantidadeVagasOcupadas());
        assertThrows(IndexOutOfBoundsException.class, () -> estacionamento.removerCarro(1));
    }

    @Test
    public void removerCarroQuandoIdentificadorUmEDoisExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(1));
        assertTrue(estacionamento.removerCarro(2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas());
        assertFalse(estacionamento.removerCarro(1));
        assertFalse(estacionamento.removerCarro(2));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas());
    }

    @Test
    public void removerCarroQuandoIdentificadorQuatroETresExisteRetornaTrue() {
        Estacionamento estacionamento = new Estacionamento();
        estacionamento.adicionarCarro(1);
        estacionamento.adicionarCarro(2);
        estacionamento.adicionarCarro(3);
        estacionamento.adicionarCarro(4);
        assertEquals(4, estacionamento.getQuantidadeVagasOcupadas());
        assertTrue(estacionamento.removerCarro(3));
        assertTrue(estacionamento.removerCarro(4));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas());
        assertFalse(estacionamento.removerCarro(3));
        assertFalse(estacionamento.removerCarro(4));
        assertEquals(2, estacionamento.getQuantidadeVagasOcupadas());
    }

}
