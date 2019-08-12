import java.util.Random;

public class ArrayStack<T> {

    T stack[];
    int top;

    ArrayStack(){

       stack = (T[]) new Object[10];
       top = -1;
    }

    boolean push(T var){
        if(top>=9){
            System.out.println("OVER-FLOW");
            return false;
        }
        else{
            stack[++top]= var;

        return true;}
    }

    T pop() {
        if (top < 0) {
            System.out.println("UNDER-FLOW");
            return null;
        } else {
            return stack[top--];
        }}

    T peek() {
            if (top < 0) {
                System.out.println("UNDER-FLOW");
                return null;
            } else {
                return stack[top];

            }
        }


    }

 class ArrayStackMain{
    public static void main(String args[]){
        ArrayStack<Float> as = new ArrayStack<Float>();
        //Random rand = new Random();
        for(int i =0 ; i <10;i++){
            as.push((float)i+10);
            float temp = as.peek();
            System.out.print(temp +" ");
        }
        System.out.println("");
        for(int i = 0; i<10;i++){
            float temp = as.pop();
            System.out.println(temp);
        }
    }
 }
