package my_project;

import com.google.gson.Gson;

import java.util.Map;
import java.util.logging.Logger;

public class MakeJsonWithMyName {
    private static final Logger logger = Logger.getLogger(MakeJsonWithMyName.class.getName());

    public void printJson(Map<String, String> data) {
        Gson gson = new Gson();
        String json = gson.toJson(data);
        logger.info(json);
    }
}