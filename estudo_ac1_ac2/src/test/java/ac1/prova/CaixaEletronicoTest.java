package ac1.prova.caixa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CaixaEletronicoTest {

    @Test
    public void sacarQuandoValorMenorIgualZeroLancaIllegalArgumentException() {
        CaixaEletronico exercicio = new CaixaEletronico();
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(-1));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(-10));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(-1000));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(0));
    }

    @Test
    public void sacarQuandoValorMaiorIgualCincoMilLancaIllegalArgumentException() {
        CaixaEletronico exercicio = new CaixaEletronico();
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(5_000));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(5_001));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(10_000));
        assertThrows(IllegalArgumentException.class, () -> exercicio.sacar(100_000));
    }

    @Test
    public void sacarQuandoValorIgualUmRetornaUmaNotaUm() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(1);
        assertEquals(exercicio.getQuantidadeNotasUm(), 1);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualDoisRetornaUmaNotaDois() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(2);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 1);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualCincoRetornaUmaNotaCinco() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(5);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 1);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualDezRetornaUmaNotaDez() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(10);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 1);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualVinteRetornaUmaNotaVinte() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(20);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 1);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualCinquentaRetornaUmaNotaCinquenta() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(50);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 1);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualCemRetornaUmaNotaCem() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(100);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 1);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualDuzentosRetornaUmaNotaDuzentos() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(200);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 1);
    }

    @Test
    public void sacarQuandoValorIgualCentoDezRetornaUmaNotaCemEUmaNotaDez() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(110);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 1);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 1);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualMilTrezentosQuarentaDoisRetornaSeisNotaDuzentosUmaNotaCemDuasNotaVinte() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(1340);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 2);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 1);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 6);
    }

    @Test
    public void sacarQuandoValorIgualQuatroMilSeissentosSessentaSeteRetornaVinteTresNotaDuzentosUmaNotaCinquentaUmaNotaDezUmaNotaCincoUmaNotaDois() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(4667);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 1);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 1);
        assertEquals(exercicio.getQuantidadeNotasDez(), 1);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 1);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 23);
    }

    @Test
    public void sacarQuandoValorIgualSetentaNoveRetornaUmaNotaCinquentaUmaNotaVinteUmaNotaCincoDuasNotasDois() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(79);
        assertEquals(exercicio.getQuantidadeNotasUm(), 0);
        assertEquals(exercicio.getQuantidadeNotasDois(), 2);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 1);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 1);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 1);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

    @Test
    public void sacarQuandoValorIgualTresRetornaUmaNotaDoisUmaNotaUm() {
        CaixaEletronico exercicio = new CaixaEletronico();
        exercicio.sacar(3);
        assertEquals(exercicio.getQuantidadeNotasUm(), 1);
        assertEquals(exercicio.getQuantidadeNotasDois(), 1);
        assertEquals(exercicio.getQuantidadeNotasCinco(), 0);
        assertEquals(exercicio.getQuantidadeNotasDez(), 0);
        assertEquals(exercicio.getQuantidadeNotasVinte(), 0);
        assertEquals(exercicio.getQuantidadeNotasCinquenta(), 0);
        assertEquals(exercicio.getQuantidadeNotasCem(), 0);
        assertEquals(exercicio.getQuantidadeNotasDuzentos(), 0);
    }

}
