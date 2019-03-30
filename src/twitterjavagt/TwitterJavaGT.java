/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterjavagt;

import java.util.List;
import twitter4j.DirectMessage;
import twitter4j.Query;
import twitter4j.QueryResult;
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
        //EN ESTA RAMA USAREMOS EL CÓDIGO DE "ConfigurationBuilder":
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("hbtRjHYztajam6Tx9siRel0RW")
                .setOAuthConsumerSecret("oe69cb28pOrfjWDUBPTwz9dMXXWJt9gvgcYiwpp3rE8r2RoHYD")
                .setOAuthAccessToken("1108644141657935872-fl73frb9YLNjf9zL1zS3ftmxNNoumM")
                .setOAuthAccessTokenSecret("jjdH9r6Xf2sZfI8pZP6dTR1OQ2HTGQfdAx5kWCZWYDDQJ");
        ////////////////////////////////////////////////////////////////////////
        // The factory instance is re-useable and thread safe. !!!!
        //No vamos a poder tener más de un objeto twitter: se usa un
        //factory para crear un objeto acceder con él indirectamente a una clase que creará
        //y nos devolverá un objeto singleton (que hemos llamado "twitter" y es de
        //tipo twitter)
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

//// POST TWEET
//        //creamos una variable String con el tweet que queremos publicar
//        String latestStatus = "Hola qué tal, mu buena tarde a todo";
//        //creamos variable tipo "Status" y le asociamos nuestro tweet de la siguiente manera:
//        Status status = twitter.updateStatus(latestStatus);
//        //mostramos por pantalla un mensaje en caso de que el tweet se haya publicado
//        //correctamente (si no saldrá una excepción)
//        System.out.println("Successfully updated the status to [" + status.getText() + "].");
////////////////////////////////////////////////////////////////////////////////////////////////
//GET USER'S TIMELINE
        //UNA VEZ CREADO NUESTRO SINGLETON "Twitter", CREAMOS UN ARRAYLIST
        //DONDE SE ALMACENARÁN LOS DATOS DE NUESTRA TIMELINE USANDO NUESTRO SINGLETON
//        List<Status> statuses = twitter.getHomeTimeline();
//        //MOSTRAMOS LA TIMELINE RECORRIENDO EL ARRAYLIST COMO SIEMRPE Y ACCEDIENDO
//        //A SUS DATOS, TODO CON UN FOREACH(SE PODRÍA RECORRER DE OTRAS MANERAS)
//        System.out.println("Showing home timeline.");
//        for (Status status : statuses) {
//            System.out.println(status.getUser().getName() + ":"
//                    + status.getText());
//        }
//////////////////////////////////////////////////////////////////////////////////////
//SEARCH FOR TWEETS: (ANY)
//        //CREAMOS UNA VARIABLE "Query" A LA QUE ASOCIAREMOS UN OBJETO "Query"
//        //CON EL STRING QUE QUEREMOS BUSCAR EN TWITTER
//        Query query = new Query("Mi primer tweet con twitter4j");
//        //CREAMOS UNA VARIABLE "QueryResult" A LA QUE ASOCIAREMOS LOS RESULTÁDOS DE LA BÚSQUEDA:
//        QueryResult result = twitter.search(query);
//        //RECORREMOS LOS RESULTADOS DE LA VARIABLE "QueryResult" Y LOS ENSEÑAMOS COMO SI 
//        //FUERA UN ARRAYLIST
//        for (Status status : result.getTweets()) {
//            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
//        }
///////////////////////////////////////////////////////////////////////////////////////
//SEND/RECIEVE DIRECT MESSAGES:
        //USAMOS NUESTRO SINGLETON "TWITTER" COMO "sender"
    }

}
