package Models;
public class Corrente extends Conta {
    private double limite = 500;


    public Corrente(String numero, String nomeTitular, double saldo) {
        super(numero, nomeTitular);
    }


    public double getLimite() {
        return limite;
    }


    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public void sacarDinheiro(double valor) {
        double saldo = getSaldo();
        if (valor <= (saldo + getLimite())) {
            setSaldo(saldo - valor);
            setLimite(getLimite()+getSaldo());
            setSaldo(0);
            System.out.println("Saque de R$"+valor+" realizado com sucesso.");


        }
        else{
            System.out.println("Erro na operação, valor indisponível na conta.");
        }

    }

    @Override
    public String toString() {
        return "Corrente{" +
                "limite=" + limite +
                '}';
    }
}
