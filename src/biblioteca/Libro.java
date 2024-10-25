
package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoPublicacion;
    private boolean prestado;
    private String clienteActual;
    
public Libro(String titulo, String autor,int numeroDePaginas,int anoPublicacion,boolean prestado,String clienteActual){
    this.titulo = titulo;
    this.autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    this.anoPublicacion = anoPublicacion;
    this.prestado = prestado;
    this.clienteActual = clienteActual;
}

public String getTitulo(){
    return titulo;
}
public String getAutor(){
    return autor;
}
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public String getClienteActual() {
        return clienteActual;
    }
    
    public String getInfo() {
        String info = "";
        info += "Nombre del libro: " + getTitulo() + "\n";
        info += "Autor: " + getAutor() + "\n";
        info += "Numero de paginas: " + getNumeroDePaginas() + "\n";
        info += "Año de publicacion: " + getAnoPublicacion() + "\n";
        info += "Esta prestado: " + isPrestado() + "\n";
        info += "Cliente actual: " + getClienteActual() + "\n";
        
        return info; 
    }
    
    public boolean isCorto(){
        if(numeroDePaginas <= 99){
            return true;}
        else{
            return false;}
        }
    
    public void prestar(Cliente Cliente){
        prestado = true;
        clienteActual = Cliente.getNombre();
    }
    
    public void devolver(Cliente Cliente){
        prestado = false;
        clienteActual = "ninguno";
        //System.out.println("El libro se ha devuelto correctamente");
        
    }
    }
