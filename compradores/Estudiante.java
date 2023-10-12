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

    public static String registrarUniversidad(){
        System.out.println("Ingrese la universidad del estudiante");
        return sc.nextLine();
    }

    public static String registrarCarrera(){
        System.out.println("Ingrese la carrera del estudiante");
        return sc.nextLine();
    }

    public static int registrarSemestre(){
        System.out.println("Ingrese el semestre que cursa");
        int s=sc.nextInt();
        sc.nextLine();
        return s;
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

    public static Estudiante registrarEstudiante(){
        Estudiante estudiante;
        int op;
        String nombre=registrarNombre();
        String apellido=registrarApellido();
        System.out.println("Incluira la edad del comprador?1)SI 2)NO");
        op=sc.nextInt();
        sc.nextLine();
        if(op==1){
            estudiante=new Estudiante(nombre, apellido, registrarPresupuesto(), registrarEdad(), registrarUniversidad(), registrarCarrera(), registrarSemestre());
        }
        else{
            estudiante=new Estudiante(nombre, apellido, registrarPresupuesto(), registrarUniversidad(), registrarCarrera(), registrarSemestre());
        }
        return estudiante;
    }
}
