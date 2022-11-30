public class Propietario {
    public String nombre;
    public String apellidos;
    public String DNI;
    public Integer edad;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getDNI(){
        return DNI;
    }
    public void setDNI(String DNI){
        this.DNI = DNI;
    }

    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
}