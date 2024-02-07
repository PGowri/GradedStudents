package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    //constructor test
    @Test
    public void nullaryConstructorTest(){
        //given
        Student[] expectedStudent = new Student[25];
        //when
        Classroom classroom1 = new Classroom(expectedStudent);
        //then
        Assert.assertEquals(expectedStudent, classroom1.getStudents());
    }

    @Test
    public void constructorTest(){
        //given
        Student[] expectedStudent = new Student[]{new Student()};
        //when
        Classroom classroom1 = new Classroom(expectedStudent);
        //then
        Assert.assertEquals(expectedStudent, classroom1.getStudents());
    }
    //getters & setters

    @Test
    public void getStudentsTest(){
        //given
        Student[] students = new Student[25];
        Classroom classroom = new Classroom();
        //when
        Student[] actualStudents = classroom.getStudents();
        //then
        Assert.assertEquals(students, actualStudents);
    }
}
