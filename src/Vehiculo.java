public class Vehiculo {
 
    private String marca;   // Marca del vehículo
    private String color;   // Color del vehículo
    
    public Vehiculo() {      
    }
    
    // Constructor que permite definir marca y color desde el inicio
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }
    
    // Getter para tener la marca
    public String getMarca() {
        return marca;
    }
    
    // Setter para asginar la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Getter para tener el color
    public String getColor() {
        return color;
    }
    
    // Setter para asignar el color
    public void setColor(String color) {
        this.color = color;
    }
    
    // Método que devuelve un texto del vehículo
    public String mostrarInfo() {
        return "El vehículo es de la marca " + marca + "y de color " + color;
    }
}