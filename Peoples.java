
public class Peoples {
    String fname;
    String lname;
    int age;
   public String information(){
       String information=fname+" "+lname+" "+age;
return information;       
    }
    public static void main(String[] args){
        Peoples p1=new Peoples();
        Peoples p2=new Peoples();
        p1.fname="degsew";
        p1.lname="abrham";
        p1.age=20;
        p2.fname="abel";
        p2.lname="adam";
       System.out.println(p1.information());
        
        
    }
    
}