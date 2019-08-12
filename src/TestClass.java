
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        ArrayList<String> res = new ArrayList<>();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            String str = sc.nextLine();
            for(int i=1;i<=str.length();i++){
                if(!str.contains(Integer.toString(i))){
                    flag = false;
                    break;
                }
            }
            if(flag==true)
                res.add("YES");
            else
                res.add("NO");

            t--;
            flag=true;
        }
        for(int i = 0;i<res.size();i++){
            System.out.println(res.get(i));
        }

    }
}



/**
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t>0){
            String str = sc.nextLine();
            for(int i=1;i<=str.length();i++){
                if(!str.contains(Integer.toString(i))){
                    flag = false;
                    break;
                }
            }
            if(flag==true)
                System.out.println("YES");
            else
                System.out.println("NO");

            t--;
            flag = true;
        }

    }
}
*/