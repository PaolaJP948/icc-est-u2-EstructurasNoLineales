package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import structures.nodes.Node;

public class Ejercicio_03_listLeves {
     public List<LinkedList<Integer>> listLevels(Node<Integer> root) {

        List<LinkedList<Integer>> niveles = new ArrayList<>();

        if (root == null) {
            return niveles;
        }

        listarNiveles(root, 0, niveles);
        return niveles;
    }

    private void listarNiveles(Node<Integer> actual, int nivel, List<LinkedList<Integer>> niveles) {
        if (actual == null) {
            return;
        }
        if (niveles.size() == nivel) {
            niveles.add(new LinkedList<>());
        }
        niveles.get(nivel).add(actual.getValue());
        listarNiveles(actual.getLeft(), nivel + 1, niveles);
        listarNiveles(actual.getRight(), nivel + 1, niveles);
    }

    public void imprimirNiveles(List<LinkedList<Integer>> niveles) {

        for (LinkedList<Integer> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i));

                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}
