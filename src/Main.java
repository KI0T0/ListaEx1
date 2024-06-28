//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//1º exercício - Classe Pessoa

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("João",28,1.90,83);

        p1.setNome("Maria");
        p1.setIdade(18);
        p1.setPeso(45);
        p1.setAltura(1.50);

        p1.envelhecer(5);
        p1.engordar(2.5);
        p1.mostrarInformacoes();

        p2.emagrecer(20);
        p2.mostrarInformacoes();


        }
    }
