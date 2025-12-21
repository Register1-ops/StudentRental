package studentrentals;

import java.util.ArrayList;
import java.util.List;

public class Homeowner extends User{

    public Homeowner(int id, String name, String email, String passwordHash){
        super(id, name ,email , passwordHash);
    }

    public String getRole(){
        return "HOMEOWNER";
    }

}