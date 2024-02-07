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

    // getters & setters test
    @Test
    public void setFirstNameTest(){
        //given
        String firstName = "Leon";
        Student student1 = new Student();
        //when
        student1.setFirstName(firstName);
        //then
        Assert.assertEquals(firstName, student1.getFirstName());
    }
    @Test
    public void getLastNameTest(){
        //given
        String firstName = null;
        Student student1 = new Student();
        //when
        String actualFirstName = student1.getFirstName();
        //then
        Assert.assertEquals(firstName, actualFirstName);
    }
    @Test
    public void getExamScoreTest(){
        //given
        String examScores = "Exam Scores :\n";
        Student student1 = new Student();
        //when
        String actualExamScores = student1.getExamScores();
        //then
        Assert.assertEquals(examScores, actualExamScores);
    }

    @Test
    public void getNumberOfExamsTaken(){
        //given
        int numberOfExams = 0;
        Student student1 = new Student();
        //when
        int actualNumberOfExams = student1.getNumberOfExamsTaken();
        //then
        Assert.assertEquals(numberOfExams, actualNumberOfExams);
    }

//    @Test
//    public void addExamScoreTest(){
//        //given
//        Student student1 = new Student("", "", new Double[]{9.01};
//        String testScores = "Exam Scores:\n";
//        //when
//        student1.addExamScore(10.0);
//        //then
//        Assert.assertEquals(testScores, student1.addExamScore());
//    }
}