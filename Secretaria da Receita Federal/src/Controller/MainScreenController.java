package Controller;

import javax.swing.JOptionPane;

public class MainScreenController {
    
    private IDataValidator validator = new DataValidatorFromFile();
    
    private String input = null;
    private String output = null;
    
    private byte countDate;
    private byte countPhone;
    private byte countCode;
    private byte countRow;
    private boolean errorFlag;
    private int errorRow;
    private String errorContent;
       
    public void clearFields() {
        input = "";
        output = "";
    }
        
    public String getOutput() {
        return output;
    }
    
    public void setInput(String input) {
        if(input.isEmpty())
            JOptionPane.showMessageDialog(null, "Please enter a value in order to analyse the data.");
        this.input = input;
    }
    
    public void validateInput() {
        String rows[] = input.split("\n");
        
        countDate = 0;
        countCode = 0;
        countPhone = 0;
        countRow = 0;
        errorFlag = false;
        errorRow = 0;
        errorContent = "";
        
        for(String str : rows) {
            countRow++;
            String split[] = str.split("\\s+");
            
            for(String expr : split){
                if(!expr.equals("") && !errorFlag) {
                    if(Character.isDigit(expr.charAt(0))){
                        if(validator.isCodAe(expr)) countCode++;
                        else if(validator.isDate(expr)) countDate++;
                        else{
                            errorFlag = true;
                            errorRow = countRow;
                            errorContent = "data ou código de atividade econômica inválido: "+expr;
                        }
                    }
                    else if(expr.charAt(0) == '(')
                        if(validator.isPhone(expr)) countPhone++;
                        else{
                            errorFlag = true;
                            errorRow = countRow;
                            errorContent = "telefone inválido: "+expr;
                        }
                    else{
                        errorFlag = true;
                        errorRow = countRow;
                        errorContent = "símbolos inválidos: "+expr;
                    }
                }
            }
        }
        generateOutput(errorFlag);
    }
    
    private void generateOutput(boolean errorFlag) {
        if(!this.input.isEmpty()){
            if(errorFlag){
                output = "erro na linha "+errorRow+" - "+errorContent;
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append("dados analisados\n");
                sb.append(String.format("telefones:\t%d\n", countPhone));
                sb.append(String.format("datas:\t%d\n", countDate));
                sb.append(String.format("códigos:\t%d", countCode));

                output = sb.toString();
            }
        }
    }
}