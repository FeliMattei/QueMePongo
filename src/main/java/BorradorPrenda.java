import java.util.Objects;
import java.util.Optional;

public class BorradorPrenda {
    TipoPrenda tipoPrenda;
    Tela tela;
    Material material;
    Color colorPrimario;
    Optional<Color> colorSecundario;
    Formalidad formalidad;

    public BorradorPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public void conTela(Tela tela) {
        this.tela = tela;
    }

    public void conMaterial(Material material) {
        this.material = material;
    }

    public void conColorPrimario(Color colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public void conColorSecundario(Optional<Color> colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public void conFormalidad(Formalidad formalidad){
        this.formalidad = formalidad;
    }

    public Prenda crear() {
        this.validarConsistencia();
        return new Prenda(tipoPrenda, tela, material, colorPrimario, colorSecundario, formalidad);
    }

    public void validarConsistencia() {
        Objects.requireNonNull(this.tipoPrenda, "Tipo de prenda es obligatorio");
        Objects.requireNonNull(this.tela, "Tela es obligatoria");
        Objects.requireNonNull(this.material, "Material es obligatorio");
        Objects.requireNonNull(this.colorPrimario, "Color primario es obligatorio");
        Objects.requireNonNull(this.formalidad, "Formalidad es obligatoria");
    }
}
