package pagamentos;
public interface FormaPagamento {
    double receberPagamento(String chave, double valor);
    double reembolsar(double valor);
    String emitirComprovante();
}
