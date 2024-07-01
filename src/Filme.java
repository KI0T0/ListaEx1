public class Filme {
    protected String titulo;
    protected String diretor;
    protected int anoLancamento;
    protected String genero;

    public Filme(){}

    public Filme(String titulo, String diretor, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    // Método para mostrar os detalhes do filme
    public void mostrarDetalhes() {
        System.out.printf("Título: %s\nDiretor: %s\nAno de Lançamento: %d\nGênero: %s\n---------------------\n",
                titulo, diretor, anoLancamento, genero);
    }

}
