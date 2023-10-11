package compradores;

public class Comprador {
    private String nombre;
    private String apellido;
    private double presupuesto;
    private int descuento;
    private int edad;
    public static int contador = 0;
    
    public Comprador (String nombre, String apellido, double presupuesto, int edad, int descuento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.presupuesto = presupuesto;
        this.edad = edad;
        this.descuento = descuento;
        contador++;
    }

    public Comprador (String nombre, String apellido, double presupuesto, int descuento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.presupuesto = presupuesto;
        this.descuento = descuento;
        contador++;
    }

    public String getNombre(){
        return nombre+" "+apellido;
    }
    
    public void setPresupuesto(double presupuesto){
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto(){
        return presupuesto;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: "+getNombre()+"\n");
        sb.append("Presupuesto: "+getPresupuesto()+"\n");
        if(edad!=0){
            sb.append("Edad: "+getEdad()+"\n");
        }
        sb.append("Descuento: "+descuento+"%\n");
        return sb.toString();
    }


}
