package dispositivos;

public class PC extends Computadora {
    private boolean tieneTeclado;
    private boolean tieneMouse;
    private boolean tieneMonitor;

    public PC(String marca, String anio, double precio, String color, String os, String procesador, int ram, int almacenamiento, boolean tieneTeclado, boolean tieneMouse, boolean tieneMonitor) {
        super(marca, anio, precio, color, os, procesador, ram, almacenamiento);
        this.tieneTeclado = tieneTeclado;
        this.tieneMouse = tieneMouse;
        this.tieneMonitor = tieneMonitor;
    }

    public PC(String marca, String anio, double precio, String os, String procesador, int ram, int almacenamiento, boolean tieneTeclado, boolean tieneMouse, boolean tieneMonitor) {
        super(marca, anio, precio, os, procesador, ram, almacenamiento);
        this.tieneTeclado = tieneTeclado;
        this.tieneMouse = tieneMouse;
        this.tieneMonitor = tieneMonitor;
    }

    public boolean isTieneTeclado() {
        return tieneTeclado;
    }

    public boolean isTieneMouse() {
        return tieneMouse;
    }

    public boolean isTieneMonitor() {
        return tieneMonitor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PC\n");
        sb.append(super.toString());
        sb.append("Tiene teclado: "+isTieneTeclado()+"\n");
        sb.append("Tiene mouse: "+isTieneMouse()+"\n");
        sb.append("Tiene monitor: "+isTieneMonitor()+"\n");
        return sb.toString();
    }
}
