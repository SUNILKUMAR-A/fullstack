abstract class Parents{
   abstract void callme();
  abstract void tellme();
}
class Main extends Parents{
    void callme(){
        System.out.println("Callingg..");
    } 
    void tellme(){
        System.out.println("telling;......");
    }
    public static void main(String args[]){
        Main call= new Main();
        call.callme();
        call.tellme();
    }
}
