import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            solve(N);
            //wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static void solve(int N) {
        boolean flag = false;

        for(int i =0;i<N;i++){
            if(i%N!=0)
            {
                flag = true;

                System.out.println("Yes");

            }
        }
        if(flag==false){
            System.out.println("No");
        }

    
    }
}