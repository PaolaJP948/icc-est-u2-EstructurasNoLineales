package structures.trees;

import structures.nodes.Node;

public class Ejercicio_01_insert {

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
        System.err.println("Ejercicio_01_Insert: ");
        System.out.println(" Insertando un Árbol Binario ");
        printTreeRecursivo(root, 0);

    }

    public void printTreeRecursivo(Node<Integer> actual, int espacio){

        if(actual == null){
            return ;
        }

        espacio +=5 ;
        printTreeRecursivo( actual.getRight(), espacio );
        System.out.println();

        for( int i = 0; i< espacio; i++){
            System.out.print( " " );
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(),espacio);
    
    }




}
