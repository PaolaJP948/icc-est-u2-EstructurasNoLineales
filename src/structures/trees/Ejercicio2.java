package structures.trees;

import structures.nodes.Node;

public class Ejercicio2 {

    public void inverTree(Node<Integer> roots){

        BinaryTree<Integer> arbol = new BinaryTree<>();

        arbol.inOrder();
        printTree((arbol.getRoot()));
        for (int numero : roots);
            arbol.add(numero);

        Node<Integer> roots = arbol.getRoot();
        ejercicio2.inverTree(roots);
        System.out.println();("Arbol Original");
        printtree

    }
    public void inv

    


}
