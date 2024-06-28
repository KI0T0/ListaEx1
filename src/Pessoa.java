public class Pessoa {


//  Atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;

//  Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//  Construtores
    public Pessoa(){

    }

    public Pessoa(String nome, int idade, double altura, double peso) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
    }
//  Métodos
    public void envelhecer(int ano) {
        setIdade(idade+ano);
    }

    public void engordar(double massa) {
        setPeso(peso+massa);
    }

    public void emagrecer(double massa) {
        setPeso(peso-massa);
    }

    public void mostrarInformacoes(){
        System.out.printf("Nome: "+getNome()+"\nIdade: "+getIdade()
                +"\nAltura: %.2f\nPeso: %.2f\n---------------------\n",getAltura(),getPeso());
    }

}
