interface brake{
    public void Brake();
}
interface accelerate{
    public void Accelerate();
}
class Car implements brake,accelerate{
    public void Brake(){
        System.out.println("brake");
    } 
    public void Accelerate(){
        System.out.println("Accelerate");
    } 
}
class Main{
    public static void main(String args[]){
        Car call= new Car();
        call.Brake();
        call.Accelerate();
    }
}
