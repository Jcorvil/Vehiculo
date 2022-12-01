public class Vehiculo {

    private static Propietario Propietario;
    private static String matricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Propietario getPropietario() {
        return Propietario;
    }
    public void setPropietario(Propietario propietario){
        this.Propietario = propietario;
    }
}