// Atuendo que contiene una lista de prendas.
class Atuendo
    ArrayList<Prendas>

    public agregarPrenda(prenda) { ... }
    public removerPrenda(prenda) { ... }

/* ------------------------------------ */

// La prenda valida en el constructor que los atributos no sean nulos y además permite que colorSecundario sea opcional
class Prenda
    TipoPrenda tipoPrenda
    Material material
    Color colorPrimario
    Opcional<Color> colorSecundario

    // Los atributos tipoPrenda, material y colorPrimario son obligatorios, mientras que el atributo colorSecundario es opcional.
    public Prenda(tipoPrenda, material, colorPrimario, colorSecundario){
        this.tipoPrenda = requireNonNull(tipoPrenda, "Tipo de prenda es obligatorio");
        ...
        ...
        this.colorSecundario = colorSecundario;
    }

    public getCategoria() // Retorna la categoría de la prenda basándose en el tipo de prenda asociado.

/* ------------------------------------ */
// TipoPrenda contiene a la Categoría, desde la Prenda accedemos a TipoPrenda y de TipoPrenda a Categoría
class TipoPrenda
    String nombre
    Categoria categoria

    public TipoPrenda(nombre, categoria) { ... }

    public getCategoria() Retorna la categoría de la instancia.
    public Getters y Setters

/* ------------------------------------ */
// Lo modelé como Enum ya que en los requerimientos se limita a solo estas cuatro partes donde se puede colocar una prenda 
enum Categoria
    - ACCESORIO
    - PARTE_SUPERIOR
    - PARTE_INFERIOR
    - CALZADO

/* ------------------------------------ */

class Material
    String nombre

    public Material(nombre) { ... }

    public Getters y Setters

/* ------------------------------------ */
// Modelé el Color de la siguiente manera para escalar en caso de elegir atuendo por color
class Color
    int red
    int green
    int blue

    public Color(red, green, blue)

    public getColorHex() // Devuelve el valor de la instancia en formato hexadecimal



