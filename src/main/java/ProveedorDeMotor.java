public class ProveedorDeMotor {
  static MotorSugerencias motor;

  public static MotorSugerencias getMotor(){
    return motor;
  }

  public static void setMotor(MotorSugerencias motor){
    ProveedorDeMotor.motor = motor;
  }
}
