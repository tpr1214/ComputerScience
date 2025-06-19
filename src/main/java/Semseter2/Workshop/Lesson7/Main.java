package Semseter2.Workshop.Lesson7;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url("https://v2.jokeapi.dev/joke/Any").build();
            Response response = client.newCall(request).execute();
            String res = response.body().string();
            JSONObject jsonObject = new JSONObject(res);
            if (jsonObject.get("type").equals("single")) {
                System.out.println(jsonObject.get("joke"));
            } else {
                System.out.println(jsonObject.get("setup"));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
            System.out.println(jsonObject.get("delivery"));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }

