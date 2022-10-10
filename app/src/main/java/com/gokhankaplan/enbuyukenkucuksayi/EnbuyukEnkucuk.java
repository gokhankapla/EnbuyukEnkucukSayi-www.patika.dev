package com.gokhankaplan.enbuyukenkucuksayi;

import java.util.Scanner;

public class EnbuyukEnkucuk {
    public static void main(String[] args) {
        int numb,maxnumb = 0, minimumnumb = 0;
        int i = 1, enterednumb;

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ");
        numb = input.nextInt();

        while (i<=numb) {
            System.out.println(i + "." + "number for entering");
            enterednumb = input.nextInt();
            if(i == 1) {
                maxnumb = enterednumb;
                minimumnumb = enterednumb;
            } else {
                if (enterednumb>maxnumb) {
                    maxnumb=enterednumb;
                } else if (enterednumb < minimumnumb) {
                    minimumnumb=enterednumb;
            }
            }
            i++;
        }
        System.out.println("Max number is " + maxnumb);
        System.out.println("Min number is " + minimumnumb);


    }
}
