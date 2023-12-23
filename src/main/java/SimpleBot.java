package com.prj1;

import java.util.Scanner;

public class SimpleBot {

  public static void main(String[] args) {
    SimpleBot bot = new SimpleBot();
    bot.compareNumbers();
    bot.recognizeText();
  }

  public void compareNumbers() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите первое число:");
    int num1 = scanner.nextInt();

    System.out.println("Введите второе число:");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " больше чем " + num2);
    } else if (num1 < num2) {
      System.out.println(num1 + " меньше чем " + num2);
    } else {
      System.out.println("Числа равны");
    }
  }

  public void recognizeText() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите текст:");
    String inputText = scanner.nextLine();

    if (inputText.contains("привет") ) {
      System.out.println("Привет!");
    } else if (inputText.contains("как дела")) {
      System.out.println("У меня все отлично, спасибо!");
    } else {
      System.out.println("Не могу распознать ваш текст. Попробуйте еще раз.");
    }
  }
}