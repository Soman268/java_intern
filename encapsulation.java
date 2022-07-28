class student{
    private int rollno;
     String name;

    public void setrollno(int r){
        rollno = r;

    }
    public int getrollno(){
        return rollno;
    }
}

public class encapsulation {
 public static void main(String args[]){

    student s = new student();
    s.setrollno(2);
    //s.setname("soman");
    s.name ="soman";
 }    
}
