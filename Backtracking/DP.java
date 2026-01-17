import java.util.*;

public class DP {
    public static void main(String[] args) {

        List<Activity> activities = new ArrayList<>();

        activities.add(new Activity(1, 3, 50));
        activities.add(new Activity(3, 5, 20));
        activities.add(new Activity(0, 6, 100));
        activities.add(new Activity(5, 7, 200));
        activities.add(new Activity(3, 9, 150));
        activities.add(new Activity(5, 9, 80));
        activities.add(new Activity(6, 10, 120));
        activities.add(new Activity(8, 11, 90));
    }
}
