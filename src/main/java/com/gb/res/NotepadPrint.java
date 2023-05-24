package com.gb.res;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * вывод результата математических операций в файл .txt
 */

public class NotepadPrint {


    /**
     * метод записи результата в файл
     * @param answer - записываемый результат 
     */ 
    public static void writeToFile(String answer)  {
        String path  = "d://testFolders//GB.Lesson_1.txt";
        File file = new File(path);
        String txt = "\nРезультат\n";
        

        try (FileOutputStream out = new FileOutputStream(file,true)) { 
            try {
                out.write(txt.getBytes());
                out.write(answer.getBytes());
                out.close();
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
