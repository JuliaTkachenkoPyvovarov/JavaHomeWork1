package com_pb.tkachenkoPyvovarova.hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    static String format(String a) {
        char[] c = a.toCharArray();        // преобразовіваю в массив символов char[] result = str.toCharArray();
        //System.out.println(c);
        Arrays.sort(c);          // сортирую по возрастанию Arrays.sort(array)
        //System.out.println(c);
        String b = new String(c);  // меняю снова на строку
        b = b.trim(); // удаляю пробелі
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x; //вводимые пользователем переменные
        String y; //вводимые пользователем переменные


        System.out.println("Введите первую фразу: ");
        x = scan.nextLine();

        System.out.println("Введите вторую фразу: ");
        y = scan.nextLine();

        String x1 = format(x);
        //String x2 = del(x1, '.');

        String y1 = format(y);
        //String y2 = del(y1, '.');

        //if(x1.contains ("+") {
         //   int xx = x1.indexOf();
           // StringBuffer a2 = new StringBuffer(x1);
         //   a2.delete(x1, 1);
         //     System.out.println("a2 = " + a2);


        //    int d = x1.length() - 1;
     //   char[] a1 = {'.', ',', '!', '?', '-'};
     //   for (int i = 0; i < d; i++) {
     //       int c = x1.indexOf(a1[0]);
     //       if (c > 0) {
     //           StringBuffer a2 = new StringBuffer(x1);
      //          a2.delete(c, 1);
      //          System.out.println("a2 = " + a2);
      //  }
//
            //          System.out.println("c = " + c);

            if (x1.toLowerCase().equals(y1)) { //перевожу в нижний регистр и сравниваю строки
                System.out.println("Введенные фразы - анаграммы друг друга!");
            } else {
                System.out.println("Введенные фразы анаграммами друг друга не являются.");
            }
        }
    }



//   Программа должна игнорировать пробелы и знаки препинания.

//  Пример анаграмм:
//  Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
//  Я в мире — сирота. -> Я в Риме — Ариост.