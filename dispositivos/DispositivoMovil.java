package dispositivos;

public class DispositivoMovil extends DispositivoElectronico{
    private float Peso;
    private boolean TieneCamara;
    private boolean Bolsillo;
    private boolean TieneInternet;
    private int contador1=0;

    public DispositivoMovil(String marca, String anio, double precio, String color, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet) {
        super(marca, anio, precio, color);
        this.Peso = Peso;
        this.TieneCamara = TieneCamara;
        this.Bolsillo = Bolsillo;
        this.TieneInternet = TieneInternet;
        contador1++;
    }

    public DispositivoMovil(String marca, String anio, double precio, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet) {
        super(marca, anio, precio);
        this.Peso = Peso;
        this.TieneCamara = TieneCamara;
        this.Bolsillo = Bolsillo;
        this.TieneInternet = TieneInternet;
        contador1++;
    }

    public float getPeso() {
        return Peso;
    }

    public boolean isTieneCamara() {
        return TieneCamara;
    }

    public boolean isBolsillo() {
        return Bolsillo;
    }

    public boolean isTieneInternet() {
        return TieneInternet;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dispositivo Movil\n");
        sb.append(super.toString());
        sb.append("Peso: "+getPeso()+"\n");
        sb.append("Tiene camara: "+isTieneCamara()+"\n");
        sb.append("Cabe en el bolsillo: "+isBolsillo()+"\n");
        sb.append("Tiene internet: "+isTieneInternet()+"\n");
        return sb.toString();
    }
    
}
