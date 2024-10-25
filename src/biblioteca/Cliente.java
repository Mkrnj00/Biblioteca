
package biblioteca;

public class Cliente {
    private String nombre;
    private String libroPrestado;
    
public Cliente(String nombre,String libroPrestado){
    this.nombre = nombre;
    this.libroPrestado = libroPrestado;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(String libroPrestado) {
        this.libroPrestado = libroPrestado;
    }
    
    public void prestarLibro(Libro Libro){
    if (!"vacio".equals(libroPrestado)){
        System.out.println("Ya tiene un libro");}
    else{
        libroPrestado = Libro.getTitulo();}
    }
    
    public void devoloverLibro(Libro Libro){
      if(libroPrestado.equals(Libro.getTitulo())){
          Libro.setPrestado(false);
          setLibroPrestado("vacio");
          
      }
          
    }
            
     }