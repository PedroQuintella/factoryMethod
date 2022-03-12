import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExameSangueTest {

    @Test
    void deveRetornarExameSangueRealizadoComSucesso() {
        IExame exame = ExameFactory.obterExame("Sangue");

        assertEquals("Exame de Sangue realizado com sucesso", exame.realizar());
    }

    @Test
    void deveRetornarExameSangueCanceladoComSucesso() {
        IExame exame = ExameFactory.obterExame("Sangue");

        assertEquals("Exame de Sangue cancelado com sucesso", exame.cancelar());
    }
}