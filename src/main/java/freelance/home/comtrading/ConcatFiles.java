package freelance.home.comtrading;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import freelance.home.comtrading.domain.item.Item;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.JSONValue;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcatFiles {
    private static final XmlMapper mapper = new XmlMapper();

    public static void main(String[] args) throws IOException {
//        String hotlineFeedJson = Jsoup.connect("http://217.171.147.85:8025/hotline_feed?status=CONFIRMED")
//                .method(Connection.Method.GET)
//                .ignoreContentType(true)
//                .maxBodySize(0)
//                .execute().body();
//
//        Object obj= JSONValue.parse(hotlineFeedJson);
//        JSONArray arr = (JSONArray) obj;
//
//        List<Item> itemListParse = new ArrayList<>();
//
//
//
//        System.out.println(arr);
    }
}
