//sportswear
public interface sportswear{
  public void wear();
}
//equipment
public interface equipment{
  public void use();
}
//decathlonfactory
public interface decathlonfactory{
  sportswear createsw();
  equipment createeq();
}
//runningequipment
public class runningequipment implements equipment{
  public void use(){
    System.out.println("using runningequipment");
  }
}
//swimmingequipment
public class swimmingequipment implements equipment{
  public void use(){
    System.out.println("using swimmingequipment");
  }
}
//runningsportswear
public class runningsportswear implements sportswear{
  public void wear(){
    System.out.println("wearing runningsportswear");
  }
}
//swimmingsportswear
public class swimmingsportswear implements sportswear{
  public void wear(){
    System.out.println("wearing swimmingsportswear");
  }
}
//runningfactory, swimmingfactory
public class runningfactory implements decathlonfactory{
  public void createsw(){
    return new runningsportswear();
  }
  public void createeq(){
    return new runningequipment();
  }
}

//swimmingfactory
public class swimmingfactory implements decathlonfactory{
  public void createsw(){
    return new swimmingsportswear();
  }
  public void createeq(){
    return new swimmingequipment();
  }
}
//decathlonstore
public class decathlonstore{
  private sportswear sw;
  private equipment eq;
  public decathlonstore(decathlonfactory factory){
   sw = new factory.createsw();
   eq = new factory.createeq();

  }
  public void prepareprodcuts(){
    sw.wear();
    eq.use();
  }
public static void main(String [] args){
decathlonfactory rf = new runningfactory();
decathlonstore rs = new decathlonstore(rf);
rs.prepareprodcuts();
decathlonfactory sf = new runningfactory();
decathlonstore ss = new decathlonstore(sf);

ss.prepareprodcuts();

}

}

