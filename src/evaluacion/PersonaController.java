package evaluacion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
    //arguemnetos del mapa la cleve del tipo String 
    //Ma<String, Set<Sting>> map = new Tree
    //mapa.put(Joven, new LinkedHashSet())
    // en la prueba va a cambiar la organizaciob
    public  Set<Persona> filtrarYOrdenar( List<Persona> personas, int edadUmbral){
        Set< Persona> personasFiltradas = new TreeSet<>(
            (p1, p2)-> {
                int compE = Integer.compare(p2.getEdad(), p1.getEdad());
                if(compE != && xxx){
                    //nombres == retorno 0 no ingrese
                    return 0;
                }
                int compN = p1.getNombre().compareToIgnoreCase(p2.getNombre());
                return compN;
            }
        );
       
        return null;
    }

    public Map<String, Set<String>> agruparPorEdad(List<Persona> persona){
        //personas agrupadas por edad 
        //usar el metodo split este metodo hace que donde encuentre un arguemnto que yo le de va a darle un  espacio y va  a separ 

       /* String  nombre = "Juan Perez";//separado 
        String [] palabras = nombre.split(" ");//de forma mas directa 
        String primerNombre = palabras[0];
        nombre.split(" " );
        //devuelve ["Juan", "Perez"]

        return null; */

        

    }


    
}
