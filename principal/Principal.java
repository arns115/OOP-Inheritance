package principal;

import java.util.*;

import compradores.*;
import dispositivos.*;

public class Principal {
    public static void main(String[] args){
        List <DispositivoElectronico> listaMercancia=new ArrayList<DispositivoElectronico>();
        listaMercancia.add(new Laptop("Apple", "2002", 25000.0, "Rojo", "MacOs", "Intel Core I9", 16, 2000, 3.4f, false, false, true));
        listaMercancia.add(new Smartphone("Samsung", "2021", 29999.99, 1.3f, true, true, true, "Telcer", "77492914", "GalaxyS22", "Samsung", "Tactil"));

        Scanner sc=new Scanner(System.in);
        Estudiante estudiante=new Estudiante(null, null, 0, null, null, 0);
        Socio socio=new Socio(null, null, 0, 0);
        ClienteVip clienteVIP= new ClienteVip(null, null, 0, 0, 0, 0, 0);
        System.out.println("Bienvenido");
        int op=1, t;
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
                    System.out.print("Presupuesto del comprador: "+estudiante.getPresupuesto());
                    dinero=carritoUsuario.get(0).getPrecio()-carritoUsuario.get(0).getPrecio()/estudiante.getDescuento();
                    System.out.print("Costo del dispositivo con el descuento del "+estudiante.getDescuento()+"% : "+dinero);
                    if(estudiante.getPresupuesto()>=dinero){
                        comprasFinales.add(carritoUsuario.get(0));
                        estudiante.setPresupuesto(estudiante.getPresupuesto()-dinero);
                        listaMercancia.remove(carritoUsuario.get(0));
                        System.out.println("Dispositivo "+posiciones.get(0)+ "  vendido");
                    }
                    else{
                        System.out.println("No hay dinero suficiente para comprar el objeto");
                    }
                }
                else if(t==2){
                    System.out.println("Presupuesto del socio: "+socio.getPresupuesto());
                    System.out.println("Puntos del socio: "+socio.getPuntos());
                    dinero=carritoUsuario.get(0).getPrecio()-carritoUsuario.get(0).getPrecio()/socio.getDescuento();
                    System.out.println("Costo del dispositivo con el descuento del "+socio.getDescuento()+"% :" +dinero);
                    if(socio.getPresupuesto()+socio.getPuntos()>=dinero){
                        int puntos=socio.getPuntos();
                        comprasFinales.add(carritoUsuario.get(0));
                        socio.setPuntos((int)Math.max(puntos-dinero, 0));
                        dinero-=puntos;
                        if(dinero>0){
                            socio.setPresupuesto(socio.getPresupuesto()-dinero);
                            socio.setPuntos((int)dinero/socio.getDescuento());
                        }
                        listaMercancia.remove(carritoUsuario.get(0));
                        System.out.println("Dispositivo "+posiciones.get(0)+ "  vendido");
                        System.out.println("Se le aumentan los puntos del precio al socio");
                    }
                    else{
                        System.out.println("No hay dinero suficiente para comprar el objeto");
                    }
                }
                else{
                    clienteVIP.setPresupuesto(clienteVIP.getPresupuesto()+clienteVIP.getPresupuestoExtra());
                    clienteVIP.setPresupuestoExtra(0);
                    System.out.println("Presupuesto del cliente VIP: "+clienteVIP.getPresupuesto());
                    System.out.println("Puntos del Cliente VIP: "+clienteVIP.getPuntos());
                    dinero=carritoUsuario.get(0).getPrecio()-carritoUsuario.get(0).getPrecio()/clienteVIP.getDescuento();
                    System.out.println("Costo del dispositivo con el descuento del "+clienteVIP.getDescuento()+"% :" +dinero);
                    if(clienteVIP.getPresupuesto()+clienteVIP.getPuntos()>=dinero){
                        int puntos=clienteVIP.getPuntos();
                        comprasFinales.add(carritoUsuario.get(0));
                        clienteVIP.setPuntos((int)Math.max(puntos-dinero, 0));
                        dinero-=puntos;
                        if(dinero>0){
                            clienteVIP.setPresupuesto(clienteVIP.getPresupuesto()-dinero);
                            clienteVIP.setPuntos((int)dinero/clienteVIP.getDescuento());
                        }
                        listaMercancia.remove(carritoUsuario.get(0));
                        System.out.println("Dispositivo "+posiciones.get(0)+ "  vendido");
                        System.out.println("Se le aumentan los puntos del precio al cliente VIP");
                    }
                    else{
                        System.out.println("No hay dinero suficiente para comprar el objeto");
                    }
                }
                carritoUsuario.remove(0);   
                posiciones.remove(0);
            }
            System.out.println("Compras finales: \n######################################");
            for (DispositivoElectronico disp2: comprasFinales){
                System.out.println(disp2+"\n");
            }
        }
        System.out.println("\nEntrara algun otro cliente? 1)SI 2)NO");
        op=sc.nextInt();
        sc.nextLine();
        System.out.println("Habra restock del inventario? 1)SI 2)NO");
    }
}
