package cv_builder_package;

public class Director {
    private static CVBuilder cvBuilder;

    public static void construct(){
        cvBuilder=new TxtCVBuilder();
        UI.showMainInterface(cvBuilder);
    }
}
