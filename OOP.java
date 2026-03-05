class pen{
String color;
String type;
 public void printcolor(){
 System.out.println(this.color);
}

}

public class OOP{
public static void main(String args[]){
pen pen1=new pen();
pen1.color="green";
pen1.type="ballpoint";
pen pen2=new pen();
pen2.color="blue";
pen2.type="gel";
pen1.printcolor();
pen2.printcolor();

}
}
