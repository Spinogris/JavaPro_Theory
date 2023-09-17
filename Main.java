package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {


  public static void main(String[] args) {

//  5.5 Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
    ArrayList<Integer> employees = new ArrayList<>();
    employees.add(10);
    employees.add(134);
    employees.add(16);
    employees.add(105);

    System.out.println(employees);

    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(25);
    list.add(35);
    list.add(45);
    list.add(555);

    System.out.println(list);


    Object letter = new Object();

    System.out.println();

//    Main ent = new Main();
//    int entry = ent.firstEntryWord();
//
//    System.out.println(entry);

  }

  //Уровень сложности 5 из 10:
// 5.1 Найти сумму всех элементов ArrayList<Integer>.
  public int getSum(List<Integer> list) {
    int sum = 0;
    for (Integer integer : list) {
      sum = sum + integer;
    }
    return sum;
  }

//  5.3 Перебрать ArrayList<String> и вывести все элементы на экран.

  public String getLagestString(LinkedList<String> link) {
    String a = "";
    for (String s : link) {
      if (s.length() > a.length()) {
        a = s;
      }
    }
    return a;
  }

  //  5.2 Найти среднее значение элементов LinkedList<Integer>.
  public int getAverageNum(LinkedList<Integer> list) {
    int ave = 0;
    int aveFinal = 0;
    for (Integer i : list) {
      ave += i;
      aveFinal = ave / list.size();
    }
    return aveFinal;
  }

//   5.4 Перебрать LinkedList<String> и найти самую длинную строку.

  public String getInputStringList(ArrayList<String> list) {
    String stringList = "";
    for (String integer : list) stringList += integer;
    return stringList;
  }

//  Уровень сложности 6 из 10:
//  6.1 Перебрать ArrayList<Integer> и найти наименьший элемент.

  public int minimalElem(ArrayList<Integer> integers) {
    int i = 0;
    for (Integer a : integers) if (a < i) i = a;
    return i;
  }

//  6.2 Перебрать LinkedList<Integer> и найти наибольший элемент.

  public int maximalElem(LinkedList<Integer> integers) {
    int i = 0;
    for (Integer a : integers) if (a > i) i = a;
    return i;
  }

//  6.3 Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.

  public int letter(ArrayList<String> strings) {
    ArrayList<String> list = new ArrayList<>();
    list.add("city");
    list.add("since");
    list.add("ball");
    list.add("auto");
    list.add("cat");

    char letter = 'c';
    int count = 0;
    for (String s : list) {
      if (s.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
        count++;
      }
    }
    return count;
  }


//  6.4 Перебрать LinkedList<String> и найти первое вхождение определенной строки.

  public int firstEntryWord(LinkedList<Integer> integers) {


    LinkedList<String> firstEntry = new LinkedList<>();
    firstEntry.add("auto");
    firstEntry.add("coffee");
    firstEntry.add("bike");
    firstEntry.add("Snowboard");
    firstEntry.add("roller");
    firstEntry.add("sky");
    firstEntry.add("apple");
    firstEntry.add("banana");
    firstEntry.add("tee");
    firstEntry.add("motor");
    firstEntry.add("table");

    String search = "sky";
    int entry = 0;
    for (int i = 0; i < firstEntry.size(); i++) {
      String str = firstEntry.get(i);
      if (str.equals(search)) {
        entry = i;
      }
    }
    return entry;
  }

//  6.5 Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.


}
