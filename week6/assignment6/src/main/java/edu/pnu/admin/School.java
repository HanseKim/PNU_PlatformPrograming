package edu.pnu.admin;

import edu.pnu.collection.GenericList;

import java.util.Iterator;

public class School {
    private final String name;
    private int size;
    private GenericList<Student> students = new GenericList<Student>();
    public School(final String name, int limit) {
        this.name = name;
        size = limit;
    }
    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }
    public Student findStudent(String studentName, int schoolYear) {
        Student find = new Student(studentName,schoolYear);
        for(int i=0;i<students.getSize();i++){
            if(find.equals(students.get(i))){
                return students.get(i);
            }
        }
        return null;
    }
    public void removeAllStudent() {
        size=0;
        students.clear();
    }

    @Override
    public String toString(){
        String str = "";
        str+=String.format("School Name: %s Student Count: %d\n",name,students.getSize());
        for(int i=0;i<students.getSize();i++){
            str+="\t";
            str+=(students.get(i));
            str+="\n";
        }
        return str;
    }
}
