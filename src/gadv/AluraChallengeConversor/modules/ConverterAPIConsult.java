package gadv.AluraChallengeConversor.modules;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConverterAPIConsult {
    private static final String apiKey = getApiKey();

    private static String getApiKey() {
        try {
            FileReader fileReader = new FileReader("apiKey.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
