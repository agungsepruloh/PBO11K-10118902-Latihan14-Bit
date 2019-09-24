package com.pbo;

/**
 *
 * # Author
 * Nama : Agung Sepruloh
 * Kelas : PBO11K
 * NIM : 10118902
 *
 */

public class PBO11K10118902Latihan14Bit {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;
        c = a & b;

        System.out.println("a & b = " + c);

        System.out.println(c);
        c = a | c;
        System.out.println(c);
        System.out.println("a | c = " + c);

        c = a ^ b;
        System.out.println("a * c = " + c);

        c = ~a;
        System.out.println("-a = " + c);

        c = a << 2;
        System.out.println("a << 2 = " + c);

        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
}
