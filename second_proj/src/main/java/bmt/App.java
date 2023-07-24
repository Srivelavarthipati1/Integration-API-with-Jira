package bmt;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnirestException 
    {
       // This code sample uses the  'Unirest' library:
// http://unirest.io/java.html
  /*   HttpResponse<JsonNode> response = Unirest.get("https://sripravallika7003.atlassian.net/rest/api/3/project/search")
.basicAuth("sripravallika7003@gmail.com", "ATATT3xFfGF0XdcTVF6ezCrYzfMJzo1hsfmDy9p3IDpWi1GNtMpgmywh3C_ie8PpFfcMO-Rvfenkq4BPxLMDSLmRAnxgJpaeFX1mIUd7VfGQkwnaSNxUeOhguZ9KtaY97lc9WLxjVIsWniCXZCS8FH6sn4Y5PN3MQmI0Sy90wq4QMvJzPVD-h4c=09992C25 ")
.header("Accept", "application/json")
.asJson(); 

System.out.println(response.getBody());
    */
    // This code sample uses the  'Unirest' library:
    
    //to get all issues list fro the user
// http://unirest.io/java.html
HttpResponse<JsonNode> response = Unirest.get("https://sripravallika7003.atlassian.net/rest/api/3/issuetype")
.basicAuth("sripravallika7003@gmail.com", "ATATT3xFfGF0XdcTVF6ezCrYzfMJzo1hsfmDy9p3IDpWi1GNtMpgmywh3C_ie8PpFfcMO-Rvfenkq4BPxLMDSLmRAnxgJpaeFX1mIUd7VfGQkwnaSNxUeOhguZ9KtaY97lc9WLxjVIsWniCXZCS8FH6sn4Y5PN3MQmI0Sy90wq4QMvJzPVD-h4c=09992C25")
.header("Accept", "application/json")
.asJson();

System.out.println(response.getBody());
}
}