
import java.util.Map;
import com.google.gson.Gson;
import java.io.IOException;
import skilstak.c;
import java.util.HttpGet;
import java.util.HttpGet;

public class foo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://pokeapi.co/api/v1/pokemon" + args[0]);
        HttpGet req = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse res = client.execute(req);
        HttpEntity ent = res.getEntity();
        Map data = new Gson().fromJson(ent.getContent(), Map.class);
        //System.out.println(data);
        System.out.println(c.rc() + "Speed: " + c.x + data.get("speed"));

    }
}
