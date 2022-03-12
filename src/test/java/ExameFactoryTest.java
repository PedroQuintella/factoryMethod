import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExameFactoryTest {

    @Test
    void deveRetornarExcecaoExameNaoEncontrado() {
        try {
            IExame exame = ExameFactory.obterExame("Desintometria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Exame não encontrado", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoExameInvalido() {
        try {
            IExame exame = ExameFactory.obterExame("Ressonancia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Exame inválido", e.getMessage());
        }
    }
}