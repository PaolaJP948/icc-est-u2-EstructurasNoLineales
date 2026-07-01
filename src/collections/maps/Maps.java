package collections.maps;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import collections.set.Sets;
import models.Contacto;

public class Maps {

    //String va ser el tipo de  la clave 
    // Integer es el tipo del valor de la clave

    //Map< K, V>
    //Map<tipo de clave, tipoValor>
    //  Map< String, Integer>
    public Map<String, Integer> construirHashMap(){


        Map<String, Integer>  mapa =  new HashMap<>();// hashMap hace que no guarde un orden
        mapa. put("A", 10);// aquie para agregar un dato no se usa el metood add() sino se usa put() esto para diccionarios 
        mapa. put("B", 20);
        mapa. put("C", 30);// agrega una entrada, la entrada es la clave y el valor 
        mapa. put("A", 40);

        System.out.println(mapa.size());//size() cuenta el numero de entrada 
        System.out.println(mapa);

        for( int i = 0; i < mapa.size(); i ++){
            System.out.println(mapa.values().toArray()[i]);// va a convertir en un arrglo de los datos ingresados 
        }
        

        for (String Key : mapa.keySet()) {
            System.out.println(Key);
 
        }
        System.out.println(mapa.get("A"));
        System.out.println(mapa.get( "B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F",100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public Map<String, Integer> cLinkedHashMap(){//linkedHashMap guarda el orden de la entrada 
         Map<String, Integer>  mapa =  new LinkedHashMap<>();
        mapa. put("A", 10);// aquie para agregar un dato no se usa el metood add() sino se usa put() esto para diccionarios 
        mapa. put("B", 20);
        mapa. put("C", 30);// agrega una entrada, la entrada es la clave y el valor 
        mapa. put("A", 40);
        return mapa;


    }

    public Map<String, Integer> cTreeMap(){// guarda el orden natural de las claves
        Map<String, Integer>  mapa =  new TreeMap<>();//h
        mapa. put("J", 10);// aquie para agregar un dato no se usa el metood add() sino se usa put() esto para diccionarios 
        mapa. put("B", 20);
        mapa. put("C", 30);// agrega una entrada, la entrada es la clave y el valor 
        mapa. put("A", 40);
        return mapa;

    }

    public Set<Contacto> ordenarUnicos(List<Contacto> contactos){

        Set<Contacto> nueva = new TreeSet<>( 
            (c1, c2)-> {
                if(c1.getNombre().equals(c2.getNombre())){
                    return 0;
                }
                return c1.getApellido().compareTo(c2.getApellido());
            });

        for (Contacto contacto : contactos){
            nueva.add(contacto);
        }
        return nueva;


        
    }
}

