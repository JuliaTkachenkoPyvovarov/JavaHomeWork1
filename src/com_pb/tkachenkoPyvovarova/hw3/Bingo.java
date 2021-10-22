package com_pb.tkachenkoPyvovarova.hw3;

import java.util.Random;
import java.util.Scanner;

    public class Bingo {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random random = new Random();

            int x = random.nextInt(101); //задаем границы чисел
            int ttt; // введенное число
            int count = 1; // считаем попытки

            //System.out.println("для тестрования, вводимое число: " + x);

            System.out.println("Угадай, какое число от 0 до 100 загадал робот.");
            System.out.println("Если передумаешь играть введи -1 ");
            System.out.println("Твой вариант: ");
            ttt = scan.nextInt();

            while (ttt != x) {
                count++;
                if (ttt == -1) {
                    System.out.println("Жаль, что ты передумал играть :( ");
                    break;
                }

                if (ttt > x) {
                    System.out.println("Число больше, чем загадал робот. Попробуй еще раз:");
                } else {
                    System.out.println("Число меньше, чем загадал робот. Попробуй еще раз:");
                }
                ttt = scan.nextInt();

                if (ttt != x) {
                    continue;
                }

                System.out.println("Молодец! Число угадано с " + count + " попыток.");

            }
            System.out.println("Игра закончена!");
        }
}
