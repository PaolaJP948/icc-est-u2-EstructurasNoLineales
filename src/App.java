import models.Persona;
import structures.nodes.Node;
import structures.trees.BinaryTree;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();

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
