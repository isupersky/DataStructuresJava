import java.util.ArrayList;

public class CustomArrayList<T> {
    private int size= 10;
    int i = 0;
    private T[] array;

    CustomArrayList(){
        array = (T[])new Object[size];
    }

    void add(T var){
        if(i>=size){
            T[] temp = (T[])new Object[size*2];
            for(int x = 0; x< size;x++){
                temp[x]=array[x];
            }
            size*=2;
            array = temp;
            array[i]= var;
            i++;

        }
        else {
            array[i] = var;
            i++;
        }
    }

    T get(int i){
        return array[i];
    }

}

class Main{
    public static void main(String args[]){
        CustomArrayList<Integer> arr= new CustomArrayList<>();
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        arr.add(21);

        for(int i =0; i < 12;i++){
            int res = arr.get(i);
            System.out.println(res);
        }

    }
}
