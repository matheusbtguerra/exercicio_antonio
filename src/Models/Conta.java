package Models;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo;


    public Conta(String numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getNomeTitular() {
        return nomeTitular;
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void depositarDinheiro(double valor) {
        double saldo = getSaldo();
        setSaldo(valor + saldo);
        System.out.println("Depósito de R$"+valor+" realizado com sucesso.");
    }


    public void sacarDinheiro(double valor) {
        double saldo = getSaldo();
        if (valor <= saldo) {
            setSaldo(saldo - valor);
            System.out.println("Saque de R$"+valor+" realizado com sucesso.");
        }
        else{
            System.out.println("Erro na operação, valor indisponível na conta.");
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

}
