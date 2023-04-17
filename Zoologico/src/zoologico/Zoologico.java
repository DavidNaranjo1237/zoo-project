
package zoologico;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author DAVID NARANJO
 */
public class Zoologico {
    static ArrayList<AnimalSalvaje>arAnimalSalvaje;
    static ArrayList<AnimalDomestico> arAnimalDomestico;
    static ArrayList<AnimalSilvestre> arAnimalSilvestre;
    static ArrayList<Planes> arPlanes;

    public static void main(String[] args)
    {
       BrowserIngreso ingreso = new BrowserIngreso();
        ingreso.setVisible(true);
        arAnimalSalvaje  = new ArrayList<AnimalSalvaje>();
        arAnimalDomestico   = new ArrayList<AnimalDomestico>();
        arAnimalSilvestre   = new ArrayList<AnimalSilvestre>();
        arPlanes  =  new ArrayList<Planes>();
         
        
        
    }
}
