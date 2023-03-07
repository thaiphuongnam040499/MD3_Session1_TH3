package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scaner.nextFloat();
        System.out.println("Nhap vao height:");
        height = scaner.nextFloat();
        float area = width * height;
        System.out.println("area = "+ area);
    }
}
