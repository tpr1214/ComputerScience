package Semseter2.Workshop.Lesson7;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

import java.io.IOException;

import static Semseter2.Workshop.Lesson7.Type.SEND_MESSAGE;

public class ApiManager2 {
    public static final String ID ="215042102";
    public static String BASE_URL = "https://app.seker.live/fm1/";




     public static String ApiManage(String message, Type type) {
         try {


             OkHttpClient client = new OkHttpClient(); // אחראי על כל מה שקשור לבקשות
             HttpUrl.Builder builder =  HttpUrl.parse(BASE_URL+type.getLabel()).newBuilder();
             builder.addQueryParameter("id",ID);

             if(type.getLabel().equals("send-message")){
                 builder.addQueryParameter("text",message);
             }
             HttpUrl url =builder.build();


             Request request = new Request.Builder().url(url).build(); // בונה request

             Response response = client.newCall(request).execute();

             JSONObject jsonObject = new JSONObject(response.body().string());
             System.out.println(jsonObject);
             return jsonObject.getString("extra");



         } catch (IOException e) {
             throw new RuntimeException(e);

         }

     }
}
