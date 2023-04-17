
package zoologico;

/**
 *
 * @author DAVID NARANJO
 */
public class AnimalDomestico extends Animal 
{
    String especie;

    public AnimalDomestico() {
    }
    

    public AnimalDomestico(String especie, int codigo, String nombre) {
        super(codigo, nombre);
        this.especie = especie;
    }
    

    public String getespecie() {
        return especie;
    }

    public void setespecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "AnimalDomestico{" + "especie=" + especie + '}';
    }
    
}
