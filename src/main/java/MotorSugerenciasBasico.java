import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class MotorSugerenciasBasico implements MotorSugerencias {

  public List<Sugerencia> generarSugerencias(Usuario usuario){
    List<Prenda> prendasSuperiores = (List<Prenda>) usuario.getPrendas().stream().filter(p -> p.esSuperior());
    List<Prenda> prendasInferiores = (List<Prenda>) usuario.getPrendas().stream().filter(p -> p.esInferior());
    List<Prenda> calzados = (List<Prenda>) usuario.getPrendas().stream().filter(p -> p.esCalzado());

    List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperiores, prendasInferiores, calzados);

    return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).collect(Collectors.toList());
  }
}
