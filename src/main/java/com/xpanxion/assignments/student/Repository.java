package com.xpanxion.assignments.student;

public class Repository implements DataAccess{
    @Override
    public Person getPerson() {
        return new Person("John", "Doe", 1);
    }
}
