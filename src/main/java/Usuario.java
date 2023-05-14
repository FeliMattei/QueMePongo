import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  Integer edad;
  MotorSugerencias motorSugerencias;

  public Usuario(List<Prenda> prendas, Integer edad, MotorSugerencias motorSugerencias) {
    this.prendas = prendas;
    this.edad = edad;
    this.motorSugerencias = motorSugerencias;
  }

  public List<Sugerencia> generarSugerencias(){
    return this.motorSugerencias.generarSugerencias(this);
  }

  public List<Prenda> getPrendas() {
    return prendas;
  }

  public Integer getEdad() {
    return edad;
  }

  public MotorSugerencias getMotorSugerencias() {
    return motorSugerencias;
  }
}
