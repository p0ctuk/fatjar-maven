package my_project;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> data = new LinkedHashMap<>();
        data.put("name", "Rostyslav");
        data.put("lastName", "Kovalenko");
        MakeJsonWithMyName makeJsonWithMyName = new MakeJsonWithMyName();
        makeJsonWithMyName.printJson(data);
    }
}