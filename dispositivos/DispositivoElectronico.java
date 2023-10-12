package dispositivos;
public class DispositivoElectronico {
    private String marca;
    private String anio;
    private double precio;
    private String color;
    static int contador = 0;

    public DispositivoElectronico(String marca, String anio, double precio, String color) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        this.color = color;
        contador++;
    }

    public DispositivoElectronico(String marca, String anio, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.precio = precio;
        contador++;
    }

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marca: "+getMarca()+"\n");
        sb.append("Año: "+getAnio()+"\n");
        sb.append("Precio: "+getPrecio()+"\n");
        if(color!=null){
            sb.append("Color: "+getColor()+"\n");
        }
        return sb.toString();
    }


    
}
