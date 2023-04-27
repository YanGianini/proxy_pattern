import java.util.List;

public class VeiculoProxy implements IVeiculo{
    private Veiculo veiculo;
    private Integer id;

    public VeiculoProxy(Integer id){
        this.id = id;
    }

    @Override
    public List<String> obterDadosVeiculos() {
        if (this.veiculo == null) {
            this.veiculo = new Veiculo(this.id);
        }
        return this.veiculo.obterDadosVeiculos();
    }

    @Override
    public List<Float> obterPreco(Vendedor vendedor){
        if (!vendedor.isCredenciado()){
            throw new IllegalArgumentException("Vendedor não credenciado");
        }
        if (this.veiculo==null) {
            this.veiculo = new Veiculo(this.id);
        }
        return this.veiculo.obterPreco(vendedor);
    }
}
