package JavaDemo;
import com.android.volley.Cache;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class JavaDemo{
    static String jokeContainer;

    public static void main(String[] args){
        String url = "https://api.chucknorris.io/jokes/random";
        StringRequest request = new StringRequest(Request.Method.GET, url,
                        response -> {
                            JSONObject responseJson;
                            try{
                                responseJson = new JSONObject(response);
                                jokeContainer=responseJson.getString("value");
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }, error -> {
                });
        Cache cache = new Cache();
        RequestQueue queue = Volley.newRequestQueue(nn, arg1, arg2)
    }
}