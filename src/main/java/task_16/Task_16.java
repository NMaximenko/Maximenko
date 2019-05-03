package task_16;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_16 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String point=buf.readLine();
        buf.close();
        FileInputStream file = new FileInputStream(point);
        String strLine="";
        BufferedReader buf2=new BufferedReader(new InputStreamReader(file));
        while ((strLine=buf2.readLine())!=null){
            System.out.println(strLine);
        }
    }
}D:/FILE_NAME.txt
}
