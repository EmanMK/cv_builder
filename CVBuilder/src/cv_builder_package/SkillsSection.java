package cv_builder_package;

import java.util.ArrayList;
import java.util.List;

public class SkillsSection extends Section {
    
    private String skillTypeName;
    private List<String> skills=new ArrayList<String>();
    
    private String getSkillsLString(){
        StringBuilder str=new StringBuilder();
        int index=0;
        for(String skill: skills){
            str.append(skill);
            if(index<skills.size()-1)
                str.append(",");
            index++;
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return skillTypeName+": "+getSkillsLString();
        
    }
    

    //setters and getters
    public void setSkillTypeName(String skillTypeName) {
        this.skillTypeName = skillTypeName;
    }
    public String getSkillTypeName() {
        return skillTypeName;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public List<String> getSkills() {
        return skills;
    }


    
}
