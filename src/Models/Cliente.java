package Models;

public class Cliente extends Pessoa{
    private Corrente corrente;
    private Agencia agencia;
    private Banco banco;

    public Cliente(String nome, String cpf, String dataNascimento, Corrente corrente, Agencia agencia, Banco banco) {
        super(nome, cpf, dataNascimento);
        this.corrente = corrente;
        this.agencia = agencia;
        this.banco = banco;
    }

    public Corrente getCorrente() {
        return corrente;
    }

    public void setCorrente(Corrente corrente) {
        this.corrente = corrente;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "corrente=" + corrente +
                ", agencia=" + agencia +
                ", banco=" + banco +
                '}';
    }
}
