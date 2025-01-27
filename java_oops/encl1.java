package java_oops;

public class encl1 {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.setName("Bharathan.K");
        p.setAge(21);
        p.setDept("CSE");
        p.setSection('A');


        String name = p.getName();
        int age = p.getAge();
        String dept = p.getDept();
        char section = p.getSection();

        System.out.println("Name       :"+(name));
        System.out.println("Age        :"+(age));
        System.out.println("Department :"+(dept));
        System.out.println("Section    :"+(section));

    }
}

class Person{
    private String name;
    private int age;
    private String dept;
    private char section;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public char getSection(){
        return section;
    }
    public void setSection(char section){
        this.section = section;
    }

}
