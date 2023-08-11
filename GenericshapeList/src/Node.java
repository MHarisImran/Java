import java.awt.*;

public class Node {
    private Shape data;
    private Node next;

    Node(){
        this.data = null;
        this.next = null;

    }

    Node(Shape data){
        this.data = data;
        this.next = null;

    }


    public Shape getData() {

        return data;
    }

    public void setData(Shape data) {
        this.data = data;

    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

