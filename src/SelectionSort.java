import java.util.Arrays;

public class SelectionSort {

    public static void main(String argr[]){
        int Arr[] = {8,9,1,4,4,1,2,3};

        for(int i = 0;i<Arr.length;i++){
            int temp = 0,inx=0;
            inx= Selection(i, Arr);
            temp = Arr[i];
            Arr[i]= Arr[inx];
            Arr[inx]= temp;
        }
        for(int i = 0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }

    static int Selection(int inx, int[] Arr){
        int min= inx;
        for(int i= inx+1;i<Arr.length;i++){
            if(Arr[i]<Arr[min]){min= i;}
        }
        return min;
    }

}
