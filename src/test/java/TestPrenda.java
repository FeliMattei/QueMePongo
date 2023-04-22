import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
public class TestPrenda {

        @Test
        void testCreacionPrendaFaltante() {
            TipoPrenda tipo = new TipoPrenda("Remera", Categoria.PARTE_SUPERIOR);
            Material material = new Material("Algodón");
            Color colorPrimario = new Color(255, 0, 0);
            Optional<Color> colorSecundario = Optional.empty();
            assertThrows(NullPointerException.class, () -> new Prenda(null, material, colorPrimario, colorSecundario));
        }
}
