import java.util.ArrayList;


public class Atuendo {
    ArrayList<Prenda> prendas;

    public Atuendo(){
        this.prendas = new ArrayList<Prenda>();
    }

    public void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }

    public void removerPrenda(Prenda prenda){
        prendas.remove(prenda);
    }
}