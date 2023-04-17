
package zoologico;

/**
 *
 * @author DAVID NARANJO
 */
public class AnimalSalvaje extends Animal 
{
  private String nivelPeligrosidad;

    public AnimalSalvaje() {
    }
  
    public AnimalSalvaje(String nivelPeligrosidad, int codigo, String nombre) {
        super(codigo, nombre);
        this.nivelPeligrosidad = nivelPeligrosidad;
    }

    public String getNivelPeligrosidad() {
        return nivelPeligrosidad;
    }

    public void setNivelPeligrosidad(String NivelPeligrosidad) {
        this.nivelPeligrosidad = NivelPeligrosidad;
    }

    @Override
    public String toString() {
        return "AnimaSalvaje{" + "nivelPeligrosidad=" + nivelPeligrosidad + '}';
    }
  
  
}
