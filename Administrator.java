package studentrentals;

public class Administrator extends User{

    public Administrator(int id, String name, String email, String passwordHash){
        super(id, name, email, passwordHash);
    }

    @Override
    public String getRole(){
        return "ADMIN";
    }

}