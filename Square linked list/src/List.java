public class List {
    private Node head;

    List(){
        this.head = null;
    }

   List(Square data){
        this.head = new Node(data);
   }

   Node getHead(){
        return this.head;
   }

   void setHead(Node head){
        this.head = head;
   }

   boolean isEmpty(){
        return this.head == null;
   }

   void insertAtEnd(int Length){
        if (isEmpty()){
            this.head = new Node(new Square(Length));
        }
        else {
            Node temp = this.head;
            while (temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(new Node(new Square(Length)));
        }
   }

   void insertAtbegin(int Length){
        Node newNode = new Node(new Square(Length));
        newNode.setNext(this.head);
        head = newNode;
   }

   void delete(int Length){
        if (isEmpty()){
            System.out.println("The list is Empty");
        }

        else{
            Node temp = this.head;
            while(temp.getNext().getData().getLength()!=Length){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext());
        }

   }

   void traversal(){
        Node temp =  this.head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
   }

}
