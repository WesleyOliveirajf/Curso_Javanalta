public class ContaBancaria {
    // Atributos

    private String titular;
    private double saldo;

//    Getter e Setter - metodos padroes para acessar e modificar atributos

    // Metodo para obter o titular
    public String getTitular() {
        return titular;
    }

    // Metodo para motificar o titular
    public void setTitular(String novoTitular) {
        this.titular = novoTitular;
    }
}