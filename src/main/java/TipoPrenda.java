import static java.util.Objects.requireNonNull;

public class TipoPrenda {
    String nombre;
    Categoria categoria;

    public TipoPrenda(String nombre, Categoria categoria) {
        this.nombre = requireNonNull(nombre, "El nombre es obligatorio");
        this.categoria = requireNonNull(categoria, "La categoria es obligatoria");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
