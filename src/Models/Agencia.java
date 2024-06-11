package Models;

public class Agencia {
    private Banco banco;
    private String endereco;
    private int numeroAgencia;

    public Agencia(Banco banco, String endereco, int numeroAgencia) {
        this.banco = banco;
        this.endereco = endereco;
        this.numeroAgencia = numeroAgencia;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "banco=" + banco +
                ", endereco='" + endereco + '\'' +
                ", numeroAgencia=" + numeroAgencia +
                '}';
    }
}
