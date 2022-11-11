package Validation.Types;

import Validation.AppValidation;

import java.util.ArrayList;

public class DataMainShape {
    public String Value;
    public String[] roles;

    public DataMainShape(String value, String[] roles) {
        Value = value;
        this.roles = roles;
    }
}
/*
* {
*   [
*       value : string,
*       roles : []
*   ]
* }
* */