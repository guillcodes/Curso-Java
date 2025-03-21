public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super("segundo parametro deve ser maior que o primeiro");
    }
}
