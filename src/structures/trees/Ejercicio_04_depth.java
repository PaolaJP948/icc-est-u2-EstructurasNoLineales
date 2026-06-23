package structures.trees;

import structures.nodes.Node;

public class Ejercicio_04_depth {

    
    public int maxDepth(Node<Integer> root) {

        if (root == null) {
            return 0;
        }

        int profundidadIzquierda = maxDepth(root.getLeft());
        int profundidadDerecha = maxDepth(root.getRight());

        return Math.max(profundidadIzquierda, profundidadDerecha) + 1;
    }

    

}
