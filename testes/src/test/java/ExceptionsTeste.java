import junit.Conta;
import junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas ted = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> ted.transfere(contaOrigem, contaDestino, 20));
    }
}