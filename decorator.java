//chocolate coffee lol
public interface Coffee{
  double getcost();
  String getdescription();
}
public class SimpleCoffee implements Coffee{
  public double getcost(){
    return 5.0;
  }
  public String getdescription(){
    return "Simple Coffee";
  }
}

public abstract class CoffeeDecorator implements Coffee{
protected Coffee coffee;
  public CoffeeDecorator(Coffee coffee){
    this.coffee = coffee;
  }
  public double getcost(){
    return coffee.getcost();
  }
  public String getdescription(){
    return coffee.getdescription();
  }
}
public class MilkDecorator extends CoffeeDecorator{
  public MilkDecorator(Coffee coffee){
    super(coffee);
  }
  public double getcost(){
    return coffee.getcost + 1.5;
  }
  public String getdescription(){
    return coffee.getdescription() + ", Milk";
  }
}
public class SugarDecorator extends CoffeeDecorator{
  public SugarDecorator(Coffee coffee){
    super(coffee);
  }
  public double getcost(){
    return coffee.getcost() + 2.0;
  }
  public String getdescription(){
    return coffee.getdescription() + ", Sugar";
  }
}
public class ChocolateDecorator extends CoffeeDecorator{
  public ChocolateDecorator(Coffee coffee){
    super(coffee);
  }
  public double getcost(){
    return coffee.getcost() + 1.5;
  }
  public String getdescription(){
    return coffee.getdescription() + ", Chocolate";
  }
}
public class CoffeeShop{
public static void main(String [] args){
  Coffee mycoffee = new SimpleCoffee();
  System.out.println("cost:$ " + mycoffee.getcost() +","+mycoffee.getdescription());
 // adding Milk
  mycoffee = new MilkDecorator(mycoffee);
  System.out.println("cost:$ " + mycoffee.getcost() +","+mycoffee.getdescription());
mycoffee = new SugarDecorator(mycoffee);
  System.out.println("cost:$ " + mycoffee.getcost() +","+mycoffee.getdescription());
mycoffee = new ChocolateDecorator(mycoffee);
  System.out.println("cost:$ " + mycoffee.getcost() +","+mycoffee.getdescription());
}}
