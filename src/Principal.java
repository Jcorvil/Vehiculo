public class Principal {
    public static void main(String[]args) {
        Vehiculo v1 = new Vehiculo();
        v1.setMatricula("8888AB");

        Coche c1 = new Coche();
        c1.setMarca("Honda");
        c1.setModelo("Civic");
        c1.setAntiguedad(5);

        Propietario p1 = new Propietario();
        p1.setNombre("Jorge");
        p1.setApellidos("Coronil Villalba");
        p1.setDNI("20067600P");
        p1.setEdad(25);

        System.out.println("Información del vehículo: ");
        System.out.println("Matrícula: " + v1.getMatricula());
        System.out.println("Marca, modelo y antigüedad: " + c1.getMarca() + " " + c1.getModelo() + " // " + c1.getAntiguedad() + " años");
        System.out.println("Nombre, apellidos, DNI y edad del propietario: ");
        System.out.println(p1.getNombre() + " " + p1.getApellidos() + " // " + p1.getDNI() + " // " + p1.getEdad() + " años");

    }
}