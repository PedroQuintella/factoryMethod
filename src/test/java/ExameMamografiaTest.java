import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameMamografiaTest {

    @Test
    void deveRetornarExameMamografiaRealizadoComSucesso() {
        IExame exame = ExameFactory.obterExame("Mamografia");

        assertEquals("Mamografia realizada com sucesso", exame.realizar());
    }

    @Test
    void deveRetornarExameMamografiaCanceladaComSucesso() {
        IExame exame = ExameFactory.obterExame("Mamografia");

        assertEquals("Mamografia cancelada com sucesso", exame.cancelar());
    }
}