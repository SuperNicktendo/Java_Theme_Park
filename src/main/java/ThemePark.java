import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;
    private HashMap<String, Integer> allReviews;

    public ThemePark() {
        this.attractionsAndStalls = new ArrayList<>();
        this.allReviews = new HashMap<>();
    }

    public void addAttractionOrStall(IReviewed attractionOrStall){
        this.attractionsAndStalls.add(attractionOrStall);
    }

    public int getAllReviewed() {
        return attractionsAndStalls.size();
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount(attraction.getVisitCount()+1);
        visitor.addAttraction(attraction);
    }

    public void addReview(IReviewed attractionsOrStalls){
        allReviews.put(attractionsOrStalls.getName(), attractionsOrStalls.getRating());
    }

    public int getAllReviews() {
        return allReviews.size();
    }
}
