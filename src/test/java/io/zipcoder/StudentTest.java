package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    // constructor test
    @Test
    public void nullaryConstructorTest() {
        //given
        String firstName = null;
        String lastName = null;
        String examScores = "Exam Scores :\n";
        //when
        Student student1 = new Student();

        //then
        Assert.assertEquals(firstName, student1.getFirstName());
        Assert.assertEquals(lastName, student1.getLastName());
        Assert.assertEquals(examScores, student1.getExamScores());
    }

    @Test
    public void constructorTest(){
        //given
        String firstName = "Leon";
        String lastName = "Musk";
        String examScores = "Exam Scores :\n";
        //when
        Student student1 = new Student(firstName, lastName, new Double[0]);

        //then
        Assert.assertEquals(firstName, student1.getFirstName());
        Assert.assertEquals(lastName, student1.getLastName());
        Assert.assertEquals(examScores, student1.getExamScores());
    }
}