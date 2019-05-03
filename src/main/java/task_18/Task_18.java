package task_18;

import java.io.*;

public class Task_18 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        String point=buf.readLine();
        File file = new File(point);
        FileInputStream fileInputStream=new FileInputStream(file);
        String out="";
        buf=new BufferedReader(new InputStreamReader(fileInputStream));
        while ((out=buf.readLine())!=null) {
            System.out.println(out);
        }buf.close();
        String in="";
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            if ((in=buffer.readLine()).equals("stop!"))
                break;
            bufferedWriter.write(in);
            bufferedWriter.newLine();
        }
        buffer.close();
        bufferedWriter.close();

    }}
}
