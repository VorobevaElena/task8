package com.example;

import java.io.IOException;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число");
        Scanner scanSize = new Scanner(System.in);
        int n = scanSize.nextInt();
        int sum=0;
        for (int i=1; i<=n; i++)
        {
           if (i%2!=0){
               sum=sum+i;
           }
        }
        System.out.println("Сумма нечетных чисел - "+ sum);
    }
}
