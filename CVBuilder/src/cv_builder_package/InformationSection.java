package cv_builder_package;

public class InformationSection extends Section {
    private String name;
    private String title;
    private String phone;
    private String email;
    private String address;
    private static InformationSection instence=null;

    private InformationSection(){};
    public static InformationSection getInstence(){
        if(instence==null){
            instence=new InformationSection();
        }
        return instence;
    }

    @Override
    public String toString() {
        return name+'\n'+title+'\n'
                +phone+'\t'+email+'\t'+address;
    }



    //setters and getters
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
   public void setPhone(String phone) {
       this.phone = phone;
   }
   public String getPhone() {
       return phone;
   }
   public void setTitle(String title) {
       this.title = title;
   }
   public String getTitle() {
       return title;
   }
   


}
