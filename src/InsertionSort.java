public class InsertionSort {
    public static void main(String str[]){
        int[] Arr ={9,7,2,9,6,82};
        int tempIndex;
         for(int i = 1 ;i<Arr.length;i++){
             tempIndex=i;
             for(int j =i-1;j>=0;j--){
                 if(Arr[j]>Arr[i]){
                     int temp = Arr[j];
                     Arr[j]= Arr[i];
                     Arr[i]=temp;
                     i--;
                 }

             }
             i=tempIndex;
         }

         for (int i = 0;i<Arr.length;i++){
             System.out.println(Arr[i]);
         }
    }
}
