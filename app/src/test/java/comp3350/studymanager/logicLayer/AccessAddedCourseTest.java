package comp3350.studymanager.logicLayer;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import comp3350.studymanager.Object.Course;
import comp3350.studymanager.Persistence.AddedCoursePersistence;

public class AccessAddedCourseTest {
    private AddedCoursePersistence addedCoursePersistence;

    @Before
    public void setUp() {
        addedCoursePersistence = mock(AddedCoursePersistence.class);
    }

    @Test
    public void test1(){
        System.out.println("\nStarting test AddedCoursePersistence");
        final ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course("1010", "Intro Computer Science","Heather Matheson","A01"));
        when(addedCoursePersistence.getAddedCourseList()).thenReturn(courses);
        assertNotNull(courses);

        System.out.println("Finished test AddedCoursePersistence");

    }

}
