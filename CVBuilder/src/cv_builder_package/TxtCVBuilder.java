package cv_builder_package;


public class TxtCVBuilder extends CVBuilder {

    private CV cv;
    

    public TxtCVBuilder(){
        this.cv=new CV();
    }


    @Override
    public void addSection(Section section) {
       cv.addSection(section);
    }


    @Override
    public void saveCV(String path) {
        TxtCVPrinter.printCV(path,cv.toSting());
    }

    
}
