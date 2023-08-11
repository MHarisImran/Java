public class SinglyList{
    private Node head;

    SinglyList(){
        this.head = null;
    }

    boolean isEmpty(){
        return this.head == null;
    }

    Node getHead(){
        return this.head;
    }

    void setHead(Node head){
        this.head = head;
    }
    public void addShape(Shape shape) {
        Node node = new Node(shape);
        if (isEmpty()) {
            this.head = node;
        } else {
            Node temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }

    public void removeshape(int index) {
        if (index == 0) {
            this.head = this.head.getNext();
        } else {
            Node temp = this.head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());

        }

    }

    public void traverse(){
        Node temp = this.head;
        int count = 1;
        while (temp!=null){
            System.out.println(count + "" +temp.getData().toString());
            temp=temp.getNext();
            count++;
        }
    }

}
