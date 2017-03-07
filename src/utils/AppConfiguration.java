/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfiguration {
    
    private final static Properties prop = new Properties();
    
    public static void init() {
        try(InputStream input = new FileInputStream("conf/app.properties")) {
            prop.load(input);
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static boolean getBoolean(String key) {
        String value = prop.getProperty(key);
        return value.equalsIgnoreCase("on");
    }
    
    public static String getString(String key) {
        return prop.getProperty(key);
    }
    
}
