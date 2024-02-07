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
        this(25);
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
    public void addStudent(Student student){
        int i ;
        for(i = 0; i < students.length; i++){
            if(students[i]==null){
                break;
            }
        }
        if(i<students.length){
            students[i]= student;
        }
    }

}