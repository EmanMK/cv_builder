package cv_builder_package;

import java.util.HashMap;
import java.util.Map;

public class ExperienceSection extends Section {

    private final String BULLET_POINT="bullet";
    private final String NORMAL_POINT="normal";

    private String title;
    private String company;
    private String fromDate;
    private String toDate;
    private Map<String,String> paragraphs=new HashMap<String,String>();
    
    
    public String getParagraphsString(){
        StringBuilder desc=new StringBuilder();
        for (Map.Entry<String,String> descriptioEntry: paragraphs.entrySet()){
            if (descriptioEntry.getKey().equals(BULLET_POINT))
                desc.append("- "+descriptioEntry.getValue()+'\n');
            else if (descriptioEntry.getKey().equals(NORMAL_POINT)){
                desc.append(descriptioEntry.getValue()+'\n');
            }
        }
        return desc.toString();
    }

    @Override
    public String toString() {
       return title+" at "+company+'\t'+fromDate+ " to "+toDate+'\n'
       +getParagraphsString();
    }

    //setters and getters
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
    public void setParagraphs(Map<String, String> paragraphs) {
        this.paragraphs = paragraphs;
    }
    public Map<String, String> getParagraphs() {
        return paragraphs;
    }
    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }
    public String getFromDate() {
        return fromDate;
    }
    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
    public String getToDate() {
        return toDate;
    }
    public String getBULLET_POINT() {
        return BULLET_POINT;
    }
    public String getNORMAL_POINT() {
        return NORMAL_POINT;
    }


}
