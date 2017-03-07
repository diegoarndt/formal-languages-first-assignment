package Controller;

public class DataValidatorImpl implements IDataValidator {

    @Override
    public boolean isPhone(String phoneNumber) {
        return phoneNumber.matches("^\\([1-9]{2}\\)[2-9][0-9]{3}\\-[0-9]{4}$");
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