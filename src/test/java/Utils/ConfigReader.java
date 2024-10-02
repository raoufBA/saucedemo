package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties prop = new Properties();

    public ConfigReader() {
    }

    public Properties configurationManager() {
        this.prop = new Properties();
        File profile = new File("src/test/resources/Config/ConfigFile.properties");
        try {
            FileInputStream inputStream = new FileInputStream(profile);
            this.prop.load(inputStream);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return this.prop;
    }

    public String getUserName() {
        String userName = this.prop.getProperty("userName");

        return userName;
    }

    public String getPassword() {
        String password = this.prop.getProperty("password");

        return password;
    }

    public String getUrl() {
        String url = this.prop.getProperty("Url");

        return url;
    }
}
