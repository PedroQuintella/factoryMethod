import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameTomografiaTest {

    @Test
    void deveRetornarExameTomografiaRealizadaComSucesso() {
        IExame exame = ExameFactory.obterExame("Tomografia");

        assertEquals("Tomografia realizada com sucesso", exame.realizar());
    }

    @Test
    void deveRetornarExameTomografiaCanceladaComSucesso() {
        IExame exame = ExameFactory.obterExame("Tomografia");

        assertEquals("Tomografia cancelada com sucesso", exame.cancelar());
    }
}