package dispositivos;

public class Celular extends DispositivoMovil {
    private String operador;
    private String numero;
    public Celular(String marca, String anio, double precio, String color, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String operador, String numero) {
        super(marca, anio, precio, color, Peso, TieneCamara, Bolsillo, TieneInternet);
        this.operador = operador;
        this.numero = numero;
    }
    public Celular (String marca, String anio, double precio, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String operador, String numero) {
        super(marca, anio, precio, Peso, TieneCamara, Bolsillo, TieneInternet);
        this.operador = operador;
        this.numero = numero;
    }
    public String getOperador() {
        return operador;
    }
    public String getNumero() {
        return numero;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Celular\n");
        sb.append(super.toString());
        sb.append("Operador: "+getOperador()+"\n");
        sb.append("Numero: "+getNumero()+"\n");
        return sb.toString();
    }

}
