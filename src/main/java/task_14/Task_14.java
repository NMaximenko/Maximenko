package task_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_14 {
        public static void main (String[]args) throws IOException {
            String S;
            int X;
            double Y;
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            S = buf.readLine();
            //вариант 1) если введено нецелочисленное значение, можно бросить exception
//        try {
//            X = Integer.parseInt(S);
//        }catch (NumberFormatException e){
//            System.out.println("Веден строчный символ");
//        }
            //вариант 2. если введено нецелочисленное значение, то сохраняем для начала его в вещественном типе переменной и далее присваиваем в целочисленное
            double D = (Double.parseDouble(S));
            X = (int) D / 1;
            Y = X;
            System.out.println(S);
            System.out.println(X);
            System.out.println(Y);

        }
    }