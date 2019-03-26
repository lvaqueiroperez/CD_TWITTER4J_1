/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author lvaqueiroperez
 */
public class TwitterJavaGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here

        //PRIMERO VAMOS A USAR LOS "CODE EXAMPLES" JUNTO A LA CONFIGURACIÓN
        //DEL "OAuth credentials" QUE HAY QUE HACER PRIMERO
        //LA HAREMOS A TRAVÉS DE UN FICHERO EN EL CLASSPATH
        //Y A TRAVÉS DE UN CÓDIGO (HACEN LO MISMO)
        //EN ESTA RAMA USAREMOS EL FICHERO "twitter4j.properties"
        //class path en aplicacion-->build--classes
        // The factory instance is re-useable and thread safe.
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("hbtRjHYztajam6Tx9siRel0RW")
                .setOAuthConsumerSecret("oe69cb28pOrfjWDUBPTwz9dMXXWJt9gvgcYiwpp3rE8r2RoHYD")
                .setOAuthAccessToken("1108644141657935872-fl73frb9YLNjf9zL1zS3ftmxNNoumM")
                .setOAuthAccessTokenSecret("jjdH9r6Xf2sZfI8pZP6dTR1OQ2HTGQfdAx5kWCZWYDDQJ");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        String latestStatus = "Mi primer tweet con Twitter4j";

        Status status = twitter.updateStatus(latestStatus);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");

        // POST TWEET
        // The factory instance is re-useable and thread safe.
        //no vamos a poder tener más de un objeto twitter: se usa un
        //factory para acceder indirectamente a una clase que creará
        //y nos devolverá un objeto singleton
    }

}
