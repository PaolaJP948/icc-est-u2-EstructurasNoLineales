import models.Persona;
import structures.nodes.Node;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio_01_insert;
import structures.trees.Ejercicio_02_invert;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree(); 
        runEjercicios1();
        runEjercicios2();
    

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
