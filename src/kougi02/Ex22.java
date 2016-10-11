/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex22 {
    public static void main(String[] args) {
        Tweet tweet = new Tweet();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("tweet2.csv")));
            
            String line;
            while ((line = br.readLine()) != null) {
                String words[] = line.split(",");
                tweet.setNo(Integer.parseInt(words[0]));
                tweet.setTID(words[1]);
                tweet.setName(words[2]);
                tweet.setTweetTime(words[3]);
                tweet.setText(words[4]);
                
                tweet.printTweet();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
