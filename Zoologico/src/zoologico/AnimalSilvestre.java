
package zoologico;

/**
 *
 * @author DAVID NARANJO
 */
public class AnimalSilvestre extends Animal 
{
  private String tipo;

    public AnimalSilvestre()
    {
              
    }

    public AnimalSilvestre(String tipo, int codigo, String nombre)
    {
        
        super(codigo, nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "AnimalSilvestre{" + "tipo=" + tipo + '}';
}
}

