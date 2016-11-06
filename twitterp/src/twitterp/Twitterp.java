/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterp;

import java.util.Arrays;
import java.util.List;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;
/**
 *
 * @author a0292299
 */
public class Twitterp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
       ConfigurationBuilder cf = new ConfigurationBuilder();
       cf.setDaemonEnabled(true)
               .setOAuthConsumerKey("727baYM6jAjf4hCypE8OYnCE5")
               .setOAuthConsumerSecret("WBr4g9FUpdUCBy2ceg4oqZRF7yM8d7QlsmrSUzdadjPW8YWA0t")
               .setOAuthAccessToken("2321163043-hYfg2xMnmBqhwMNcz9EtCVQ7p8OP0mvg7GFT1aY")
               .setOAuthAccessTokenSecret("r47E7PlpbsUXaExNYU4Eb8LlPT5wjGscQfcbPLJZDUMXv");
               
       TwitterFactory tf = new TwitterFactory(cf.build());
       twitter4j.Twitter twitter= tf.getInstance();
  
       // The factory instance is re-useable and thread safe.
 
    Query query = new Query("love");
    QueryResult result = twitter.search(query);
    
    for (Status statusk : result.getTweets()) {
       
       if(statusk.getLang().contains("en")){
        System.out.println("@" + statusk.getUser().getScreenName()+"............." 
                +statusk.getUser().getName()+".............."
                +statusk.getUser().getDescription()+".........."
                +result.getTweets());
        
//        System.out.println(statusk.getUser().getLocation());
//        System.out.println(statusk.getUser().getTimeZone());
//        System.out.println(statusk.getGeoLocation());
//        System.out.println(statusk.getPlace());
//        System.out.println(Arrays.toString(statusk.getWithheldInCountries()));
//        System.out.println(statusk.getUser().isGeoEnabled());
        
       }
        }
    }
    
}
