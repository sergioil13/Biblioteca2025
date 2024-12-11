
package es.educastur.sergioil.biblioteca2025;


/**
 *
 * @author alu12d
 */
import java.time.LocalDate;
public class Prestamo {
    private Libro libroPrest;
    private Usuario UsuarioPrest;
    private LocalDate fechaPrest;
    private LocalDate fechaDev;

    public Prestamo(Libro libroPrest, Usuario UsuarioPrest, LocalDate fechaPrest, LocalDate fechaDev) {
        this.libroPrest = libroPrest;
        this.UsuarioPrest = UsuarioPrest;
        this.fechaPrest = fechaPrest;
        this.fechaDev = fechaDev;
    }

    public Libro getLibroPrest() {
        return libroPrest;
    }

    public Usuario getUsuarioPrest() {
        return UsuarioPrest;
    }

    public LocalDate getFechaPrest() {
        return fechaPrest;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setLibroPrest(Libro libroPrest) {
        this.libroPrest = libroPrest;
    }

    public void setUsuarioPrest(Usuario UsuarioPrest) {
        this.UsuarioPrest = UsuarioPrest;
    }

    public void setFechaPrest(LocalDate fechaPrest) {
        this.fechaPrest = fechaPrest;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }

    @Override
    public String toString() {
        return libroPrest +"-"+ UsuarioPrest +"-"+  fechaPrest + "-"+fechaDev ;
    }

    
    

    
     
    
    
}
