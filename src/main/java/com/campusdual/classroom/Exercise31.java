package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args) {

        String ruta = "src/main/resources/lorem.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea = "";
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
