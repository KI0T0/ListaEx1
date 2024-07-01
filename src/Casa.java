public class Casa {
    private String endereco;
    private int qtdQuartos;
    private double area;
    private double valor;


    public Casa(String endereco, int qtdQuartos, double area, double valor) {
        this.endereco = endereco;
        this.qtdQuartos = qtdQuartos;
        this.area = area;
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.printf("Endereço: %s\nNúmero de Quartos: %d\nÁrea: %.2f m²\nValor: R$ %.2f\n---------------------\n",
                endereco, qtdQuartos, area, valor);
    }

    public double valorImposto(double taxa) {
        double imposto = valor * (taxa / 100);
        return imposto;
    }

}
