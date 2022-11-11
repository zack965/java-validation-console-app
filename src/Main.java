import Validation.AppValidation;
import Validation.Types.AppValidationObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World !!!");
        String validation = "khb";
        ArrayList<String> roles = new ArrayList<>();
        roles.add("Required");
        System.out.println();
        //String[] rolles = [""];
        String[] rolles = {"Required"};
        AppValidation.GenerateAndAddDataMainShape(validation,rolles);
        AppValidation.RunValidation();
        // an array list with each role has alue and roles


    }
}

