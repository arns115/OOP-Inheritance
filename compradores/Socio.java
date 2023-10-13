package compradores;

public class Socio extends Comprador{
    private int puntos;

    public Socio(String nombre, String apellido, double presupuesto, int edad, int puntos){
        super(nombre, apellido, presupuesto, edad, 15);
        this.puntos=puntos;
    }
    public Socio(String nombre, String apellido, double presupuesto, int puntos){
        super(nombre, apellido, presupuesto, 15);
        this.puntos=puntos;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String toString(){
        return super.toString()+"\nPuntos: "+getPuntos();
    }
    public static Socio registrarSocio(){
        Socio socio;
        int op;
        String nombre=registrarNombre();
        String apellido=registrarApellido();
        System.out.println("Incluira la edad del comprador?1)SI 2)NO");
        op=sc.nextInt();
        sc.nextLine();
        if(op==1){
            socio=new Socio(nombre, apellido, registrarPresupuesto(), registrarEdad(), (int)Math.random()*500);
        }
        else{
            socio=new Socio(nombre, apellido, registrarPresupuesto(), (int)Math.random()*500);
        }
        return socio;
    }
}
