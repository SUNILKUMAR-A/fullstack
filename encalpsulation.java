class Main{
    public static void main( String args[]){
        Employee call= new Employee();
        call.setName("sunil");
        call.setAge(20);
        call.setSsn(12332);
        System.out.println("NAME   : "+call.getName());
        System.out.println("AGE   : "+call.getAge());
        System.out.println("SSN   : "+call.getSsn());
    }
}
class Employee{
    private int ssn;
    private String name;
    private int age;
    public int getSsn(){
        return ssn;
    }
    public void setSsn(int value){
        ssn=value;
    }
    public String getName(){
        return name;
    }
    public void setName(String value){
        name=value;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int value){
        age=value;
    }
}
