package dispositivos;

public class Tablet extends DispositivoMovil {
    private String sistemaOperativo;
    private boolean tieneFunda;

    public Tablet(String marca, String anio, double precio, String color, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String sistemaOperativo, boolean tieneFunda) {
        super(marca, anio, precio, color, Peso, TieneCamara, Bolsillo, TieneInternet);
        this.sistemaOperativo = sistemaOperativo;
        this.tieneFunda = tieneFunda;
    }

    public Tablet(String marca, String anio, double precio, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String sistemaOperativo, boolean tieneFunda) {
        super(marca, anio, precio, Peso, TieneCamara, Bolsillo, TieneInternet);
        this.sistemaOperativo = sistemaOperativo;
        this.tieneFunda = tieneFunda;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public boolean isTieneFunda() {
        return tieneFunda;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tablet\n");
        sb.append(super.toString());
        sb.append("Sistema Operativo: "+getSistemaOperativo()+"\n");
        sb.append("Tiene funda: "+isTieneFunda()+"\n");
        return sb.toString();
    }
}
