package eunbyeol.baekjoon.Mathematics;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dan =  sc.nextInt();

        for(int i=0; i<dan; i++) {
            for(int j=0; j<(dan-1)-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
