import java.util.*;
class Main{
    public static void main(String args[]){
 try{
     System.out.println(23/0);
     System.out.println("yes");
 }   
 catch(Exception  e){
     System.out.println("divided by zero");
 }
 finally{
     System.out.println("finnalyy");
 }
}
}
