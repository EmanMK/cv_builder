package cv_builder_package;

import java.util.ArrayList;
import java.util.List;

public class CV {
    private List<Section> sections =new ArrayList<Section>();

    private boolean noInformaitonSection(){
        for(Section sectionTemp:sections){
            if(sectionTemp.getClass().getSimpleName().equals(SectionsEnum.valueOf("InformationSection").toString())){
                return false;
            }
        }
        return true;
    }

    public void addSection(Section section){
        if(section != null){
            if(section.getClass().getSimpleName().equals(SectionsEnum.valueOf("InformationSection").toString())){
                if(noInformaitonSection())
                    sections.add(section);
            }
            else if(section != null) sections.add(section);
        }else{
            System.out.println("section is null, adding secion failed!");
        }
    }

    private List<Section> orderSections(List<Section> sections){
        List<Section> tempSections = new ArrayList<Section>();
        for(SectionsEnum sectinoEnum:SectionsEnum.values()){
            for (Section section :sections){
                if(section.getClass().getSimpleName().equals(sectinoEnum.toString())){
                    tempSections.add(section);    
                }
            }
        }
        return tempSections;
    }

    public String toSting(){
        StringBuilder str = new StringBuilder();
        String currentSectionTemp=SectionsEnum.InformationSection.toString();

        sections = orderSections(sections);
        SectionsEnum.valueOf("EducationSection");
        SectionsEnum sectionEnum;
        
        for (Section section :sections){ 
            sectionEnum=SectionsEnum.valueOf(section.getClass().getSimpleName());
            
            if(!currentSectionTemp.equals(sectionEnum.toString())){
                currentSectionTemp=sectionEnum.toString();
                str.append("-------------------------------------------------------------------- \n");
                if(!sectionEnum.label.isBlank()){
                    str.append(sectionEnum.label+'\n');
                }
            }
            str.append(section.toString()+'\n');
        }

        return str.toString();
    }
  
}
