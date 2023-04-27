import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class VeiculoProxyTest {
    @BeforeEach
    void setUp() {
        BD.addVeiculo(new Veiculo(1, "Onix", "Preto", "GM",2023, 90000.0f));
        BD.addVeiculo(new Veiculo(2, "Cruze", "Branco", "GM",2023, 120000.0f));
    }

    @Test
    void deveRetornarDadosVeiculo() {
        VeiculoProxy veiculo = new VeiculoProxy(2);

        assertEquals(Arrays.asList("Cruze", "Branco", "GM"), veiculo.obterDadosVeiculos());
    }

    @Test
    void deveRetonarPreco() {
        Vendedor vendedor = new Vendedor("Alison Israel", true);
        VeiculoProxy veiculo = new VeiculoProxy(1);

        assertEquals(Arrays.asList(90000.0f), veiculo.obterPreco(vendedor));
    }

    @Test
    void deveRetonarExcecaoVendedorNaoCredenciado() {
        try {
            Vendedor vendedor = new Vendedor("Danilo", false);
            VeiculoProxy veiculo = new VeiculoProxy(2);

            veiculo.obterPreco(vendedor);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Vendedor não credenciado", e.getMessage());
        }
    }
}
