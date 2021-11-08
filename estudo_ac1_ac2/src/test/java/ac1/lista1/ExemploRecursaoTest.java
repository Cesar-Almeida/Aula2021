package ac1.lista1;

import ac1.lista1.ExemploRecursao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExemploRecursaoTest {

    @Test
    public void SeNZeroEntaoReturnaUm()
    {
        assertEquals(1, ExemploRecursao.fatorial(0));
    }

    @Test
    public void SeNNegativoEntaoReturnaNull()
    {
        try
        {
            ExemploRecursao.fatorial(-1);
            assertTrue(false);
        }catch (IllegalArgumentException ex)
        {
            assertEquals("N não pode ser negativo", ex.getMessage());
        }
    }

    @Test
    public void SePositivoDoisEntaoReternaDois() {
        assertEquals(2, ExemploRecursao.fatorial(2));
    }

    @Test
    public void SeNPositivoCincoEntaoRetornaCentoEVinte() {
        assertEquals(120, ExemploRecursao.fatorial(5));
    }
}
