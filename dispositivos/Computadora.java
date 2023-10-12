package dispositivos;

public class Computadora extends DispositivoElectronico {
    private String sistemaOperativo;
    private String procesador;
    private int ram;
    private int almacenamiento;

    public Computadora(String marca, String anio, double precio, String color, String sistemaOperativo, String procesador, int ram, int almacenamiento) {
        super(marca, anio, precio, color);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public Computadora(String marca, String anio, double precio, String sistemaOperativo, String procesador, int ram, int almacenamiento) {
        super(marca, anio, precio);
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public setOs(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getOs() {
        return sistemaOperativo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora\n");
        sb.append(super.toString());
        sb.append("Sistema operativo: " + sistemaOperativo + "\n");
        sb.append("Procesador: " + procesador + "\n");
        sb.append("RAM: " + ram + "\n");
        sb.append("Almacenamiento: " + almacenamiento + "\n");
        return sb.toString();
    }
}
