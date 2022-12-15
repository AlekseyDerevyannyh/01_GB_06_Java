package ru.gb.eseminar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        callMethod6("");
        List<String> stringArraysList = callMethod1();
        int a = 10, b = 5;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(List<String> stringArraysList) {
        callMethod6("");
//        callMethod3(stringArraysList);
    }

    private static List<String> callMethod1() {
        callMethod2(100000000, 10 + 10);
        return new ArrayList<>();
    }

    public static int callMethod2(int a, int b) {
        callMethod6("");
        try (FileInputStream fis = new FileInputStream("1.txt")) {
            fis.read();
            if(fis.available() > 0) throw new RuntimeException();
        } catch (Exception e) {
            throw new IllegalStateException("File not found!");
        }

        int num = callMethod4("1240");
        if (b == 0) {
            throw new IllegalStateException("You can't divide by zero!");
        }
        return a/b;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        Integer temp;
        try {
            temp = Integer.parseInt(s);
        } catch (Exception e) {
            throw new IllegalStateException("It's not digit!");
        }
        return temp;
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 1; i < strings.length; i++){
            strings[i] = s;
        }
    }
}