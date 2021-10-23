package com_pb.tkachenkoPyvovarova.hw4;

import java.util.Scanner;

public class CapitalLetter {

    //метод: меняю первую букву слова на большую
    static String Change(String k) {
        String result1 = k.substring(0, 1);
        String result2 = result1.toUpperCase();
        String result3 = k.substring(1);
        return result2 + result3;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String xxx; //вводимые пользователем переменные

        System.out.println("Введите предложение: ");
        xxx = scan.nextLine(); //ввод предложения, scan.next работает только с отд словами
        // System.out.println(xxx);

        String[] sl1 = xxx.split(" "); //создаю новый массив sl со словами из предложения
        for (String sl : sl1) {
            String b = Change(sl); //меняю слово
            System.out.print(b + " "); // Итог: вывожу обновленное предложение
            }
    }
}

  //  Пример работы:
  //  Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
  //  Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
