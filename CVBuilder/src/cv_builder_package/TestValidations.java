package cv_builder_package;

public class TestValidations {

    public static void isNumbersTest(){
        if(Validation.isNumber("456123")&& !Validation.isNumber("ABC123"))
            System.out.println("isNumber Validation Success");
        else System.out.println("isNumber Validation Failed");
    }
    public static void isEmailTest(){
        if(Validation.isEmail("eman.elokisy@gmail.com")&&!Validation.isEmail("eman.elokisygmail.com")) 
            System.out.println("isEmail Validation Success");
        else System.out.println("is Email Validation failed");
    }
        
    public static void isYearTest(){
        if(Validation.isYear("2018")&& !Validation.isYear("2025")) 
            System.out.println("isYear Validation Success");
        else System.out.println("isYear Validation failed");
    }

    public static void isMonthTest(){
        if(Validation.isMonth("june")&& !Validation.isMonth("jjune")) 
            System.out.println("isMonth Validation Success");
        else System.out.println("isMonth Validation failed");
        
    }
    public static void isPresentTest(){
        if(Validation.isPresentDate("present")&&!Validation.isPresentDate("pereseent")) 
            System.out.println("isPresentDate Validation Success");
        else System.out.println("isPresentDate Validation failed");
    }
    public static void isULSDDStringTest(){
        if(Validation.isULSDDString("eman . -  mohammednumber")&& !Validation.isULSDDString("eman, 12 ")) 
        System.out.println("isULSDDString validation success, String Acceptes Uper, Lower, Daches and Dots");
        else System.out.println("Validation failed to Acceptes Uper, Lower, Daches and Dots String");
        
    }
    public static void isULSDDAStringTest(){
        if(Validation.isULSDDAString("eman's jeep-car.")) 
            System.out.println("isULSDDAStringTest validation success, String Acceptes Uper, Lower, Daches, Dots, and Apostrophe");
        else System.out.println("Validation failed to Acceptes Uper, Lower, Daches, Dots, and Apostrophe String");
    }

    public static void runValidationTest() {
        isNumbersTest();
        isEmailTest();
        isYearTest();
        isMonthTest();
        isPresentTest();
        isULSDDStringTest();
        isULSDDAStringTest();
    }
}
