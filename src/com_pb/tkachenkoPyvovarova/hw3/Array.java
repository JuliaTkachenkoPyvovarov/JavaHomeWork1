package com_pb.tkachenkoPyvovarova.hw3;



import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[10]; // обьявляем массив из 10 єлементов
        int x = array.length; // обозначаем х длину массива
        int e;
        int sum; // обозначаем сумму
        int count = 0; //обозначаем кол-во + єлементов

        // Заполнение массива пользователем.
        for (int i = 0; i < x; i++) {
            System.out.println("Введите " + (i+1) + " элемент массива и нажмите ENTER");
            e = scan.nextInt();
            array[i] = e;
        }

        System.out.println("Массив:" );

        // Вывод на экран значений элементов массива.
        for (int i = 0; i < x; i++) {

            System.out.println(array[i]);
        }

        //Подсчитать сумму всех элементов массива и вывести ее на экран.
        sum = array[0]+array[1]+array[2]+array[3]+array[4]+array[5]+array[6]+array[7]+array[8]+array[9];
        System.out.println("Сумма элементов массива = " + sum);

        //Подсчитать и вывести на экран количество положительных элементов.
        for(int i = 0; i < x; i++) {
            if (array[i] >0) {
                count++;
            }
        }
        System.out.println("Количество положительных элементов массива = " + count);

        //Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
        for(int i = x-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) { //Сравниваем рядом стоящие элементы попарно
                    int por = array[j]; //если стоят неправильно, меняем местами
                    array[j] = array[j + 1];
                    array[j + 1] = por;
                }
            }
        }
        //Вывести на экран отсортированный массив.
        System.out.println("Отсортированный массив: ");

        for (int i = 0; i < x; i++) {
            System.out.println(array[i]);
        }
    }
}
