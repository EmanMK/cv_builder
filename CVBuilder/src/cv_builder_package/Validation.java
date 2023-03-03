package cv_builder_package;

import java.time.Month;
import java.util.Calendar;
import java.util.regex.Pattern;

public class Validation {
    
    public static boolean isNumber(String in){
        return Pattern.matches("\\d+", in);
    }
    public static boolean isEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    public static boolean isYear(String in){
        Calendar currentCallender=Calendar.getInstance();
        int year = Integer.parseInt(in);
        if(year>currentCallender.get(1) || year<currentCallender.get(1)-100){
            System.out.println("year should be from "+(currentCallender.get(1)-100)+" to "+ currentCallender.get(1));
            return false;
        } 
        return Pattern.matches("\\d+", in);//accepts only numbers
    }
    public static boolean isMonth(String in) {
        for (Month c : Month.values()){
            if(c.toString().equalsIgnoreCase(in)) return true;
        }
        return false;
    }
    public static boolean isPresentDate(String in){
        return "present".equalsIgnoreCase(in);
    }

    //it allows Upper,Lower,spaces,dashes and dots letters
    public static boolean isULSDDString(String in){
        return Pattern.matches("[a-zA-Z\\s-.]+", in);
    }
    //it allows Upper,Lower,spaces,dashes,dots and Apostrophe letters
    public static boolean isULSDDAString(String in){
        return Pattern.matches("[[a-zA-Z]\\s[-.']]+", in);
    }
    
}
