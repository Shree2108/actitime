package GenericComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilityclass {

    public String readpropfile(String key) throws IOException
    {
        FileInputStream fs= new FileInputStream("src\\main\\resources\\Properties\\Pageconstants.properties");
        Properties prop= new Properties();
        prop.load(fs);
        return prop.getProperty(key);

    }

}
