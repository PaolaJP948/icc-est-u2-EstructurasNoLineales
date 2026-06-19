package structures.trees;

import structures.nodes.Node;

public class BinaryTree<T> {
    
    private Node<T> root;

     
    //private int peso;

    //constructor
    
    public BinaryTree() {
        this.root = null;
        //this.peso = 0;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    } 
// crea el nodo y el ingresa al arbol
//dos metodos setters para el mismo atributo
    public void setRoot(T value){
        Node<T> node = new Node<T>(value);
        this.root = node;


    }
    // el metodo add primero crea el nodo con el valor
    //valida o pregunta si la raiz tiene valor y si no tiene raiz es igual al retorno
    // 88 este metodo es importante porque es en el se basa casi todo

    public void add(T value ){ //cambie int po T
        
        Node<T> node = new Node<T>(value);// esta linea crea el nodo
        root = addRecursivo(root, node);// llama el metodo recursivo
        

    }
    // deber debuguiar el codigo
    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) //Caso Base
            return nodeInsertar;

        //if(actual.getValue() > nodeInsertar.getValue()){
        if(actual.getValue().compareTo(nodeInsertar.getValue())> 0){
            //izquierda
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));

        }else{
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
        
    }

    //metodo para ordenar en preOrden
    public void preOrder() {
        preOrderRecursivo(root);
    }
    //Pre Orden
    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        System.out.println(actual);
       
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

     public void posOrder() {
        posOrderRecursivo(root);
    }
    //Pos Orden
    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        
        
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.println(actual);
    }
    //In Orden
    public void inOrder(){
        inOrderRecursivo(root);
    }
    
    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        //System.out.println(actual);
        
        inOrderRecursivo(actual.getLeft());
         System.out.println(actual);
        inOrderRecursivo(actual.getRight());
    }
    //altura del arbol
    public int getHeight(){
        return getHeightRecursivo(root);

    }

    private int getHeightRecursivo(Node<T> actual) {
        if(actual ==  null)
            return 0;

        int heightLeft = getHeightRecursivo(actual.getLeft());
        int heightRight = getHeightRecursivo(actual.getRight());

        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1; 
    }

    //peso del arbol
    //public int getPeso(){
        //return getPesoRecursivo(root);

    //}

    public int getPeso(){
        return peso;
    }


    private int getPesoRecursivo(Node<T> actual) {
        if(actual ==  null)
            return 0;

        int heightLeft = getPesoRecursivo(actual.getLeft());
        int heightRight = getPesoRecursivo(actual.getRight());
        return heightLeft + heightRight + 1; 
    }









    



}
