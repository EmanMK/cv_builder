package cv_builder_package;

public class EducationSection extends Section{

    private String shool;
    private String degree;
    private String fieldOfStudy;
    private String fromYear;
    private String toYear;
    


    @Override
    public String toString() {
        return shool+'\t'+fromYear+" to "+toYear+'\n'+degree+", "+fieldOfStudy;      
    }


    //setters and getters
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getDegree() {
        return degree;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }
    public String getFromYear() {
        return fromYear;
    }
    public void setShool(String shool) {
        this.shool = shool;
    }
    public String getShool() {
        return shool;
    }
    public void setToYear(String toYear) {
        this.toYear = toYear;
    }
    public String getToYear() {
        return toYear;
    }

    
}
