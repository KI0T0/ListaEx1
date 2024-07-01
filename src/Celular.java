import java.util.ArrayList;
import java.util.List;

public class Celular {
    protected String marca;
    protected String modelo;
    protected int armazenamento; // em GB
    protected List<String> appsInstalados;


    public Celular(String marca, String modelo, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.appsInstalados = new ArrayList<>();
    }

    public void instalarApp(String aplicativo) {
        appsInstalados.add(aplicativo);
        System.out.printf("Appp %s instalado com sucesso no celular %s %s.\n", aplicativo, marca, modelo);
    }

    public void mostraInformacoes() {
        System.out.printf("Marca: %s\nModelo: %s\nArmazenamento: %d GB\nApps Instalados: %s\n---------------------\n",
                marca, modelo, armazenamento, appsInstalados.isEmpty() ? "Nenhum aplicativo instalado" : appsInstalados);
    }
}