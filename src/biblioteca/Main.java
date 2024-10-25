package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro Libro1 = new Libro("El Quijote","Miguel de Cervantes",500,1605,false,"ninguno");
        Libro Libro2 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",417,1967,false,"ninguno");
        Libro Libro3 = new Libro("1984","George Orwell",328,1949,false,"ninguno");
        Libro Libro4 = new Libro("Orgullo y prejuicio","Jane Austen",279,1813,false,"ninguno");
        Libro Libro5 = new Libro("El Principito","Antoine de Saint-Exupery",96,1943,false,"ninguno");
        
        Cliente Cliente1 = new Cliente("Manuelito","vacio");
        Cliente Cliente2 = new Cliente("Joselito","vacio");
        Cliente Cliente3 = new Cliente("Eduardito","vacio");
        int option = 0;
                
        do {

            System.out.println("===== Menú de Biblioteca =====");
            System.out.println("1 - Lista de Libros");
            System.out.println("2 - Buscar por Titulo ");
            System.out.println("3 - Prestar Libro a un cliente");
            System.out.println("4 - Devolver Libro");
            System.out.println("5 - Salir");

            System.out.println("===============================");
            System.out.println("Ingrese una opción:");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
            case 1: 
                System.out.println("====== Lista de Libros ======");
                System.out.println("1- "+Libro1.getInfo());
                System.out.println("===============================");
                System.out.println("2- "+Libro2.getInfo());
                System.out.println("===============================");
                System.out.println("3- "+Libro3.getInfo());
                System.out.println("===============================");
                System.out.println("4- "+Libro4.getInfo());
                System.out.println("===============================");
                System.out.println("5- "+Libro5.getInfo());
                System.out.println("==============================");
                    break;
            case 2: 
                    System.out.println("Ingrese el título del libro:");
                    String buscar = sc.nextLine();
                //IgnoreCase para poder buscar sin tener que preocuparse de mayusculas o minusculas   
                    if(buscar.equalsIgnoreCase(Libro1.getTitulo())){
                    System.out.println(Libro1.getInfo());
                    }
                    else if(buscar.equalsIgnoreCase(Libro2.getTitulo())){
                    System.out.println(Libro2.getInfo());
                    }
                    else if(buscar.equalsIgnoreCase(Libro3.getTitulo())){
                    System.out.println(Libro3.getInfo());
                    }
                    else if(buscar.equalsIgnoreCase(Libro4.getTitulo())){
                    System.out.println(Libro4.getInfo());
                    }
                    else if(buscar.equalsIgnoreCase(Libro5.getTitulo())){
                    System.out.println(Libro5.getInfo());
                    }
                    else{
                    System.out.println("Busqueda no valida");
                            }
                    break;
                    
            case 3: 
                System.out.println("====== Lista de Clientes ======");
                System.out.println("1- "+ Cliente1.getNombre()+" | Libro prestado:"+Cliente1.getLibroPrestado());
                System.out.println("2- "+ Cliente2.getNombre()+" | Libro prestado:"+Cliente2.getLibroPrestado());
                System.out.println("3- "+ Cliente3.getNombre()+" | Libro prestado:" +Cliente3.getLibroPrestado());
                System.out.println("==============================");
                System.out.println("Seleccione el cliente (1-3):");
                    
                int num_cliente = sc.nextInt();
                    sc.nextLine();
                    
                if (num_cliente==1 || num_cliente ==2 || num_cliente == 3){
                    System.out.println("====== Lista de Libros ======");
                    System.out.println("1- "+Libro1.getTitulo());
                    System.out.println("2- "+Libro2.getTitulo());
                    System.out.println("3- "+Libro3.getTitulo());
                    System.out.println("4- "+Libro4.getTitulo());
                    System.out.println("5- "+Libro5.getTitulo());
                    
                    
                }
                
                int num_libro = sc.nextInt();
                    
                switch(num_cliente){
                case 1: // cliente 1
                    sc.nextLine();
                    switch (num_libro) {  
                    case 1:
                    if (Libro1.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro1.prestar(Cliente1);
                        Cliente1.prestarLibro(Libro1);
                    } 
                    break;

                    case 2:
                    if (Libro2.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro2.prestar(Cliente1);
                        Cliente1.prestarLibro(Libro2);
                    } 
                    break;

                    case 3:
                    if (Libro3.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro3.prestar(Cliente1);
                        Cliente1.prestarLibro(Libro3);
                    } 
                    break;

                    case 4:
                    if (Libro4.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro4.prestar(Cliente1);
                        Cliente1.prestarLibro(Libro4);
                    }
                    break;
             
                    case 5:
                    if (Libro5.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro5.prestar(Cliente1);
                        Cliente1.prestarLibro(Libro5);
                    } 
                    break;
                    
                    default:
                        break;
                    }
                    break;

                case 2: // cliente 2                        
                    switch (num_libro) {
                        
                    case 1:
                    if (Libro1.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro1.prestar(Cliente2);
                        Cliente2.prestarLibro(Libro1);
                    } 
                    break;

                    case 2:
                    if (Libro2.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro2.prestar(Cliente2);
                        Cliente2.prestarLibro(Libro2);
                    } 
                    break;

                    case 3:
                    if (Libro3.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro3.prestar(Cliente2);
                        Cliente2.prestarLibro(Libro3);
                    } 
                    break;

                    case 4:
                    if (Libro4.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro4.prestar(Cliente2);
                        Cliente2.prestarLibro(Libro4);
                    }
                    break;

                    case 5:
                    if (Libro5.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro5.prestar(Cliente2);
                        Cliente2.prestarLibro(Libro5);
                    } 
                    break;

                    default:
                        break;
                    }
                    break; 

                case 3: //cliente 3
 
                    switch (num_libro) {
                        
                    case 1:
                    if (Libro1.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro1.prestar(Cliente3);
                        Cliente3.prestarLibro(Libro1);
                    } 
                    break;

                    case 2:
                    if (Libro2.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro2.prestar(Cliente3);
                        Cliente3.prestarLibro(Libro2);
                    } 
                    break;

                    case 3:
                    if (Libro3.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro3.prestar(Cliente3);
                        Cliente3.prestarLibro(Libro3);
                    } 
                    break;

                    case 4:
                    if (Libro4.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro4.prestar(Cliente3);
                        Cliente3.prestarLibro(Libro4);
                    }
                    break;

                    case 5:
                    if (Libro5.isPrestado()) {     
                        System.out.println("Este libro esta prestado");
                    } else {
                        Libro5.prestar(Cliente3);
                        Cliente3.prestarLibro(Libro5);
                    } 
                    break;

                    default:
                        break;
                }}
                break; 
        case 4:
                System.out.println("====== Lista de Clientes con libros prestados ======");
                System.out.println("==============================");
                System.out.println("1- " + Cliente1.getNombre() + " | Libro prestado: " + Cliente1.getLibroPrestado());
                System.out.println("2- " + Cliente2.getNombre() + " | Libro prestado: " + Cliente2.getLibroPrestado());
                System.out.println("3- " + Cliente3.getNombre() + " | Libro prestado: " + Cliente3.getLibroPrestado());
                System.out.println("Seleccione el cliente (1-3):");
                //sc.nextLine();
                int devolverLibro= sc.nextInt();
                
                String libroActual1 = Cliente1.getLibroPrestado();
                String libroActual2 = Cliente2.getLibroPrestado();
                String libroActual3 = Cliente3.getLibroPrestado();
                 sc.nextLine();
                switch(devolverLibro){   
                case 1:
                if (libroActual1.equals(Libro1.getTitulo())) {
                    Cliente1.devoloverLibro(Libro1);
                    System.out.println(Libro1.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual1.equals(Libro2.getTitulo())) {
                    Cliente1.devoloverLibro(Libro2);
                    System.out.println(Libro2.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual1.equals(Libro3.getTitulo())) {
                    Cliente1.devoloverLibro(Libro3);
                    System.out.println(Libro3.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual1.equals(Libro4.getTitulo())) {
                    Cliente1.devoloverLibro(Libro4);
                    System.out.println(Libro4.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual1.equals(Libro5.getTitulo())) {
                    Cliente1.devoloverLibro(Libro5);
                    System.out.println(Libro5.getTitulo()+ " devuelto correctamente.");
                }break;
                
                
                case 2:
                if (libroActual2.equals(Libro1.getTitulo())) {
                    Cliente2.devoloverLibro(Libro1);
                    System.out.println(Libro1.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual2.equals(Libro2.getTitulo())) {
                    Cliente2.devoloverLibro(Libro2);
                    System.out.println(Libro2.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual2.equals(Libro3.getTitulo())) {
                    Cliente2.devoloverLibro(Libro3);
                    System.out.println(Libro3.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual2.equals(Libro4.getTitulo())) {
                    Cliente2.devoloverLibro(Libro4);
                    System.out.println(Libro4.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual2.equals(Libro5.getTitulo())) {
                    Cliente2.devoloverLibro(Libro5);
                    System.out.println(Libro5.getTitulo()+ " devuelto correctamente.");
                }break;
                
                case 3:
                if (libroActual3.equals(Libro1.getTitulo())) {
                    Cliente3.devoloverLibro(Libro1);
                    System.out.println(Libro1.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual3.equals(Libro2.getTitulo())) {
                    Cliente3.devoloverLibro(Libro2);
                    System.out.println(Libro2.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual3.equals(Libro3.getTitulo())) {
                    Cliente3.devoloverLibro(Libro3);
                    System.out.println(Libro3.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual3.equals(Libro4.getTitulo())) {
                    Cliente3.devoloverLibro(Libro4);
                    System.out.println(Libro4.getTitulo()+ " devuelto correctamente.");
                } else if (libroActual3.equals(Libro5.getTitulo())) {
                    Cliente3.devoloverLibro(Libro5);
                    System.out.println(Libro5.getTitulo()+ " devuelto correctamente.");
                }break;
                }
                
                
        }}while (option != 5);
        }
}
    

