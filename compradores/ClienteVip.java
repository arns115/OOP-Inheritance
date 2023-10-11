package compradores;

public class ClienteVip extends Comprador {
    private double presupuestoExtra;
    private int puntos;
    private int nivelVip;

    public ClienteVip(String nombre, String apellido, double presupuesto, int edad, double presupuestoExtra, int descuento, int puntos) {
        super(nombre, apellido, presupuesto, edad, descuento|);
        this.presupuestoExtra = presupuestoExtra;
        this.puntos = puntos;
    }

    public ClienteVip(String nombre, String apellido, double presupuesto, double presupuestoExtra, int descuento, int puntos) {
        super(nombre, apellido, presupuesto, descuento);
        this.presupuestoExtra = presupuestoExtra;
        this.puntos = puntos;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente VIP\n");
        sb.append(super.toString());
        sb.append("Presupuesto extra: " + presupuestoExtra + "\n");
        sb.append("Puntos: " + puntos + "\n");
        sb.append("Nivel VIP: " + nivelVip + "\n");
        return sb.toString();
    }


    
}
