/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enshu02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Kadai02_1 {

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data11.csv")));
            String line;
            while ((line = br.readLine()) != null) {
                String splited[] = line.split(",");
                animalList.add(new Animal(Integer.parseInt(splited[0]), splited[1], splited[2], splited[3]));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (Animal animal : animalList) {
            animal.printAnimal();
        }

    }

}
