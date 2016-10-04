/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author uutarou
 */
public class Ex12 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("test.txt")));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("out.txt")));
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            
            br.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("Faild!");
        }
        
    }
    
}
