package principal;

import java.util.*;

import compradores.*;
import dispositivos.*;

public class Principal {
    public static void main(String[] args){
        List <DispositivoElectronico> listaMercancia=new ArrayList<DispositivoElectronico>();
        Scanner sc=new Scanner(System.in);
        Estudiante estudiante=new Estudiante(null, null, 0, null, null, 0);
        Socio socio=new Socio(null, null, 0, 0);
        ClienteVip clienteVIP= new ClienteVip(null, null, 0, 0, 0, 0, 0);
        System.out.println("Bienvenido");
        int op=0, t;
        while(op==1){
            List <DispositivoElectronico> carritoUsuario=new ArrayList<DispositivoElectronico>();
            List <DispositivoElectronico> comprasFinales =new ArrayList<DispositivoElectronico>();  
            List <Integer> posiciones=new ArrayList<Integer>();  
            System.out.println("Que tipo de comprador entrará a la tienda? 1)Cliente VIP 2)Socio 3)Estudiante");
            t=sc.nextInt();
            switch(t){
                case 1:
                    clienteVIP=ClienteVip.registrarClienteVIP();
                    break;
                case 2:
                    socio=Socio.registrarSocio();
                    break;
                case 3:
                    estudiante=Estudiante.registrarEstudiante();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    continue;
            }
            System.out.println("Lista de objetos disponibles para el comprador:\n####################");
            int i=0;
            HashSet<Integer> Posibles = new HashSet<Integer>();
            for (DispositivoElectronico disp1:listaMercancia){
                if(disp1 instanceof DispositivoMovil){
                    if(disp1 instanceof Tablet && t==1){
                        System.out.println("Dispositivo "+i+"\n"+disp1);
                        Posibles.add(i);
                    }
                    else if(t<3){
                        System.out.println("Dispositivo "+i+"\n"+disp1);
                        Posibles.add(i);
                    }
                }
                if(disp1 instanceof Television){
                    if(t==1){
                        System.out.println("Dispositivo "+i+"\n"+disp1);
                        Posibles.add(i);
                    }
                }
                else{
                    System.out.println("Dispositivo "+i+"\n"+disp1);
                    Posibles.add(i);
                }
                i++;
            }
            System.out.println("Ingrese los elementos que quiera agregar al carrito de compras");
            int op1=0, item;
            while(op1!=2 && Posibles.size()>0){
                System.out.println("Ingrese el indice del objeto que se quiere agregar al carrito");
                item=sc.nextInt();
                sc.nextLine();
                if(Posibles.contains(item)){
                    carritoUsuario.add(listaMercancia.get(item));
                    posiciones.add(item);
                    Posibles.remove(item);
                }
                else{
                    System.out.println("Objeto no disponible para este usuario");
                }
                if(Posibles.size()>0){
                    System.out.println("Desea agregar mas dispositivos al carrito? 1)SI 2)NO");
                    op1=sc.nextInt();
                    sc.nextLine();
                }
            }
            System.out.println("Se procede con la compra");
            double dinero;
            while(carritoUsuario.size()>0){
                if(t==3){
                    dinero=carritoUsuario.get(0).getPrecio()-carritoUsuario.get(0).getPrecio()/estudiante.getDescuento();
                    if(estudiante.getPresupuesto()>dinero){
                        comprasFinales.add(carritoUsuario.get(0));
                        estudiante.setPresupuesto(estudiante.getPresupuesto()-dinero);
                        listaMercancia.remove(carritoUsuario.get(0));
                        System.out.println("Dispositivo "+posiciones.get(0)+ "  vendido");
                    }
                    else{
                        System.out.println("No hay dinero suficiente para comprar el objeto");
                    }
                    carritoUsuario.remove(0);   
                    posiciones.remove(0);
                }
                else if(t==2){
                    dinero=carritoUsuario.get(0).getPrecio()-carritoUsuario.get(0).getPrecio()/estudiante.getDescuento();
                }
            }
        }
    }
}
