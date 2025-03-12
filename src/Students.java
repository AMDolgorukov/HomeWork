import java.util.HashMap;

public class Students {
    String name;
    int course;
    String group;
    HashMap<String, Integer> score;

    public Students(String name,
                   int course,
                   String group,
                   HashMap<String, Integer> score) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.score = score;
    }
}
