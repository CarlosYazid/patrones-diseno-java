
public class Pizza {

    private int cantidadRebanadas;

    public Pizza(int cantidadRebanadas) {
        this.cantidadRebanadas = cantidadRebanadas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pizza con " + cantidadRebanadas + " rebanadas.";
    }

    public int getCantidadRebanadas() {
        return cantidadRebanadas;
    }
}