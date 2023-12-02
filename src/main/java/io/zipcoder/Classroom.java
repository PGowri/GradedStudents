package io.zipcoder;

public class Classroom {
    private Student[] students;

    public Classroom(Student[] students){
        this.students = students;
    }
    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }
    public Classroom(){
        this(30);
    }

    public Student[] getStudents(){
        return students;
    }
    public double getAverageExamScore() {
        double sum = 0.0;
        for (Student s : students) {
            sum = sum + s.getAverageExamScore();
        }
        return sum / students.length;
    }

}