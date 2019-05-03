package task_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_14 {
    public static void main(String[] args) throws IOException {
        String S;
        int X;
        double Y;
        BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
        S=buf.readLine();
        X=Integer.parseInt(S);
        Y=X;

        System.out.println(S);
        System.out.println(X);
        System.out.println(Y);

    }
}
