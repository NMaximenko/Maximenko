package task_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_15 {
    public static void main(String[] args) throws IOException {
        int X[]=new int[10];
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <X.length ; i++) {
            X[i]=Integer.parseInt(buf.readLine());
        }
        for (int i = 0; i <X.length ; i++) {
            for (int j = X.length-1; j >i ; j--) {
                if (X[j]<X[j-1]){
                    int temp=X[j];
                    X[j]=X[j-1];
                    X[j-1]=temp;
                }
            }
        }
        for (int i = 0; i <X.length ; i++) {
            System.out.print(X[i]);
        }
    }
}
