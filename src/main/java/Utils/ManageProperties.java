package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class ManageProperties {

    public static void loadProperties(String dataFile) throws IOException {
        Properties properties = new Properties();
        String filePath = System.getProperty("user.dir") + "/src/main/resources/" + dataFile;
        System.out.println(filePath);
        File f = new File(filePath);
        FileInputStream input;
        if (f.exists() && !f.isDirectory()) {
            input = new FileInputStream(new File(filePath));
            properties.load(input);
        } else {
            System.out.println("Config File Missing :: " + filePath);
        }

        /*
        filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "base.properties";
        f = new File(filePath);
        if (f.exists() && !f.isDirectory()) {
            input = new FileInputStream(new File(filePath));
            properties.load(input);
        }
        */

        Enumeration e = properties.propertyNames();

        while(e.hasMoreElements()) {
            String key = (String)e.nextElement();
            System.setProperty(key, properties.getProperty(key));
        }

     //   return properties;
    }
}

