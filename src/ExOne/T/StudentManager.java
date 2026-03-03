package ExOne.T;

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    List<T> data = new ArrayList<>();

    public StudentManager(){}

    public void add(T item)
    {
        data.add(item);
    }

    public List<T> getAll()
    {
        for(T i : data)
        {
            System.out.println(i.toString());
        }
        return null;
    }
}
