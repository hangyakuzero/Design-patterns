public class House{
  private String foundation;
  private String roof;
  private String window;
  private string structure;

  public void setFoundation(String foundation){
    this.foundation = foundation;
  }
  public void setroof(String roof){
    this.roof = roof;

  }

  public void setstructure(String structure){
    this.structure = structure;

  }

  public void setwindow(){
    this.window = window;
  }

  public String toString(){
    public String r = "House{" + "foundation =" + foundation + "structure =" + structure + "roof" + roof + "windows =" + windows;
    return r;
  }
}
public interface HouseBuilder{
  void buildfoundation();
  void buildstructure();
  void buildwindow();
  void buildroof();
  House gethouse();

}
public interface WoodenHouseBuilder implements HouseBuilder{
  House house;
  public void buildfoundation(){
    house.setFoundation("Wooden foundation");
  }
  public void buildstructure(){
    house.setstructure("Wooden frame");
  }
  public void buildwindow(){
  
    house.setwindow("Wooden window");
  }
  public void buildroof(){
    house.setroof("Wooden Shingles")
  }
  public House gethouse(){
    return this.house;
  }

}

public interface BrickHouseBuilder implements HouseBuilder{
  House house;
  public void buildfoundation(){
    house.setFoundation("Brick foundation");
  }
  public void buildstructure(){
    house.setstructure("Brick frame");
  }
  public void buildwindow(){
  
    house.setwindow("Brick window");
  }
  public void buildroof(){
    house.setroof("Brick Shingles")
  }
  public House gethouse(){
    return this.house;
  }
}
public class HouseDirector{
  private HouseBuilder housebuilder;
  public HouseDirector(HouseBuilder housebuilder){
    this.housebuilder = housebuilder;
  }
  public void constructHouse(){
housebuilder.buildfoundation();
    housebuilder.buildstructure();
    housebuilder.buildwindow();
    housebuilder.buildroof();
  }
  public House gethouse(){
    housebuilder.gethouse();
  }
}
public class Demo{

public static void main(String [] args){
  HouseBuilder wood = new WoodenHouseBuilder();
  HouseDirector wb = new HouseDirector(wood);
    wb.constructHouse();
    House woodhouse = wb.gethouse();
    System.out.println("Wood House"+ woodhouse);
   HouseBuilder brick = new BrickHouseBuilder();
    HouseDirector bb = new HouseDirector(brick);
    bb.constructHouse();
    House brickhouse = bb.gethouse();
    System.out.println("Brick house "+ brickhouse);
  }


}
