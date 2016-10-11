/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kougi02;

public class Tweet {

    public int tweetNo;
    public String twitterID;
    public String name;
    public String tweetTime;
    public String text;

    public Tweet() {

    }

    public void setNo(int tn) {
        this.tweetNo = tn;
    }

    public void setTID(String tid) {
        this.twitterID = tid;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setTweetTime(String tt) {
        this.tweetTime = tt;
    }
    
    public void setText(String t) {
        this.text = t;
    }
    
    public void printTweet() {
        System.out.println(tweetNo + ":" + twitterID + "(" + name + ")\n" + tweetTime + "\n" + text);
    }
}
