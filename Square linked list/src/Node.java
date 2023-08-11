public class Node {
    private Square data;
    private Node next;

    Node(){
      this.data = new Square();
      this.next = null;

    }

    Node(Square data){
        this.data = data;
        this.next = null;

    }

    Node(Square data, Node next){
        this.data = data;
        this.next = next;
    }

    public Square getData() {
        return data;
    }

    public void setData(Square data) {
        this.data = data;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
