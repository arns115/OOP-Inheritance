package compradores;

public class Estudiante extends Comprador{
    private String universidad;
    private String carrera;
    private int semestre;
    static int contador = 0;

    public Estudiante(String nombre, String apellido, double presupuesto, int edad, String universidad, String carrera, int semestre) {
        super(nombre, apellido, presupuesto, edad, 10);
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
        contador++;
    }

    public Estudiante(String nombre, String apellido, double presupuesto, String universidad, String carrera, int semestre) {
        super(nombre, apellido, presupuesto, 10);
        this.universidad = universidad;
        this.carrera = carrera;
        this.semestre = semestre;
        contador++;
    }

    public String getUniversidad() {
        return universidad;
    }
    
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre >= 0&&semestre<=10) {
            this.semestre = semestre;
        } else {
            System.out.println("El semestre no puede ser negativo ni mayor a 10");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante\n");
        sb.append(super.toString());
        sb.append("Universidad: " + universidad + "\n");
        sb.append("Carrera: " + carrera + "\n");
        sb.append("Semestre: " + semestre + "\n");
        return sb.toString();
    }


}
