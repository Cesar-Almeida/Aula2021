package ac2.prova;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class RepositorioTest {

    @Test
    public void saveQuandoUnicoAdicionaElementos() {
        Repositorio repositorio = new Repositorio();
        assertEquals(0, repositorio.count());
        repositorio.save(1);
        repositorio.save(30);
        repositorio.save(89);
        assertEquals(3, repositorio.count());
    }

    @Test
    public void saveQuandoDuplicadoLancaIllegalArgumentException() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(1);
        repositorio.save(30);
        repositorio.save(78);
        assertThrows(IllegalArgumentException.class, () -> repositorio.save(1));
    }

    @Test
    public void saveQuandoMultiplosValoresDistintosAdicionaElementos() {
        Repositorio repositorio = new Repositorio();
        for (int i = 0; i < 1000; i++) {
            repositorio.save(i);
        }
        assertEquals(1000, repositorio.count());
    }

    @Test
    public void saveAllQuandoValoresNullLancaIllegalArgumentException() {
        Repositorio repositorio = new Repositorio();
        assertThrows(IllegalArgumentException.class, () -> repositorio.saveAll(null));
    }

    @Test
    public void saveAllQuandoValoresTresElementosAdicionaElementos() {
        Repositorio repositorio = new Repositorio();
        repositorio.saveAll(new int[]{1, 6, 7, 10});
        assertEquals(4, repositorio.count());
    }

    @Test
    public void saveAllQuandoValoresJaExistemApenasIgnoraDuplicados() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(5);
        repositorio.saveAll(new int[]{1, 5, 6});
        assertEquals(3, repositorio.count());
    }

    @Test
    public void saveAllQuandoValoresDuplicadosApenasIgnoraDuplicados() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(5);
        repositorio.saveAll(new int[]{1, 2, 2, 10, 20});
        assertEquals(5, repositorio.count());
    }

    @Test
    public void deleteAllQuandoVazioLancaIndexOutOfBoundsException() {
        Repositorio repositorio = new Repositorio();
        assertThrows(IndexOutOfBoundsException.class, repositorio::deleteAll);
    }

    @Test
    public void deleteAllCountIgualZero() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(5);
        repositorio.save(10);
        assertEquals(2, repositorio.count());
        repositorio.deleteAll();
        assertEquals(0, repositorio.count());
    }

    @Test
    public void deleteValorInexistenteLancaNoSuchElementException() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(5);
        assertThrows(NoSuchElementException.class, () -> repositorio.delete(7));
    }

    @Test
    public void deleteVazioLancaIndexOutOfBoundsException() {
        Repositorio repositorio = new Repositorio();
        assertThrows(IndexOutOfBoundsException.class, () -> repositorio.delete(7));
    }

    @Test
    public void deleteValorQuandoDoisElementosEQuandoExisteDecrementaCount() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(1);
        repositorio.save(10);
        assertEquals(2, repositorio.count());
        repositorio.delete(1);
        assertEquals(1, repositorio.count());
    }

    @Test
    public void deleteValorQuandoUmValorEQuandoExisteDecrementaCount() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(1);
        assertEquals(1, repositorio.count());
        repositorio.delete(1);
        assertEquals(0, repositorio.count());
    }


    @Test
    public void deleteValorQuandoDezValoresEQuandoExisteDecrementaCount() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(0);
        repositorio.save(13);
        repositorio.save(12);
        repositorio.save(-10);
        repositorio.save(20);
        assertEquals(5, repositorio.count());
        repositorio.delete(-10);
        assertEquals(4, repositorio.count());
    }

    @Test
    public void existsTrueQuandoValorExistir() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(10);
        repositorio.save(20);
        assertTrue(repositorio.exists(20));
    }

    @Test
    public void existsFalseQuandoValorNaoExistir() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(10);
        repositorio.save(20);
        assertFalse(repositorio.exists(30));
    }

    @Test
    public void existsTrueQuandoListaVazia() {
        Repositorio repositorio = new Repositorio();
        assertFalse(repositorio.exists(20));
    }

    @Test
    public void findAllQuandoVazioRetornaArrayVazio() {
        Repositorio repositorio = new Repositorio();
        assertArrayEquals(new int[0], repositorio.findAll());
    }

    @Test
    public void findAllQuandoElementosRetornaArrayComElementos() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(10);
        repositorio.save(0);
        repositorio.save(-1);
        repositorio.save(90);
        assertArrayEquals(new int[]{10, 0, -1, 90}, repositorio.findAll());
    }

    @Test
    public void findAllQuandoMuitosElementosRetornaArrayComMuitosElementos() {
        int[] valores = new int[200];
        Repositorio repositorio = new Repositorio();
        for(int i = 0; i < valores.length; i++) {
            valores[i] = i;
            repositorio.save(i);
        }
        assertArrayEquals(valores, repositorio.findAll());
    }

    @Test
    public void findAllByOrderByDescRetornaValoresOrdernadosPorDesc() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(10);
        repositorio.save(0);
        repositorio.save(-1);
        repositorio.save(20);
        assertArrayEquals(new int[] { 20, 10, 0, -1 }, repositorio.findAllByOderByValorDesc());
    }

    @Test
    public void findAllByOrderByAscRetornaValoresOrdernadosPorAsc() {
        Repositorio repositorio = new Repositorio();
        repositorio.save(10);
        repositorio.save(0);
        repositorio.save(-1);
        repositorio.save(20);
        assertArrayEquals(new int[] { -1, 0, 10, 20 }, repositorio.findAllByOrderByValorAsc());
    }

}
