public class Vendedor {
    private String nome;
    private boolean credenciado;

    public Vendedor(String nome, boolean credenciado) {
        this.nome = nome;
        this.credenciado = credenciado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCredenciado() {
        return credenciado;
    }

    public void setCredenciado(boolean credenciado) {
        this.credenciado = credenciado;
    }
}
