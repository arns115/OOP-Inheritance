package dispositivos;

public class Smartphone extends Celular{
    private String modelo;
    private String sistemaOperativo;
    private String tipoPantalla;

    public Smartphone(String marca, String anio, double precio, String color, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String operador, String numero, String modelo, String sistemaOperativo, String tipoPantalla) {
        super(marca, anio, precio, color, Peso, TieneCamara, Bolsillo, TieneInternet, operador, numero);
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoPantalla = tipoPantalla;
    }

    public Smartphone(String marca, String anio, double precio, float Peso, boolean TieneCamara, boolean Bolsillo, boolean TieneInternet, String operador, String numero, String modelo, String sistemaOperativo, String tipoPantalla) {
        super(marca, anio, precio, Peso, TieneCamara, Bolsillo, TieneInternet, operador, numero);
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoPantalla = tipoPantalla;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Smartphone\n");
        sb.append(super.toString());
        sb.append("Modelo: "+getModelo()+"\n");
        sb.append("Sistema Operativo: "+getSistemaOperativo()+"\n");
        sb.append("Tipo de Pantalla: "+getTipoPantalla()+"\n");
        return sb.toString();
    }

}
