package com_pb.tkachenkoPyvovarova.hw4;

import java.util.Scanner;
import java.util.Arrays;
// не разобралась c регулярками  :(
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class Anagram {

    static String format(String a) {
        char[] c = a.toCharArray();   // преобразовіваю в массив символов char[] result = str.toCharArray();
        //System.out.println(c);
        Arrays.sort(c);          // сортирую по возрастанию Arrays.sort(array)
        //System.out.println(c);
        String b = new String(c);  // меняю снова на строку
        b = b.trim(); // удаляю пробелі
        System.out.println("format " + b);
        return b;
    }

    static String del (String a) {
        //String pattern = "[^A-Za-zА-Яа-я]";
        //Pattern p = Pattern.compile(pattern);
        //Matcher m = p.matcher(a);
        //while(m.find()) {
            String f = a.toLowerCase().replace(".", " "); // нахожу знак, заменяю на пробел
            String f1 = f.toLowerCase().replace(",", " ");
            String f2 = f1.toLowerCase().replace("?", " ");
            String f3 = f2.toLowerCase().replace("!", " ");
            String f4 = f3.toLowerCase().replace("-", " ");
            String f5 = f4.toLowerCase().replace("—", " ");
            System.out.println("del = " + f5);
        return f5;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x; //вводимые пользователем переменные
        String y; //вводимые пользователем переменные

        System.out.println("Введите первую фразу: ");
        x = scan.nextLine();

        System.out.println("Введите вторую фразу: ");
        y = scan.nextLine();

        String x1 = del(x);
        String x2 = format(x1);

        String y1 = del(y);
        String y2 = format(y1);

            if (x2.equals(y2)) { //перевожу в нижний регистр и сравниваю строки
                System.out.println(x2.equals(y2));
                System.out.println("Введенные фразы - анаграммы друг друга!");
            } else {
                System.out.println("Введенные фразы анаграммами друг друга не являются.");
            }
        }
    }


//  Пример анаграмм:
//  Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
//  Я в мире — сирота. -> Я в Риме — Ариост.