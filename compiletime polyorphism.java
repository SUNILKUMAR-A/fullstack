//method overloading compileTime polymorphishm //static time polymorphism
class Adder{
 public int add(int a,int b){
     return a+b;
 }
 public long add(long a,long b){
     return a+b;
 }
 public static void main(String args[]){
     Adder call= new Adder();
     System.out.println(call.add(2,3));
     System.out.println(call.add(5l,8l));
 }
}
// // You are using Java
// // Runtime polymorphism
// class Parent{
//     public void display(){
//         System.out.println("parent is displaying");
//     }
// }
// class Child extends Parent{
//     public void display(){
//         System.out.println("child is displaying");
//     }
//     public static void main(String args[]){
//         Parent Pcall=new Parent();
//         Pcall.display();
//         Parent Ccall= new Child();
//         Ccall.display();//child class method Override by parent class metrhod
//     }
// }
