package collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    // 1. 数组类型的属性
    private String[] courses;
    // 2. 集合类型的属性
    private List<String> lists;
    // 3. Map类型的属性
    private Map<String,String> maps;
    // 4. Set类型的属性
    private Set<String > sets;
    // 5. 集合中是另外的类
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void test(){
        System.out.println("Courses:" + Arrays.toString(courses));
        System.out.println("List:" + lists);
        System.out.println("Maps:" + maps);
        System.out.println("Sets:" + sets);
        System.out.println("CourseList:" + courseList);
    }
}
