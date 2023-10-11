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

    public getMarca() {
        return marca;
    }
    
    public setMarca(String marca) {
        this.marca = marca;
    }

    public getAnio() {
        return anio;
    }

    public setAnio(String anio) {
        this.anio = anio;
    }

    public getPrecio() {
        return precio;
    }

    public setPrecio(double precio) {
        this.precio = precio;
    }

    public getColor() {
        return color;
    }

    public setColor(String color) {
        this.color = color;
    }




    
}
