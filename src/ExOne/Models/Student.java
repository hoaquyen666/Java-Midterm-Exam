package ExOne.Models;

public class Student {

    public Student() { }

    public Student(String id, String name, double gpa)
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    private String id;
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }

    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    private double gpa;
    public double getGPA()
    {
        return gpa;
    }
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }

    @Override
    public String toString()
    {
        return "MSV: " + id + " - Tên: " + name + " - GPA: " + gpa;
    }
}
