package dispositivos;

public class Television extends DispositivoElectronico{
    private String resolucion;
    private boolean smart;
    private boolean hdmi;
    private boolean Curva;

    public Television(String marca, String anio, double precio, String color, String tipo, String resolucion, boolean smart, boolean hdmi, boolean esCurva) {
        super(marca, anio, precio, color);
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.smart = smart;
        this.hdmi = hdmi;
        this.esCurva = esCurva;
    }

    public Television(String marca, String anio, double precio, String tipo, String resolucion, boolean smart, boolean hdmi, boolean esCurva) {
        super(marca, anio, precio);
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.smart = smart;
        this.hdmi = hdmi;
        this.esCurva = esCurva;
    }

    public String getResolucion() {
        return resolucion;
    }

    public boolean isSmart() {
        return smart;
    }

    public boolean isHdmi() {
        return hdmi;
    }

    public boolean isCurva() {
        return Curva;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Television\n");
        sb.append(super.toString());
        sb.append("Resolucion: "+getResolucion()+"\n");
        sb.append("Smart: "+isSmart()+"\n");
        sb.append("HDMI: "+isHdmi()+"\n");
        sb.append("Curva: "+isCurva()+"\n");
        return sb.toString();
    }



}
