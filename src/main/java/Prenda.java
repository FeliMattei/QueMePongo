import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class Prenda {
    TipoPrenda tipoPrenda;
    Material material;
    Color colorPrimario;
    Optional<Color> colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Optional<Color> colorSecundario) {
        this.tipoPrenda = requireNonNull(tipoPrenda, "Tipo de prenda es obligatorio");
        this.material = requireNonNull(material, "Material es obligatorio");
        this.colorPrimario = requireNonNull(colorPrimario, "Color primario es obligatorio");
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria() {
       return tipoPrenda.getCategoria();
    }
}
