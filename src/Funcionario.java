public class Funcionario {
    protected String nome;
    protected String cargo;
    protected double salario;
    protected String departamento;

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
        System.out.printf("Parabéms %s! Promovido para %s com salário %.2f.\n", nome, novoCargo, novoSalario);
    }

    public void exibirDetalhes() {
        System.out.printf("Nome: %s\nCargo: %s\nSalário: R$ %.2f\nDepartamento: %s\n---------------------\n",
                nome, cargo, salario, departamento);
    }
}