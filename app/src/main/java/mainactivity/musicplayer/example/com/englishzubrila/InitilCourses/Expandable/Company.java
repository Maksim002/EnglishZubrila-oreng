package mainactivity.musicplayer.example.com.englishzubrila.InitilCourses.Expandable;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class Company extends ExpandableGroup<Product> {

    public Company(String title, List<Product> items) {
        super(title, items);
    }
}
