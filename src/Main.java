public class Main {
    public static void main(String[] args) {

//1º exercício - Classe Pessoa

//        Pessoa p1 = new Pessoa();
//        Pessoa p2 = new Pessoa("João",28,1.90,83);
//
//        p1.setNome("Maria");
//        p1.setIdade(18);
//        p1.setPeso(45);
//        p1.setAltura(1.50);
//
//        p1.envelhecer(5);
//        p1.engordar(2.5);
//        p1.mostrarInformacoes();
//
//        p2.emagrecer(20);
//        p2.mostrarInformacoes();

//2º exercício - Classe Produto
//          Produto p1 = new Produto("Coca-Cola", 5.00, 20);
//
//          p1.atualizarEstoque(25);
//          p1.exibirDetalhes();
//
//
//          Produto p2 = new Produto();
//
//          p2.setNome("Dolly");
//          p2.setPreco(2.50);
//          p2.setQtdEmEstoque(15);
//
//          p2.atualizarEstoque(10);
//          p2.exibirDetalhes();
//
//          p2.comprar(3);

//3º exercício - Classe Filme

//        Filme filme1 = new Filme("O Poderoso Chefão III", "Francis Ford Coppola", 1990, "Crime, Drama");
//        Filme filme2 = new Filme("Pantera Negra", "Ryan Coogler", 2018, "Ação, Aventura, Ficção Científica");
//
//
//        filme1.mostrarDetalhes();
//        filme2.mostrarDetalhes();
//
//        ArrayList<Filme> listaFilmes = new ArrayList<>();
//        listaFilmes.add(filme1);
//        listaFilmes.add(filme2);
//
//        System.out.println("Lista de Filmes:");
//        for (Filme filme : listaFilmes) {
//            filme.mostrarDetalhes();
//        }

//4º exercício - Classe Funcionário

//        Funcionario funcionario1 = new Funcionario("Felipe Gonçalves", "Desenvolvedor", 4000.00, "TI");
//
//        System.out.println("Detalhes do profissional:");
//        funcionario1.exibirDetalhes();
//
//        funcionario1.promover("Gerente", 8000.00);
//
//        System.out.println("Cargo atualizado após a promoção:");
//        funcionario1.exibirDetalhes();
//

//5º exercício - Classe Casa

//        Casa casa = new Casa("Rua João Batista Duarte, 49", 4, 150.5, 300000.00);
//
//        System.out.println("Detalhes da Casa:");
//        casa.exibirDetalhes();
//
//        double taxaImposto = 1.5;
//        double valorImposto = casa.valorImposto(taxaImposto);
//        System.out.printf("Valor do Imposto (taxa %.2f%%): R$ %.2f\n", taxaImposto, valorImposto);


//6º exercício - Classe Celular

        Celular meuCelular = new Celular("Apple", "Iphone 15 Pro", 128);

        System.out.println("Informações do celular:");
        meuCelular.mostraInformacoes();

        meuCelular.instalarApp("WhatsApp");
        meuCelular.instalarApp("Instagram");
        meuCelular.instalarApp("Duolingo");

        System.out.println("Celular após a instalação dos apps:");
        meuCelular.mostraInformacoes();


    }



    }
