public class Moto extends Vehiculo {
    private String cilindrada;

    // Setter para asignar la cilindrada
    public void setCilindrada(String cilindrada){
        this.cilindrada = cilindrada;
    }

    // Getter para tener el tipo de cilindrada
    public String getCilindrada(){
        return cilindrada;
    }

    // Sobrescritura del método mostrarInfo para agregar datos de la moto
    @Override
    public String mostrarInfo(){
        return "La moto es de marca " + getMarca() + ", de color " + getColor() +" y cilindrada " + cilindrada;
    }
}