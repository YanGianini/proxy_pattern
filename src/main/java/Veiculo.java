import java.util.Arrays;
import java.util.List;

public class Veiculo implements IVeiculo{
    private Integer id;
    private String modelo;
    private String cor;
    private String fabricante;
    private Integer ano;

    private Float preco;

    public Veiculo(int id){
        this.id = id;
        Veiculo objeto = BD.getVeiculo(id);
        this.modelo = objeto.modelo;
        this.cor = objeto.cor;
        this.fabricante = objeto.fabricante;
        this.ano = objeto.ano;
        this.preco = objeto.preco;
    }

    public Veiculo(Integer id, String modelo, String cor, String fabricante, Integer ano, Float preco) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.ano = ano;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> obterDadosVeiculos() {
        return Arrays.asList(this.modelo, this.cor, this.fabricante);
    }

    @Override
    public List<Float> obterPreco(Vendedor vendedor) {
        return Arrays.asList(this.preco);
    }
}
