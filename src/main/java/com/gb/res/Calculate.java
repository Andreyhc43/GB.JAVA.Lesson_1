package com.gb.res;

/**
 * Класс с основной вычислительной логикой
 */
public class Calculate {
    
    Integer result;

    /**
     * метод сложения двух целых чисел
     * @param firstVal - первое слагаемое
     * @param secondVal - второе слагаемое
     * @return - сумма
     */
    public int addition(int firstVal, int secondVal){
        result = firstVal + secondVal; 
        NotepadPrint.writeToFile(result.toString());
        return result; 
    }

    /**
     * метод вычитания двух целых чисел
     * @param firstVal - уменьшаемое
     * @param secondVal - вычитаемое
     * @return - разность
     */
    public int substraction(int firstVal, int secondVal){
        result = firstVal - secondVal;
        NotepadPrint.writeToFile(result.toString());
        return result;
    }


    /**
     * метод деления двух целых чисел без остатка
     * @param firstVal - делимое 
     * @param secondVal - делитель
     * @return - частное без остатка от деления
     */
    public int division(int firstVal, int secondVal){
        result = firstVal / secondVal;
        NotepadPrint.writeToFile(result.toString());
        return result;
    }

    /**
     * метод умножения двух целых чисел
     * @param firstVal - множимое
     * @param secondVal - множитель 
     * @return  - произведение
     */
    public int multiplication(int firstVal, int secondVal){
        result = firstVal * secondVal;
        NotepadPrint.writeToFile(result.toString());
        return result;
    }
}
