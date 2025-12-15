public class Auto extends Vehiculo {

    private String tipoCombustible; 

    // Setter para asignar el combustible
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible = tipoCombustible;
    }

    // Getter para tener el tipo de combustible
    public String getTipoCombustible(){
        return tipoCombustible;
    }

    // Sobrescritura del método mostrarInfo para agregar datos del coche
    @Override
    public String mostrarInfo(){
        return "El auto es de marca " + getMarca() + ", de color " + getColor() + " y de combustible " + tipoCombustible;
    }
}

