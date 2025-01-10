/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package es.educastur.sergioil.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alu12d
 */
public class Biblioteca2025 {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario>usuarios;
    private ArrayList<Prestamo>prestamos;

    public Biblioteca2025() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
    }
    
    
         
    public static void main(String[] args) {
        Biblioteca2025 b= new Biblioteca2025();
        b.cargaDatos();
        b.menuPrincipal();
        
    }

  public void cargaDatos(){
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Médico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chamán","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraíso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudú","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El último barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",2)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    
        for (Libro l:libros) {
            System.out.println(l);
        }
        System.out.println("");
        for (Usuario u:usuarios) {
            System.out.println(u);
        }
        System.out.println("");
        for (Prestamo p:prestamos) {
            System.out.println(p);
        }
    }
 //<editor-fold defaultstate="collapsed" desc="GESTION DE MENUS">
    private void menuPrincipal()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENU PRINCIPAL\n");
            System.out.println("\t\t\t\t1 - LIBROS");
            System.out.println("\t\t\t\t2 - USUARIOS");
            System.out.println("\t\t\t\t3 - PRESTAMOS");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    menuLibros();
                    break;
                }
                case 2:
                {
                    menuUsuarios();
                    break;
                }
                case 3:
                {
                    menuPrestamos();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
     private void menuLibros()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENU LIBROS\n");
            System.out.println("\t\t\t\t1 - NUEVO LIBRO");
            System.out.println("\t\t\t\t2 - ELIMINAR LIBRO");
            System.out.println("\t\t\t\t3 - MODIFICAR LIBRO");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    nuevoLibro();
                    break;
                }
                case 2:
                {
                    eliminarLibro();
                    break;
                }
                case 3:
                {
                    modificarLibro();
                    break;
                }
                case 4:
                {
                    listaLibro();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
     
     private void menuPrestamos()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENU PRESTAMOS\n");
            System.out.println("\t\t\t\t1 - NUEVO PRESTAMO");
            System.out.println("\t\t\t\t2 - ELIMINAR PRESTAMO");
            System.out.println("\t\t\t\t3 - MODIFICAR PRESTAMO");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    nuevoPrestamo();
                    break;
                }
                case 2:
                {
                    eliminarPrestamo();
                    break;
                }
                case 3:
                {
                    modificarPrestamo();
                    break;
                }
                case 4:
                {
                    listaPrestamo();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
     private void menuUsuarios()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do
        {
            System.out.println("\n\n\n\n\t\t\t\tMENU USUARIOS\n");
            System.out.println("\t\t\t\t1 - NUEVO USUARIO");
            System.out.println("\t\t\t\t2 - ELIMINAR USUARIO");
            System.out.println("\t\t\t\t3 - MODIFICAR USUARIO");
            System.out.println("\t\t\t\t4 - LISTADO");
            System.out.println("\t\t\t\t9 - SALIR");
            
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    nuevoUsuario();
                    break;
                }
                case 2:
                {
                    eliminarUsuario();
                    break;
                }
                case 3:
                {
                    modificarUsuario();
                    break;
                }
                case 4:
                {
                    listaUsuario();
                    break;
                }
            }
        }
        while(opcion != 9);
    }
     
     private void menuIncorrecto()
    {
        Scanner sc = new Scanner (System.in);
        int opcion = 0;
        do
        {
            System.out.println("\t\t\t\t1-VOLVER A TECLEAR");
            System.out.println("\t\t\t\t2-AÑADIR EJEMPLARES");
            System.out.println("\t\t\t\t3-IR AL MENU");

            
            opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    nuevoLibro();
                    break;
                }
                
                case 2:
                {
                    nuevoLibro();
                    break;
                }
                case 3:
                {
                    menuLibros();
                    break;
                }
                
                
            }
        }
        while(opcion != 9);
    }
     
     //</editor-fold>
     
 //<editor-fold defaultstate="collapsed" desc="GESTION DE LIBROS">
    private void nuevoLibro()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe el isbn del libro");
         String isbn =solicitaIsbn() ;
         int posIsbn=buscaIsbn(isbn); 
         if(posIsbn!=-1){
             System.out.println("El libro ya esta registrado en la biblioteca");
             menuIncorrecto();
         }else{
         System.out.println("Escribe el titulo del libro");
        String titulo=sc.nextLine();
        System.out.println("Escribe el autor del libro");
        String autor=sc.nextLine();
        System.out.println("Escribe el genero del libro");
        String genero=sc.nextLine();
        System.out.println("Escribe el numero de ejemplares");
        int ejemplares=sc.nextInt();
        libros.add(new Libro(isbn,titulo,autor,genero,ejemplares));
         }
        
    }

    private void eliminarLibro()
    {
        
    }

    private void modificarLibro()
    {
        
    }

    private void listaLibro()
    {
        for (Libro l : libros) 
        {
            System.out.println(l);
        }
    }
    private void aumentarEjemplares(){
        System.out.println("");
}
//</editor-fold>
    
 //<editor-fold defaultstate="collapsed" desc="GESTION DE USUARIOS">
    private void nuevoUsuario()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe tu DNI");
        String dni=sc.nextLine();
        System.out.println("Escribe tu nombre");
        String nombre=sc.nextLine();
        System.out.println("Escribe tu email");
        String email=sc.nextLine();
        System.out.println("Escribe tu telefono");
        String telefono=sc.nextLine();
       usuarios.add(new Usuario(dni,nombre,email,telefono));
        
        
        
    }

    private void eliminarUsuario()
    {
        System.out.println("Dime tu DNI");
        int posDni=buscaDni(solicitaDni());
        if (posDni==-1) {
            System.out.println("El usuario no existe");
        }else{
            usuarios.remove(posDni);
            System.out.println("Usuario eliminado");
        }
    }

    private void modificarUsuario()
    {
                           
    }

    private void listaUsuario()
    {
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
        
    
    }
    
   
//</editor-fold>
          
 //<editor-fold defaultstate="collapsed" desc="GESTION DE PRESTAMOS">
    private void nuevoPrestamo()
    {   
        LocalDate hoy = LocalDate.now();
        System.out.println("Identificación del usuario: ");
        int posUsuario = buscaDni(solicitaDni());
        if (posUsuario == -1)
        {
            System.out.println("No es aún usuario de la biblioteca");
        }
        else
        {
            System.out.println("Identificaión del libro: ");
            int posLibro = buscaIsbn(solicitaIsbn());
            if (posLibro == -1)
            {
                System.out.println("El ISBN pertenece a un libro inexistente");
            }
                else if (libros.get(posLibro).getEjemplares() > 0)
                {
                    prestamos.add(new Prestamo(libros.get(posLibro), usuarios.get(posUsuario), hoy, hoy.plusDays(15)));
                    libros.get(posLibro).setEjemplares(libros.get(posLibro).getEjemplares() - 1);
                    }
                    else
                    {
                        System.out.println("No quedan unidades disponibles de este libro");
                    }
        }
    }
    
    private void eliminarPrestamo()
    {
        
    }

    private void modificarPrestamo()
    {
        
    }

    private void listaPrestamo()
    {
        for (Prestamo p : prestamos) 
        {
            System.out.println(p);
        }
    } 
    public int buscaDni (String dni)
    {
        int pos = -1;
        for (int i = 0; i < usuarios.size(); i++) 
        {
            if (usuarios.get(i).getDni().equalsIgnoreCase(dni))
            {
                pos = i;
                break;
            }     
        }
        return pos;
    }
    /**
     * Método para buscar un libro en la colección libros
     * @param isbn (String) del libro a buscar en la colección
     * @return posición (int) del usuario en el Arraylist, valor -1 si no se encuentra
     */
    public int buscaIsbn (String isbn)
    {
        int pos = -1;
        for (int i = 0; i < libros.size(); i++) 
        {
            if (libros.get(i).getIsbn().equalsIgnoreCase(isbn))
            {
                pos = i;
                break;
            }     
        }
        return pos;
    }
    
    /**
     * Método para solicitar por teclado el DNI de un usuario. Pdte de validación
     * @return (String) dni de un usuario tecleado
     */
    public String solicitaDni ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el dni del usuario: ");
        String dni = sc.next();
        return dni;
    }
    
    /**
     * Método para solicitar por teclado el ISBN de un libro. Pdte de validación
     * @return (String) isbn del libro tecleado
     */
    public String solicitaIsbn ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el isbn del libro: ");
        String isbn = sc.next();
        return isbn;
    }
//</editor-fold>
    public int buscaPrestamo(String dni, String isbn){
    int pos=-1;
    for (int i = 0; i < prestamos.size(); i++) {
        if(prestamos.get(i).getUsuarioPrest().getDni().equals(dni) && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){
        pos=i;
        break;
        }
        
    }
    return pos;
    }
    
    private void prorroga(){
        System.out.println("Datos para la prorroga del prestamo");
        int pos=buscaPrestamo(solicitaDni(),solicitaIsbn());
        if (pos==-1) {
            System.out.println("No hay ningun libro cos esos datos");
        }else{
        
        prestamos.get(pos).setFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
        }
    }
}
     



