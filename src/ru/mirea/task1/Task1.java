package ru.mirea.task1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        int[] m = new int[] {3, 5, 8, 2, 4};
        int sum = 0;
        for(int i = 0; i < m.length; ++i){
            sum += m[i];
        }
        System.out.print(sum);
        System.out.print('\n');
        sum = 0;
        int i = 0;
        while (i < m.length){
            sum += m[i];
            i++;
        }
        System.out.print(sum);
        System.out.print('\n');
        sum = 0;
        i = 0;
        do {
            sum += m[i];
            ++i;
        } while (i < m.length);
        System.out.print(sum);
        System.out.print('\n');
        reader();
    }
    public static void reader() {
        String s;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; ++i){
            s = sc.next();
            System.out.print(s+'\n');
        }
    }
}