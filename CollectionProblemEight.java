import java.util.*;
class Employee implements Comparable<Employee>
{



int age; 

public int getAge() { 

return age; 

} 

public void setAge(int age) { 

this.age = age; 

} 

public Employee(int age) { 

	super();

this.age = age; 

} 

@Override

public String toString() { 

return "Employee [age=" + age + "]"; 

} 
public int compareTo(Employee e)
{
    if (age == e.age )
        return 0;
    else if (age > e.age)
        return 1;
    else
        return -1;
}

} 

public class CollectionProblemEight { 

 

public static void main(String[] args) { 

List<Employee> l = new ArrayList(); 

l.add(new Employee(24)); 

l.add(new Employee(42)); 

l.add(new Employee(33)); 

l.add(new Employee(12)); 
Collections.sort(l);

 

System.out.println(l); 

} 

} 