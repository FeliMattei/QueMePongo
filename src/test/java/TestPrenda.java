import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
public class TestPrenda {

        @Test
        void testCreacionPrendaFaltante() {
            TipoPrenda tipo = new TipoPrenda("Remera", Categoria.PARTE_SUPERIOR);

            BorradorPrenda borrador = new BorradorPrenda(tipo);
            borrador.conColorPrimario(new Color(255, 0, 0));
            borrador.conColorSecundario(Optional.of(new Color(0, 255, 0)));
            borrador.conTela(new Tela());

            assertThrows(NullPointerException.class, () -> borrador.crear());
        }
}
