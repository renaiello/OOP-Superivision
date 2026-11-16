public class StudentRecordA {
    private String name;
    private int age;
    private String college;

    public StudentRecordA(String name, int age, String college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public String getCollege(){return this.college;}

    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("College: "+college);
    }
}
