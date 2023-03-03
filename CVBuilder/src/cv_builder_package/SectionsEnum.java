package cv_builder_package;

public enum SectionsEnum {
    InformationSection(""),
    SummarySection(""),
    ExperienceSection("Work Experience"),
    EducationSection("Education"),
    SkillsSection("Skills");

    public final String label;

    private SectionsEnum(String label) {
        this.label = label;
    }
}

