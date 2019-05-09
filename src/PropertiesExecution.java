import net.sourceforge.htmlunit.corejs.javascript.ast.CatchClause;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class PropertiesExecution {
    String URL;
    String path;
    Properties prop = new Properties();
    InputStream input=null;



    @Test(priority = 0)
    public void readURL(){
        try {
            input = new FileInputStream("Configuration.properties");

            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        URL=prop.getProperty("URL");
        path=prop.getProperty("chromeDriverPath");
        System.out.println("Application is " +URL);
        System.out.println("Browser   :" + path);
    }









}
