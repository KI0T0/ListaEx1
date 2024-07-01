public class Produto {
    protected String nome;
    protected double preco;
    protected int qtdEmEstoque;

    public Produto(){}

    public Produto(String nome, double preco, int qtdEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQtdEmEstoque(qtdEmEstoque);
    }

    public void atualizarEstoque(int qtdNova){
        setQtdEmEstoque(qtdNova);
    }

    public void exibirDetalhes(){
        System.out.printf("Nome do produto: "+getNome()+"\nPreço: %.2f\nQuantidade: "+getQtdEmEstoque()+
                "\n---------------------\n",getPreco());
    }

    public void comprar(int quantidade) {
        if (quantidade > 0 && quantidade <= qtdEmEstoque) {
            qtdEmEstoque -= quantidade;
            System.out.printf("Compra realizada com sucesso! Comprou %d unidades de %s.\n", quantidade, nome);
        } else {
            System.out.println("Estoque insuficiente para realizar a compra.");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEmEstoque() {
        return qtdEmEstoque;
    }

    public void setQtdEmEstoque(int qtdEmEstoque) {
        this.qtdEmEstoque = qtdEmEstoque;
    }





}
