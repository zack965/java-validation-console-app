package Validation.Types;

import java.util.ArrayList;

public class AppValidationObject {
    public boolean status;
    public String values;
    public ArrayList<String> errors ;

    public AppValidationObject(boolean status, String values, ArrayList<String> errors) {
        this.status = status;
        this.values = values;
        this.errors = errors;
    }
}
