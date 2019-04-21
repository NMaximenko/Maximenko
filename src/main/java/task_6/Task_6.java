package task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(buf.readLine());
        int y=Integer.parseInt(buf.readLine());
        int z=Integer.parseInt(buf.readLine());
        int avg=(x+y+z)/3;
        System.out.println(avg);
        if (avg%2==0&&avg/2>3)
            System.out.println("Программа выполнена корректно");
    }
}
