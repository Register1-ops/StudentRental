package studentrentals;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private final int id;
    private Homeowner homeowner;
    private String address;
    private String cityOrArea;
    private String description;
    private List<Room> rooms = new ArrayList<>();
    private List<Review> reviews = new ArrayList<>();
    private double averageRating = 0.0;

    public Property(int id, Homeowner homeowner, String address,
                    String cityOrArea, String description) {
        this.id = id;
        this.homeowner = homeowner;
        this.address = address;
        this.cityOrArea = cityOrArea;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Homeowner getHomeOwner() {
        return homeowner;
    }

    public String getAddress() {
        return address;
    }

    public String getCityOrArea() {
        return cityOrArea;
    }

    public String getDescription() {
        return description;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void removeRoom(Room room) {
        rooms.remove(room);
    }

    public void addReview(Review review) {
        reviews.add(review);
        recalculateAverageRating();
    }

    private void recalculateAverageRating() {
        if (reviews.isEmpty()) {
            averageRating = 0.0;
            return;
        }
        double sum = 0.0;
        for (Review r : reviews) {
            sum += r.getStars();
        }
        averageRating = sum / reviews.size();
    }
}
