class student{

    int rollNo ;
    String name ;

    Student(int rollNo, String name){
        this.rolNo = mrollNo ;
        this.name = name ;
    }
    

    void display(){
        system.out.println(rollNo + " " + name);
    }
    public static void main(){

        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();
        s2.display();

        
    }
}