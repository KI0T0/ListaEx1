//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//1º exercício - Classe Pessoa

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("João",28,1.90,83);
        p1.setIdade(30);
        p1.envelhecer(5);

        p2.envelhecer(2);
        System.out.println(p1.getIdade());
        System.out.println(p2.getIdade());

        p1.engordar(10);
        p2.engordar(5);
        System.out.println(p1.getPeso()+"\n"+p2.getPeso());

        }
    }
