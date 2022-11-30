public class Coche extends Vehiculo {
    public String modelo;
    public String marca;
    public Integer antiguedad;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAntiguedad() {
        return antiguedad;
    }
    public void setAntiguedad(Integer antiguedad) {
        this.antiguedad = antiguedad;
    }
}