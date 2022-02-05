package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

    public static String fetchProperty(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/main/resources/testProperties");
            properties.load(fis);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (fis != null)
                fis.close();
        }


        return properties.getProperty(key);
    }
}
