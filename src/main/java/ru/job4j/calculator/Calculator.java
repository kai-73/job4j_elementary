package ru.job4j.calculator;

import static java.lang.System.lineSeparator;

public class Calculator {

    public static void main(String[] args) {
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println("Значения переменных: sixDivTwo = " + sixDivTwo + ";" + lineSeparator() + "                     fiveMinusTwo = " + fiveMinusTwo + ";" + lineSeparator() + "                     fourTimeTwo = " + fourTimeTwo
                + ".");

    }
}
