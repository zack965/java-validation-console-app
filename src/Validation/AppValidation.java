package Validation;

import Validation.MethodsValidation.ValidationRoles;
import Validation.Types.AppValidationObject;
import Validation.Types.DataMainShape;

import java.util.ArrayList;

public class AppValidation {
    //String Value, ArrayList<String> roles
    public static ArrayList<DataMainShape> data = new ArrayList<>();
    public static void GenerateAndAddDataMainShape(String Value , String[] roles){
        DataMainShape dataMainShape = new DataMainShape(Value,roles);
        data.add(dataMainShape);
    }
    public static ArrayList<AppValidationObject> RunValidation(){
        ArrayList<AppValidationObject> arr = new ArrayList<>();
        for (DataMainShape shape  : data){
            for(String role : shape.roles){
                if(role.equals("Required")){
                    if(ValidationRoles.Required(shape.Value)){
                        ArrayList<String> errors = new ArrayList<>();
                        AppValidationObject appValidationObject = new AppValidationObject(true,shape.Value,errors);
                        arr.add( appValidationObject);
                    }else{
                        ArrayList<String> errors = new ArrayList<>();
                        errors.add("this value is required");
                        AppValidationObject appValidationObject = new AppValidationObject(false,shape.Value,errors);
                        arr.add( appValidationObject);
                    }
                }
            }
        }

        for (AppValidationObject obj : arr){
            System.out.println(obj.status);
            System.out.println(obj.errors);
        }
        return arr;
    }

}
