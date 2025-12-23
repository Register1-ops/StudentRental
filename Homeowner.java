package studentrentals;

import java.util.ArrayList;
import java.util.List;

public class Homeowner extends User{
    private List<Property> properties = new ArrayList<>;

    public Homeowner(int id, String name, String email, String passwordHash){
        super(id, name ,email , passwordHash);
    }

    public List<Property> getProperties(){
        return properties;
    }

    public void addProperty(Property property){
        properties.add(property);
    }
    public void removeProperty(Property property){
        properties.remove(property);
    }

    @Override
    public String getRole(){
        return "HOMEOWNER";
    }

}

// add and remove property , update/view property