package cv_builder_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UI {

    private static Scanner in= new Scanner(System.in);
    private static CVBuilder cvBuilder;

    private static boolean save(){
        System.out.println("Save? [y,n]: ");
        String choice= in.nextLine();

        switch (choice.toLowerCase()) {
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Invalid input! please enter y or n.");
                save();
                break;  
        }
        return false;
    }

    private static void clearConsole(){
        System.out.flush();
    }

    public static void showMainInterface(CVBuilder cvBuilder){
        UI.cvBuilder=cvBuilder;
        System.out.println("\t \t \t \t CV Builder");

        System.out.println("1. Add Information\n2. Add Summary\n3. Add Work Experience\n4. Add Education\n5. Add Skills\n6. Save CV.\n7.Exit.\nChoice?[1-7]: ");        
        
        int choice = Integer.parseInt(in.nextLine());

        while(true){
            switch (choice) {
                case 1:
                    clearConsole();
                    addInformation();
                    break;
                case 2:
                    clearConsole();
                    addSummary();
                    break;
                case 3:
                    clearConsole();
                    addExperience();
                    break;
                case 4:
                    clearConsole();
                    addEducation();
                    break;
                case 5:
                    clearConsole();
                    addSkills();
                    break;
                case 6:
                    clearConsole();
                    saveCV();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid input! please choose number from 1 to 7.");
                    break;
            }
        }

    }
    
    public static void addInformation(){
        System.out.println("\t \t \t \t Add Information");

        Section informatSection=new InformationSection();
        String input;

        System.out.println("1. Enter Name: ");
        input= in.nextLine();
        if(Validation.isULSDDString(input)){
            ((InformationSection) informatSection).setName(input);
        }else{
            System.out.println("Name can have letters, spaces, dashes, and dots only.");
            addInformation();
        }

        System.out.println("2. Enter Title: ");
        input= in.nextLine();
        if(Validation.isULSDDString(input)){
            ((InformationSection) informatSection).setTitle(input);
        }else{
            System.out.println("Title can have letters, spaces, dashes, and dots only.");
            addInformation();
        }

        System.out.println("3. Phone: ");
        input= in.nextLine();
        if(Validation.isNumber(input)){
            ((InformationSection) informatSection).setPhone(input);
        }else{
            System.out.println("phone should consisit of only numbers");
            addInformation();
        }

        System.out.println("4. Email: ");
        input= in.nextLine();
        if(Validation.isEmail(input)){
            ((InformationSection) informatSection).setEmail(input);
        }else{
            System.out.println("email should be in format name@example.com");
            addInformation();
        }
        
        System.out.println("5. Address: ");
        input= in.nextLine();
        ((InformationSection) informatSection).setAddress(input);


        if(save()){
            cvBuilder.addSection(informatSection);
        }
        showMainInterface(cvBuilder);
        
        
    }

    public static void addSummary(){
        System.out.println("\t \t \t \t Add Summary");

        Section summarySection=new SummarySection();
        String input;

        System.out.println("1. Enter paragraph: ");
        input= in.nextLine();
        ((SummarySection) summarySection).setSummary(input);
        
        if(save()){
            cvBuilder.addSection(summarySection);
        }
        showMainInterface(cvBuilder);
    }

    public static void addExperience(){
        
        System.out.println("\t \t \t \t Add Work Experience");

        Section expereinceSection=new ExperienceSection();
        String input;

        System.out.println("1. Title: ");
        input= in.nextLine();
        if(Validation.isULSDDString(input)){
            ((ExperienceSection) expereinceSection).setTitle(input);
        }else{
            System.out.println("Title can have letters, spaces, dashes, and dots only.");
            addExperience();
        }

        System.out.println("2. company: ");
        input= in.nextLine();
        ((ExperienceSection) expereinceSection).setCompany(input);


        System.out.println("3. From Date: ");
        input= in.nextLine();
        String[] dates = input.split(" ");
        if(Validation.isMonth(dates[0]) && Validation.isYear(dates[1])){
            ((ExperienceSection) expereinceSection).setFromDate(input);
        }else{
            System.out.println("Invalid Date! From Date should be:\n in format Month Year e.g January 2021\nIn range of 100 years form now\n");
            addExperience();
        }

        System.out.println("4. To Date: ");
        input= in.nextLine();
        dates = input.split(" ");
        if((Validation.isMonth(dates[0]) && Validation.isYear(dates[1]))|| Validation.isPresentDate(input)){
            ((ExperienceSection) expereinceSection).setToDate(input);
        }else{
            System.out.println("Invalid Date! To Date should be:\n in format Month Year e.g January 2021\nor \"Present\"\nIn range of 100 years form now\n");
            addExperience();
        }

        
        System.out.println("5. Number of paragraphs: ");
        int numberOfParagraphs = Integer.parseInt(in.nextLine());
        List<String> paragraphs=new ArrayList<String>();
        
        for(int i=0; i<numberOfParagraphs; i++){
            System.out.println("Paragraph "+(i+1)+": ");
            input= in.nextLine();
            paragraphs.add(input);
        }
        ((ExperienceSection) expereinceSection).setParagraphs(paragraphs);
        System.out.println("6. Show paragraphs with bullet points");
        input= in.nextLine();
        if(input.equalsIgnoreCase("y")){

            ((ExperienceSection) expereinceSection).setParaghrapType(ExperienceSection.BULLET_POINT);
        }
        else if(input.equalsIgnoreCase("n")){
            ((ExperienceSection) expereinceSection).setParaghrapType(ExperienceSection.NORMAL_POINT);
        }

        if(save()){
            cvBuilder.addSection(expereinceSection);
        }
        showMainInterface(cvBuilder);
    
    }


    public static void addEducation(){

        System.out.println("\t \t \t \t Add Education");

        Section educationSection=new EducationSection();
        String input;

        System.out.println("1. Shoole: ");
        input= in.nextLine();
        if(Validation.isULSDDAString(input)){
            ((EducationSection) educationSection).setShool(input);
        }else{
            System.out.println("Schoole can have letters, spaces, dashes, dots and Apostrophe only.");
            addEducation();
        }

        System.out.println("2. Degree: ");
        input= in.nextLine();
        if(Validation.isULSDDAString(input)){
            ((EducationSection) educationSection).setDegree(input);
        }else{
            System.out.println("Degree can have letters, spaces, dashes, dots and Apostrophe only.");
            addEducation();
        }

        System.out.println("3. From year: ");
        input= in.nextLine();
        if(Validation.isYear(input)){
            ((EducationSection) educationSection).setFromYear(input);
        }else{
            System.out.println("Invalid Year! From Year should be:\n in format Month Year e.g January 2021\nIn range of 100 years form now\n");
            addEducation();
        }

        System.out.println("4. To year: ");
        input= in.nextLine();
        if(Validation.isYear(input)){
            ((EducationSection) educationSection).setToYear(input);
        }else{
            System.out.println("Invalid Year! To Year should be:\n in format Month Year e.g January 2021\nIn range of 100 years form now\n");
            addEducation();
        }

        System.out.println("5. Field Of Study: ");
        input= in.nextLine();
        if(Validation.isULSDDString(input)){
            ((EducationSection) educationSection).setFieldOfStudy(input);
        }else{
            System.out.println("Field of study can have letters, spaces, dashes and dots only.");
            addEducation();
        }

        if(save()){
            cvBuilder.addSection(educationSection);
        }
        showMainInterface(cvBuilder);
    }


    public static void addSkills(){
        String input;
        Section skillsSection=new SkillsSection();
        List<String> skillsList=new ArrayList<String>();

        System.out.println("1. Skill type name: ");
        input= in.nextLine();
        if(Validation.isULSDDString(input)){
            ((SkillsSection) skillsSection).setSkillTypeName(input);
        }else{
            System.out.println("Skill type name can have letters, spaces, dashes and dots only.");
            addSkills();
        }

        System.out.println("2. Skills: ");
        input= in.nextLine();
        String[] skills=input.split(",");
        for(String skill:skills){
            if(Validation.isULSDDString(skill)){
                System.out.println("accepted skill"+skill);
                skillsList.add(skill);
            }else{
                System.out.println(skill);
                System.out.println("Skill can have letters, spaces, dashes and dots only.");
                addSkills();
            }
            
        }
        ((SkillsSection) skillsSection).setSkills(skillsList);

        if(save()){
            cvBuilder.addSection(skillsSection);
        }
        showMainInterface(cvBuilder);
    }
    public static void saveCV(){
        String path;
        System.out.println("1. Path: ");
        path=in.nextLine();

        if(save()){
            // cvBuilder.saveCV(path);
            ((TxtCVBuilder) cvBuilder).saveCV(path);
        }
        showMainInterface(cvBuilder);
        
    }
}
