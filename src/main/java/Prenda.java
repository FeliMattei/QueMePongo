import java.util.Optional;

public class Prenda {
    TipoPrenda tipoPrenda;
    Tela tela;
    Material material;
    Color colorPrimario;
    Optional<Color> colorSecundario;

    public Prenda(TipoPrenda tipoPrenda, Tela tela, Material material, Color colorPrimario, Optional<Color> colorSecundario) {
        this.tipoPrenda = tipoPrenda;
        this.tela = tela;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
    }

    public Categoria getCategoria() {
       return tipoPrenda.getCategoria();
    }
}
