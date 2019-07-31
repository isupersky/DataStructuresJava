
class node{

    int data ;
    node ptr;

    node(int data){
        this.data = data;
        ptr = null;
    }

}

public class LinkedList{
    public static void main(String str[]){

        LinkedList1 l1 = new LinkedList1();
        l1.add(7);
        l1.add(26);
        l1.add(3);
        l1.add(6);
        l1.add(5);
        l1.add(67);
        l1.display();
        l1.delete(4);
        l1.display();
       // l1.deleteLastNode();
        //l1.display();

    }
}

class LinkedList1 {
    node start;

    public void add(int data){
        if(start == null){
            start = new node(data);
        }
        else{
            node temp  = start;
            while (temp.ptr!= null)
                temp = temp.ptr;

            temp.ptr = new node(data);
        }

       System.out.println("Node Added");
    }

    public void display(){
        node temp = start;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.ptr;
        }
    }

    public void delete(int data){
        int count = 1;
        node tempprev = start;
        while(tempprev!= null){
            if(count == data){
                break;
            }
            tempprev = tempprev.ptr;
            count++;
        }

        tempprev.ptr = tempprev.ptr.ptr;

        System.out.println("Node deleted");
    }

    public void deleteLastNode(){
        node tempprev = start;
        while(tempprev.ptr.ptr!= null){
            tempprev = tempprev.ptr;
        }

        tempprev.ptr = null;

        System.out.println("Last Node deleted");
    }

}


