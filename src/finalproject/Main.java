//package org.undercloud;
package finalproject;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String topic = "Terminator, movie";
        ArrayList<String> tweets = tweetManager.getTweets(topic);
        try{
            NLP.init();
        }
        catch (Exception te) {
            System.out.println("Failed to open tweets: " + te.getMessage());
        }
        for(String tweet : tweets) {
                System.out.println(tweet + " : " + NLP.findSentiment(tweet));
        }
    }
}
