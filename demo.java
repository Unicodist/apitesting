import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.MalformedURLException;
import org.json.*;

public class APIcalling{
    public static void main(String[] args){
        try{
            URL url = new URL("https://api.chucknorris.io/jokes/random");

            InputStream is = url.openStream();

            int c;
            String data = "";

            while((c = is.read())!=-1){
                data+=(char)c;
            }

            System.out.println(data);

            JSONObject object = new JSONObject(data);

            String joke = object.getString("value");

            System.out.println(joke);
        }
        catch(MalformedURLException mfe){
            mfe.printStackTrace();
        }
        catch(IOException ie) {
            ie.printStackTrace();
        }
    }
}