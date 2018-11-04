package com.company;

public class Main {

    public static void main(String[] args) {
        int sum4 = sum(8, 13, 23, 11);
        System.out.println("Сумма:"+sum4);
    }

    public static int sum(int ... params) {
        int result = 0;
        for (int i = 0; i < params.length; i++) {
            result+= params[i];
        }
        return result;
    }
}
