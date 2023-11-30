package com.kanoma;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day07 {
    public static void main(String[] args){
        String day = "07";
        File inputFile = new File("src/main/resources/DAY/"+day+".txt");
        partOne(inputFile);
    }
    
    private static void partOne(File file) {
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNext()){
                String line = reader.nextLine();
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        
    }

    
}
