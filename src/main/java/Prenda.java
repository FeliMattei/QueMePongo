import java.util.Optional;

public class Prenda {
    TipoPrenda tipoPrenda;
    Tela tela;
    Material material;
    Color colorPrimario;
    Optional<Color> colorSecundario;
    Formalidad formalidad;

    public Prenda(TipoPrenda tipoPrenda, Tela tela, Material material, Color colorPrimario, Optional<Color> colorSecundario, Formalidad formalidad) {
        this.tipoPrenda = tipoPrenda;
        this.tela = tela;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.formalidad = formalidad;
    }

    public Categoria getCategoria() {
       return tipoPrenda.getCategoria();
    }

    public boolean esSuperior() {
        return getCategoria() == Categoria.PARTE_SUPERIOR;
    }

    public boolean esInferior() {
        return getCategoria() == Categoria.PARTE_INFERIOR;
    }

    public boolean esCalzado() {
        return getCategoria() == Categoria.CALZADO;
    }

    public boolean esInformal() {
        return formalidad == Formalidad.INFORMAL;
    }
}
