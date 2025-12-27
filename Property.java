package studentrentals;

public class Property{
    private final int id;
    private Homeowner homeowner;
    private String address;
    private String cityOrArea;
    private String description;
    private List<Room> rooms = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();
    private double averageRating 0.0;

    public Property(int id, Homeowner homeowner, String address, String cityOrArea, String description){
        this.id = id;
        this.homeowner = homeowner;
        this.address = address;
        this.description = description;
        this.cityOrArea = cityOrArea;
    }

    public int getId(){
        return id;
    }
    public Homeowner getHomeOwner(){
        return homeowner;
    }
    public String getAddress(){
        return address;
    }
    public String getCityOrArea(){
        return cityOrArea;
    }
    public String getDescription(){
        return description;
    }

    public List<Room> getRooms(){
        return rooms;
    }

    public List<Review> getReviews(){w
        return reviews;
    }
    public double getAverageRating(){
        return averageRating;
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
    public void removeRooms(Room room){
        rooms.remove(room);
    }

    public void addReviews(Review reviews)

}