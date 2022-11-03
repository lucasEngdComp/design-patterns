public class Highlander {
    private static int contChamadas = 0;

    private Highlander() {}
    private static Highlander instancia;
    public static Highlander obterInstancia() {
        contChamadas++;
        if (instancia == null) {
            instancia = new Highlander();
        }
        return instancia;
    }

    public static int getContChamadas(){
        return contChamadas;
    }
}