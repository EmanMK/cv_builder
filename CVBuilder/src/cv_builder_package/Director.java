package cv_builder_package;

public class Director {
    private CVBuilder cvBuilder;

    public void construct(){
        cvBuilder=new TxtCVBuilder();
    }
}
