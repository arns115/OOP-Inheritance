package compradores;

import java.util.Scanner;

public class Comprador {
    private String nombre;
    private String apellido;
    private double presupuesto;
    private int descuento;
    private int edad;
    public static int contador = 0;
    public static Scanner sc=new Scanner(System.in);

    public Comprador (String nombre, String apellido, double presupuesto, int edad, int descuento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.presupuesto = presupuesto;
        this.edad = edad;
        this.descuento = descuento;
        contador++;
    }

    public Comprador (String nombre, String apellido, double presupuesto, int descuento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.presupuesto = presupuesto;
        this.descuento = descuento;
        contador++;
    }

    public String getNombre(){
        return nombre+" "+apellido;
    }
    
    public void setPresupuesto(double presupuesto){
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto(){
        return presupuesto;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public int getDescuento() {
        return descuento;
    }

    public static String registrarNombre(){
        System.out.println("Ingrese el nombre del comprador");
        return sc.nextLine();
    }
    public static String registrarApellido(){
        System.out.println("Ingrese el apellido del comprador");
        return sc.nextLine();
    }
    public static double registrarPresupuesto(){
        System.out.println("Ingrese el presupuesto del comprador");
        double d=sc.nextFloat();
        sc.nextLine();
        return d;
    }
    public static int registrarEdad(){
        System.out.println("Ingrese la edad del comprador");
        int e=sc.nextInt();
        sc.nextLine();
        return e;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: "+getNombre()+"\n");
        sb.append("Presupuesto: "+getPresupuesto()+"\n");
        if(edad!=0){
            sb.append("Edad: "+getEdad()+"\n");
        }
        sb.append("Descuento: "+descuento+"%\n");
        return sb.toString();
    }

}
