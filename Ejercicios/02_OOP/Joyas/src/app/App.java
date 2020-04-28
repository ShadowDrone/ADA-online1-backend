package app;

public class App {
    public static void main(String[] args) throws Exception {
        ECommerce todoJoya = new ECommerce();

        todoJoya.inicializarCatalogo();

        todoJoya.imprimeCatalogo();

    }
}