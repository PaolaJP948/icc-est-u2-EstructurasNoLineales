package structures.trees;

import structures.nodes.Node;

public class Ejercicio_04_depth {

    
    public int maxDepth(Node<Integer> root) {

        if (root == null) {
            return 0;
        }
        //pro
        int proIzquierda = maxDepth(root.getLeft());
        int proDerecha = maxDepth(root.getRight());

        return Math.max(proIzquierda, proDerecha) + 1;
    }

}
