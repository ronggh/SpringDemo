package factorybean;

import collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Java");
        return course;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
