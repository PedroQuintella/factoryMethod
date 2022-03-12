import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameUrinaTest {

    @Test
    void deveRetornarExameUrinaRealizadaComSucesso() {
        IExame exame = ExameFactory.obterExame("Urina");

        assertEquals("Exame de Urina realizado com sucesso", exame.realizar());
    }

    @Test
    void deveRetornarExameUrinaCanceladaComSucesso() {
        IExame exame = ExameFactory.obterExame("Urina");

        assertEquals("Exame de Urina cancelado com sucesso", exame.cancelar());
    }
}