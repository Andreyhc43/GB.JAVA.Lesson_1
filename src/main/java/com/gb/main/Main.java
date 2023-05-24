package com.gb.main;

import com.gb.res.Calculate;

/**
 * Главный класс
 */
public final class Main {
    private Main() {
    }

    /**
     * Точка входа
     * @param args The arguments of the program.
     */

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculate calc = new Calculate();

        System.out.println(calc.addition(2, 34));
        System.out.println(calc.division(433, 32));
        System.out.println(calc.multiplication(34,22));
        System.out.println(calc.substraction(343, 234));

    }



}
