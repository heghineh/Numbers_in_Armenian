package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HashMap<Long, String> numbers = new LinkedHashMap<>();
        numbers.put(0L, "");
        numbers.put(1L, "մեկ");
        numbers.put(2L, "երկու");
        numbers.put(3L, "երեք");
        numbers.put(4L, "չորս");
        numbers.put(5L, "հինգ");
        numbers.put(6L, "վեց");
        numbers.put(7L, "յոթ");
        numbers.put(8L, "ութ");
        numbers.put(9L, "ինը");
        numbers.put(10L, "տաս");

        numbers.put(20L, "քսան");
        numbers.put(30L, "երեսուն");
        numbers.put(40L, "քառասուն");
        numbers.put(50L, "հիսուն");
        numbers.put(60L, "վաթսուն");
        numbers.put(70L, "յոթանասուն");
        numbers.put(80L, "ութսուն");
        numbers.put(90L, "ինսուն");

        numbers.put(100L, "հարյուր");
        numbers.put(1000L, "հազար");
        numbers.put(1000000L, "միլիոն");
        numbers.put(1000000000L, "միլիարդ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:  ");
        Number number = new Number(sc.nextLong());
        long n = number.getNumber();
        if (n == 0) {
            System.out.println("զրո");
        } else {

            int counter = number.counter(n);

            String tiv100 = " հարյուր ";
            String tiv1000 = " հազար ";
            String tiv1000000 = " միլիոն ";
            String tiv1000000000 = " միլիարդ ";

            switch (counter) {
                case 1: {
                    numbers.put(0L, "զրո");
                    System.out.println(numbers.get(number.getNumber()));
                    break;
                }
                case 2: {
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    System.out.println(gumar);
                    break;
                }
                case 3: {
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    System.out.println(numbers.get(number.counter3(n)) + " հարյուր "
                            + gumar);
                    break;
                }
                case 4: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    String haryuravor = tiv1000 + numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    n = n / 1000;
                    if (number.counter1(n) == 1) {
                        numbers.put(1L, "");
                    }
                    System.out.println(numbers.get(number.counter1(n)) + haryuravor);
                    break;
                }
                case 5: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    n = n / 1000;
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    System.out.println(gumar1 + tiv1000 + haryuravor);
                    break;
                }
                case 6: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    n = n / 1000;
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    tiv100 = " հարյուր ";
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    System.out.println(numbers.get(number.counter3(n)) + tiv100 + gumar1 + tiv1000 + haryuravor);
                    break;
                }
                case 7: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    numbers.put(1L, "մեկ");
                    n = n / 1000;
                    if (number.counter1(n) == 0 && number.counter2(n) == 0 && number.counter3(n) == 0) {
                        tiv1000 = "";
                    }
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    tiv100 = " հարյուր ";
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    if ((number.counter3(n)) == 0) {
                        tiv100 = "";
                    }
                    String hazaravor = numbers.get(number.counter3(n)) + tiv100 + gumar1 + tiv1000 + haryuravor;
                    n = n / 1000;
                    numbers.put(1L, "մեկ");
                    System.out.println(numbers.get(number.counter1(n)) + tiv1000000 + hazaravor);
                    break;
                }
                case 8: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    numbers.put(1L, "մեկ");
                    n = n / 1000;
                    if (number.counter1(n) == 0 && number.counter2(n) == 0 && number.counter3(n) == 0) {
                        tiv1000 = "";
                    }
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    tiv100 = " հարյուր ";
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    if ((number.counter3(n)) == 0) {
                        tiv100 = "";
                    }
                    String hazaravor = numbers.get(number.counter3(n)) + tiv100 + gumar1 + tiv1000 + haryuravor;
                    n = n / 1000;
                    numbers.put(1L, "մեկ");
                    String gumar2 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    System.out.println(gumar2 + tiv1000000 + hazaravor);
                    break;
                }
                case 9: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    numbers.put(1L, "մեկ");
                    n = n / 1000;
                    if (number.counter1(n) == 0 && number.counter2(n) == 0 && number.counter3(n) == 0) {
                        tiv1000 = "";
                    }
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    tiv100 = " հարյուր ";
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    if ((number.counter3(n)) == 0) {
                        tiv100 = "";
                    }

                    String hazaravor = numbers.get(number.counter3(n)) + tiv100 + gumar1 + tiv1000 + haryuravor;
                    n = n / 1000;
                    numbers.put(1L, "մեկ");
                    String gumar2 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    tiv100 = " հարյուր ";
                    System.out.println(numbers.get(number.counter3(n)) + tiv100 + gumar2 + tiv1000000 + hazaravor);
                    break;
                }
                case 10: {
                    if (number.counter3(n) == 0) {
                        tiv100 = "";
                    }
                    String gumar = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    String haryuravor = numbers.get(number.counter3(n)) + tiv100
                            + gumar;
                    numbers.put(1L, "մեկ");
                    n = n / 1000;
                    if (number.counter1(n) == 0 && number.counter2(n) == 0 && number.counter3(n) == 0) {
                        tiv1000 = "";
                    }
                    String gumar1 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    tiv100 = " հարյուր ";
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    if ((number.counter3(n)) == 0) {
                        tiv100 = "";
                    }

                    String hazaravor = numbers.get(number.counter3(n)) + tiv100 + gumar1 + tiv1000 + haryuravor;
                    n = n / 1000;
                    numbers.put(1L, "մեկ");
                    if (number.counter1(n) == 0 && number.counter2(n) == 0 && number.counter3(n) == 0) {
                        tiv1000000 = "";
                    }
                    String gumar2 = number.hrashq(numbers.get(number.counter1(n)), numbers.get(number.counter2(n)), counter, n);
                    if (number.counter3(n) == 1) {
                        numbers.put(1L, "");
                    }
                    tiv100 = " հարյուր ";
                    if ((number.counter3(n)) == 0) {
                        tiv100 = "";
                    }
                    String milionavor = numbers.get(number.counter3(n)) + tiv100 + gumar2 + tiv1000000 + hazaravor;
                    n = n / 1000;
                    numbers.put(1L, "մեկ");
                    System.out.println(numbers.get(number.counter1(n)) + tiv1000000000 + milionavor);
                    break;
                }
                default: {
                    System.out.println("You can't input this number.");
                }
            }
        }
    }
}