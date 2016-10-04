/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi01;

import java.io.File;

/**
 *
 * @author uutarou
 */
public class Ex11 {
    public static void main(String[] args) {
        File sample = new File("SampleText.txt");
        System.out.println("絶対パス：" + sample.getAbsolutePath());
        System.out.println("ファイル名：" + sample.getName());
        System.out.println("サイズ：" + sample.length() + "byte");
        
        File sample2 = new File("C:\\Program Files");
        System.out.println("絶対パス：" + sample2.getAbsolutePath());
        System.out.println("ファイル名：" + sample2.getName());
        System.out.println("サイズ：" + sample2.length() + "byte");

    }
    
}
