package cv_builder_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExperienceSection extends Section {

    public static final String BULLET_POINT="bullet";
    public static final String NORMAL_POINT="normal";

    private String paraghrapType;

    private String title;
    private String company;
    private String fromDate;
    private String toDate;
    private List<String> paragraphs=new ArrayList<String>();
    
    
    public String getParagraphsString(){
        StringBuilder desc=new StringBuilder();
        for (String descriptioEntry: paragraphs){
            if (paraghrapType.equals(BULLET_POINT))
                desc.append("- "+descriptioEntry+'\n');
            else if (paraghrapType.equals(NORMAL_POINT)){
                desc.append(descriptioEntry+'\n');
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
    public void setParaghrapType(String paraghrapType) {
        this.paraghrapType = paraghrapType;
    }
    public String getParaghrapType() {
        return paraghrapType;
    }
    public void setParagraphs(List<String> paragraphs) {
        this.paragraphs = paragraphs;
    }
    public List<String> getParagraphs() {
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
