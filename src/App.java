import java.util.LinkedList;
import java.util.List;

import models.Persona;
import structures.nodes.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio_01_insert;
import structures.trees.Ejercicio_02_invert;
import structures.trees.Ejercicio_03_listLeves;
import structures.trees.Ejercicio_04_depth;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree(); 
        runEjercicios1();
        runEjercicios2();
        runEjercicio3();
        runEjercicio4();
    

    }

    private static void runEjercicio4() {
        // Primera forma de hacer este ejercicio
        BinaryTree<Integer> arbol = new BinaryTree<>();

        int[] numeros = {4, 2, 7, 1, 3, 0};

        for (int numero : numeros) {
            arbol.add(numero);
        }
        Ejercicio_04_depth ejercicio4 = new Ejercicio_04_depth();



        System.out.println("Ejercicio 4: profundidad del arbol ");
        System.out.println("Entrada:");
        System.out.println("        4");
        System.out.println("      2   7");
        System.out.println("     1 3");
        System.out.println("    0");// Tuve que cambiar de numero aquie porque si se usaba 
        // el nodo 8 pues lo  que  hacia es poner en el lado derecho del arbol y no podia ir debajo 
        // del uno usando el metodo add, como el 8 es mayor que el 4 y mayor que el 7 entonces quedaria en el lado derecho del arbol
        // de esta forma sale que el nivel del arbol es de 4 caso contrario el 8 al ser mayor se posicionaria en el lado derecho  del arbol dando un 
        // nivel de 3

        System.out.println();
        int profundidad = ejercicio4.maxDepth(arbol.getRoot());
        System.out.println("Salidaa: " + profundidad);

        //segunda forma de hacer este ejerciico pero ya usando el numero 8 
        // de esta forma se debe de  insertar el nodo uno por uno.
         Node<Integer> root = new Node<>(4);
        root.setLeft(new Node<>(2));
        root.setRight(new Node<>(7));

        root.getLeft().setLeft(new Node<>(1));
        root.getLeft().setRight(new Node<>(3));

        root.getLeft().getLeft().setLeft(new Node<>(8));

        int profund = ejercicio4.maxDepth(root);

        System.out.println("\n Ejercicio 4: Segunda Forma");


        System.out.println("Entrada:");
        System.out.println("    " + root.getValue());
        System.out.println("  " + root.getLeft().getValue() + "     " + root.getRight().getValue());
        System.out.println(" " + root.getLeft().getLeft().getValue() + "   " + root.getLeft().getRight().getValue());
        System.out.println(root.getLeft().getLeft().getLeft().getValue());

        System.out.println();
        System.out.println("Salida: " + profund);

    }
        

    private static void runEjercicio3() {

        BinaryTree<Integer> arbol = new BinaryTree<>();

        int[] numeros = {4, 2, 7, 1, 3, 6, 9};

        for (int numero : numeros) {
             arbol.add(numero);
        }

        Ejercicio_03_listLeves ejercicio3 = new Ejercicio_03_listLeves();

        List<LinkedList<Integer>> niveles =  ejercicio3.listLevels(arbol.getRoot());

        System.out.println("Ejercicio 3 listLevels:");
        System.out.println("Entrada:");

        int espacios = niveles.size() * 4;

        for (LinkedList<Integer> nivel : niveles) {

        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        for (Integer valor : nivel) {
            System.out.print(valor + "   ");
        }
        System.out.println();
        espacios -= 2;
        }

        System.out.println();
        System.out.println("Salida:");

        ejercicio3.imprimirNiveles(niveles);
        
    } 

    public static void runEjercicios1(){//metodo para insertar un arbol desde un arreglo de numeros
        Ejercicio_01_insert ejercicio1 = new Ejercicio_01_insert();
        int[] numeros = new int[]{5, 3, 7, 2, 4, 6, 8,};


        ejercicio1.insert(numeros);
        
        // (/n es un salto de linea )
        //(/t es una tabulacion)
        /// 
        
       

    }

    public static void runEjercicios2(){
         BinaryTree<Integer> arbol= new BinaryTree<>();
        int[] numero2 =  new int[] {4, 2, 7, 1, 3, 6, 9};
        
        for (int num : numero2){
            arbol.add(num);
        }

        Ejercicio_02_invert ejercicio2 = new Ejercicio_02_invert();

        System.out.println("Ejercicio 2 : Invertir un arbol Binario");
        System.out.println("Arbol Original:");
        ejercicio2.printTree(arbol.getRoot());

        ejercicio2.inverTree(arbol.getRoot());
        System.out.println("\nArbol invertido");
        ejercicio2.printTree(arbol.getRoot());

    }

    private static void runBinaryTree(){

        BinaryTree<String> arbolStrings =  new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();


        arbolPersonas.add(new Persona("Pablo", 30));// en la prueba de solo nos va a dar la lista
        arbolPersonas.add(new Persona("Ana", 25));//dentro del metodo add se esta instanciando a la persona
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        
        
    }

    private static void runIntTree() {
            // en la prueba solo va a ver estas lineas de codigo y preguntar cual es el pre orden, pos-orden, in-orden
        IntTree arbolNumeros = new IntTree();

      

        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(75);
        arbolNumeros.add(55);

          
        System.out.println("Esta en Pre-Order");
        arbolNumeros.preOrder();

        System.out.println("Esta en Pos -Order");
        arbolNumeros.posOrder();

        System.out.println("Esta en In-Order");
        arbolNumeros.inOrder();

        System.out.println("Altura" + arbolNumeros.getHeight());
        
        System.out.println("Peso del Arbol" + arbolNumeros.getPeso());

        /*Node<Integer> node1 = new Node(50);
        Node<Integer> node2 = new Node(10);
        Node<Integer> node3 = new Node(30);*/
        /*arbolNumeros.setRoot(node1);
        node1.setRight(node2);
        node2.setLeft(node3);
        System.out.println(arbolNumeros.getRoot());
        System.out.println(arbolNumeros.getRoot().getLeft().getRight());*/
    }
}
