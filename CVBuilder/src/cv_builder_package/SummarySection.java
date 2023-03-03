package cv_builder_package;

public class SummarySection extends Section {
    private String summary;
    
   
    @Override
    public String toString() {
        return summary;
    }

    //setters and getters
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getSummary() {
        return summary;
    }
    
}
