
package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
public class Sets {

    public  Set<String>  construirHashSet(){
         Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;


    }

    public Set<String> construirLinkedHashSet(){

         Set<String> LinkedhashSet = new LinkedHashSet<>();
        LinkedhashSet.add("A");
        LinkedhashSet.add("B");
        LinkedhashSet.add("C");
        LinkedhashSet.add("A");
        LinkedhashSet.add("D");
        LinkedhashSet.add("E");
        LinkedhashSet.add("F");
        LinkedhashSet.add("1Ggggggeegeg");
        LinkedhashSet.add("2G2gggggeegeg");
        LinkedhashSet.add("3Gggggeegeg");
        LinkedhashSet.add("4Ggggggeegeg");
        LinkedhashSet.add("5Ggggggeegeg");
        LinkedhashSet.add("5Ggggggeegeg");
        LinkedhashSet.add("6Ggggggeegeg");
        LinkedhashSet.add("G7gggggeegeg");
        return LinkedhashSet;

    }

    public Set< String> construirTreeSet(){
         Set<String> tSet = new TreeSet<>();
        tSet.add("A");
        tSet.add("B");
        tSet.add("C");
        tSet.add("A");
        tSet.add("D");
        tSet.add("E");
        tSet.add("F");
        tSet.add("1Ggggggeegeg");
        tSet.add("2G2gggggeegeg");
        tSet.add("3Gggggeegeg");
        tSet.add("4Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("5Ggggggeegeg");
        tSet.add("6Ggggggeegeg");
        tSet.add("G7gggggeegeg");

        return tSet;

        

    }

    public Set<Contacto> construirHasSetContacto(){
        Set<Contacto> hCSet = new HashSet<>();

        /*hCSet.add(new Contacto("Juan", "Perez", "123456789"));
        hCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        hCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        hCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        hCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        hCSet.add(new Contacto("Juan", "Lopez", "123456789"));*/


        Contacto c1 = (new Contacto("Juan", "Perez", "123456789"));
        Contacto c2 = (new Contacto("Ana", "Gomez", "987654321"));
        Contacto c3 = (new Contacto("Pedro", "Lopez", "456789123"));
        Contacto c4 = (new Contacto("Maria", "Rodriguez", "789123456"));
        Contacto c5 = (new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        Contacto c6 = (new Contacto("Juan", "Lopez", "123456789"));

        System.out.println(c1.hashCode());
        System.out.println( c5.hashCode());

        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);

        return hCSet;
    }

    public Set<Contacto> construirTreeSetContacto() {

        Set<Contacto> tCSet= new TreeSet<>(
            // ;as tres lineas es para no hacer otro metodo
           //manda una funcion como parametro flecha que retorna la 
            (c1, c2)->{
                int conmP = c1.getNombre().compareTo(c2.getNombre());//compara por nombres

                if (conmP != 0)
                    return conmP; 
                int compA = c1.getApellido().compareTo(c2.getApellido());//compara por apellido
                return compA;
            }
        );

        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789")); // Duplicado, no se agregará
        tCSet.add(new Contacto("Juan", "Lopez", "123456789"));

        return tCSet;

        
    }

}
