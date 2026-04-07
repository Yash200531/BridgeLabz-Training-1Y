class Parent{  
void done(){System.out.println("Garduated...");}  
}  
class Child extends Parent{  
void doing(){System.out.println("To be graduated...");}  
}  
public class SingleInheritance{  
public static void main(String args[]){  
Child d=new Child();  
d.done();  
d.doing();  
}}  