package dispositivos;

public class Laptop extends Computadora {
    private float peso;
    private boolean tieneCamara;
    private boolean touchScreen;
    private boolean touchID;

    public Laptop(String marca, String anio, double precio, String color, String os, String procesador, int ram, int almacenamiento, float peso, boolean tieneCamara, boolean touchScreen, boolean touchID) {
        super(marca, anio, precio, color, os, procesador, ram, almacenamiento);
        this.peso = peso;
        this.tieneCamara = tieneCamara;
        this.touchScreen = touchScreen;
        this.touchID = touchID;
    }

    public Laptop(String marca, String anio, double precio, String os, String procesador, int ram, int almacenamiento, float peso, boolean tieneCamara, boolean touchScreen, boolean touchID) {
        super(marca, anio, precio, os, procesador, ram, almacenamiento);
        this.peso = peso;
        this.tieneCamara = tieneCamara;
        this.touchScreen = touchScreen;
        this.touchID = touchID;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public boolean isTieneCamara() {
        return tieneCamara;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public boolean isTouchID() {
        return touchID;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laptop\n");
        sb.append(super.toString());
        sb.append("Peso: "+getPeso()+"\n");
        sb.append("Tiene camara: "+isTieneCamara()+"\n");
        sb.append("Tiene touch screen: "+isTouchScreen()+"\n");
        sb.append("Tiene touch ID: "+isTouchID()+"\n");
        return sb.toString();
    }

}
