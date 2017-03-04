/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author F0FP372
 */
public class DataValidatorImpl implements IDataValidator {

    @Override
    public boolean isPhone(String phoneNumber) {
        return phoneNumber.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}")
                || phoneNumber.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");
    }

    @Override
    public boolean isDate(String date) {
        return date.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    @Override
    public boolean isCodAe(String code) {
        return code.matches("^\\d{4}-\\d{1}/\\d{2}$");
    }
    
}
