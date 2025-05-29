package my_project;

import com.google.gson.Gson;

import java.util.LinkedHashMap;

public class MakeJsonWithMyName {
    public void printJson(LinkedHashMap<String, String> data) {
        Gson gson = new Gson();
        String json = gson.toJson(data);
        System.out.println(json);
    }
}