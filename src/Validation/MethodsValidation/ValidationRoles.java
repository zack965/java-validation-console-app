package Validation.MethodsValidation;

public class ValidationRoles {
    public static boolean Required(String value){
        if(value.equals("")){
            return true;
        }
        return false;
    }
}
