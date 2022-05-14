public class SinglyLinkedList<T> {
    // Nested Class Nodes
    private class Node<T>{
        private T content;
        private Node<T> nextNode;

        // Konstruktor
        public Node(T content, Node<T> nextNode){
            this.content = content;
            this.nextNode = nextNode;
        }

        //Getter und Setter
        public T getContent(){
            return this.content;
        }

        public void setContent(T content){
            this.content = content;
        }

        public Node<T> getNextNode(){
            return this.nextNode;
        }

        public void setNextNode(Node<T> nextNode){
            this.nextNode = nextNode;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int amountNodes;

    //Konstruktor der SinglyLinkedList
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.amountNodes = 0;
    }

    // Gibt Anzahl der Elemente in der Liste zurück
    public int getSize(){
        return this.amountNodes;
    }

    // Gibt true zurück, falls die Liste leer ist
    public boolean isEmpty(){
        return amountNodes == 0;
    }

    //Fügt eine Node am Anfang der Liste ein
    public void addAtFront(T content){
        Node<T> newNode = new Node<T>(content, null);

    //Wenn die Liste leer ist, setzt nächste Node auf Null, head und taul auf newNode
    if(isEmpty()){
        newNode.setNextNode(null);
        head = newNode;
        tail = newNode;
        amountNodes++;
    } else{
        newNode.setNextNode(head);
        head = newNode;
        amountNodes++;
    }
    }

    //Fügt ein Element am Ende der Liste an
    public void addAtEnd(T content){
        Node<T> newNode = new Node<T>(content, null);

        if(isEmpty()){
            addAtFront(content);
        } else {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    //Das erste Element der Liste ausgeben
    public Node<T> getFirstElement(){
        if (isEmpty()) {
            return null;
        } else {
            return head;
        }
    }

    // Das letzte Element der Liste ausgeben
    public Node<T> getLastElement(){
        if (isEmpty()) {
            return null;
        } else {
            return tail;
        }
    }

    //Am Anfang der Liste
    public void removeAtFront(){
        if(isEmpty()) {
            System.out.println("Kein Element in der Liste");
        } else {
            head = head.getNextNode();
        }
    }
}

