package compradores;

public class ClienteVip extends Comprador {
    private double presupuestoExtra;
    private int puntos;
    private int nivelVip;

    public ClienteVip(String nombre, String apellido, double presupuesto, int edad, double presupuestoExtra, int descuento, int puntos, int nivelVip) {
        super(nombre, apellido, presupuesto, edad, descuento);
        this.presupuestoExtra = presupuestoExtra;
        this.puntos = puntos;
        this.nivelVip=nivelVip;
    }

    public ClienteVip(String nombre, String apellido, double presupuesto, double presupuestoExtra, int descuento, int puntos, int nivelVip) {
        super(nombre, apellido, presupuesto, descuento);
        this.presupuestoExtra = presupuestoExtra;
        this.puntos = puntos;
        this.nivelVip=nivelVip;
    }

    public double getPresupuestoExtra() {
        return presupuestoExtra;
    }

    public void setPresupuestoExtra(double presupuestoExtra) {
        this.presupuestoExtra = presupuestoExtra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        if (puntos >= 0) {
            this.puntos = puntos;
        } else {
            System.out.println("Los puntos no pueden ser negativos");
        }
    }

    public int getNivelVip() {
        return nivelVip;
    }

    public void setNivelVip(int nivelVip) {
        if (nivelVip >= 0) {
            this.nivelVip = nivelVip;
        } else {
            System.out.println("El nivel VIP no puede ser negativo");
        }
    }

    public static double registrarPresupuestoExtra(){
        System.out.println("Ingrese el presupuesto extra del cliente VIP");
        float d=sc.nextFloat();
        sc.nextLine();
        return d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente VIP\n");
        sb.append(super.toString());
        sb.append("Presupuesto extra: " + presupuestoExtra + "\n");
        sb.append("Puntos: " + puntos + "\n");
        sb.append("Nivel VIP: " + nivelVip + "\n");
        return sb.toString();
    }

    public static int registrarNivelVip(){
        System.out.println("Cual es el de nivel VIP del cliente? de 1 a 5");
        int nivel=sc.nextInt();
        sc.nextLine();
        return ((nivel>0 && nivel<=5) ? nivel: 0); 
    }

    public static ClienteVip registrarClienteVIP(){
        ClienteVip clienteVip;
        int op, nivel;
        String nombre=registrarNombre();
        String apellido=registrarApellido();
        System.out.println("Incluira la edad del comprador?1)SI 2)NO");
        op=sc.nextInt();
        sc.nextLine();
        if(op==1){
            nivel=registrarNivelVip();
            clienteVip=new ClienteVip(nombre, apellido, registrarPresupuesto(), registrarEdad(), registrarPresupuestoExtra(), nivel*10, (int)Math.random()*500, nivel);
        }
        else{
            nivel=registrarNivelVip();
            clienteVip=new ClienteVip(nombre, apellido, registrarPresupuesto(), registrarPresupuestoExtra(), nivel*10, (int)Math.random()*500, nivel);
        }
        return clienteVip;
    }
    
}
