/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author uutarou
 */
public class FileTest {

    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader(new File("SampleText.txt")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
    }
}
