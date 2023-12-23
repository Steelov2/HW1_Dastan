package com.prj1;

import java.util.Scanner;

//TODO Задачей было создание классОВ, т.е. несколько классов
public class SimpleBot {
  public static void main(String[] args) {
    /*Тут в рамках создания объекта и вызова методов все хорошо, но есть одно но,
    * если ты создаешь класс то он не должен быть вместе с методом main(далее psvm). Иными словами метод psvm
    * должен находится в public class Main. Причина в нижнем комменте
    * */
    SimpleBot bot = new SimpleBot();
    bot.compareNumbers();
    bot.recognizeText();
  }
  /*Мы прошли access modifiers, то есть если ты создашь объект и метод приватный, то он не должен вызваться.
  * Но, если ты на это метод и метод тот что ниже поставишь private то он все равно вызовется, тк они в одном классе,
  * так не должно быть. В целом класс Main должен содержать методы кроме psvm только в исключительных или
  * демонстративных целях
  * */
  public void compareNumbers() {
    Scanner scanner = new Scanner(System.in);
    /*To look better можно вывести в переменную и проставить вместо харкода
    * private static String ENTER_THE_FIRST_NUMBER="Введите первое число:";
    * но это опционально
    */

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
  //TODO overall хорошо написано, но сделай так, К ПРИМЕРУ создай 2 класса Смартфон и Человек, у человека есть имя, и метод говорить, кушать
  // а в Смартфоне тоже несколько полей, и тоже несколько методов к примеру звонить, инициализируй в конструкторе и просто геттером
  // достань телефон типа makeCall(smartphone1.getPhoneNumber). Если используешь и конструктор и геттер/сеттер получишь 95+
}