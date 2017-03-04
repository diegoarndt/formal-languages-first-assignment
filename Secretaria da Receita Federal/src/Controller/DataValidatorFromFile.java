package Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataValidatorFromFile implements IDataValidator {
    
    private Properties prop = new Properties();
    private InputStream input = null;

    public DataValidatorFromFile() {
        try {
            input = new FileInputStream("conf/patterns.properties");
            prop.load(input);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(DataValidatorFromFile.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(DataValidatorFromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean isPhone(String phoneNumber) {
        return phoneNumber.matches(prop.getProperty("pattern.phone"));
    }

    @Override
    public boolean isDate(String date) {
        return date.matches(prop.getProperty("pattern.date"));
    }

    @Override
    public boolean isCodAe(String code) {
        return code.matches(prop.getProperty("pattern.code"));
    }
    
}