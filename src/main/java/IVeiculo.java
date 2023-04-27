import java.util.List;

public interface IVeiculo {
    List<String> obterDadosVeiculos();
    List<Float> obterPreco(Vendedor vendedor);
}
