package structures.trees;

import structures.nodes.Node;

public class Ejercicio1 {

    public void insert(int[] numeros){

        //IntTree arbol = new IntTree();
        //Crear el arbol de enteros
        BinaryTree<Integer> arbol = new BinaryTree<>();
         //Insertar cada numero
        for (int numero : numeros) {
            arbol.add(numero);
            
        }
        // imprimir el arbol
        arbol.inOrder();
        printTree((arbol.getRoot()));

    }
    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el Árbol");
        printTreeRecursivo(root, 0);

    }

    public void printTreeRecursivo(Node<Integer> actual, int value){

        if(actual == null){
            return ;
        }

        value +=5 ;
        printTreeRecursivo( actual.getRight(), value);
        System.out.println();

        for( int i = 0; i< value; i++){
            System.out.println(" ");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(),value);
    
    }




}
