public class Vehiculo {

    private static Propietario Propietario;
    private static String matricula;

    public static void main(String[] args){
        Vehiculo Vehiculo1 = new Vehiculo();
        System.out.println("Vehiculo 1");
        Vehiculo1.setMatricula("12345A");
        System.out.println("Numero de matricula: " + Vehiculo1.getMatricula());
    }

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