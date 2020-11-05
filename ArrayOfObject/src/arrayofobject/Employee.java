package arrayofobject;
public class Employee
{
   String name ;
   int id ;
   int age ;
   public Employee(int id,String name,int age){
        this.id = id;
       this.name = name;
       this.age = age;
   }
   public void setName(String name){
       this.name = name;
   }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
   @Override
    public String toString(){
        return "id_number: "+id+"\nName: "+name+"\nAge:"+age;
    }
}