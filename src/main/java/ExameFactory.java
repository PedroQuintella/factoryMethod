public class ExameFactory {

    public static IExame obterExame(String exame) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("Exame" + exame);
            objeto = classe.newInstance();
        }
        catch (Exception ex) {
            throw new IllegalArgumentException("Exame não encontrado");
        }
        if (!(objeto instanceof IExame)) {
            throw new IllegalArgumentException("Exame inválido");
        }
        return (IExame) objeto;
    }
}
