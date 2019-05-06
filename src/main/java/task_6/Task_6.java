package task_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        double x=Integer.parseInt(buf.readLine());
        double y=Integer.parseInt(buf.readLine());
        double z=Integer.parseInt(buf.readLine());
        double avg=(x+y+z)/3;
        System.out.println(avg);
        int avg1=(int)avg/2;
        if (avg>3)
            System.out.println("Программа выполнена корректно");
    }
}
