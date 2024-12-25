public class DVDPlayer{
  public void on(){
    System.out.println("DVD player is on");
  }
  public void off(){
    System.out.println("DVD player is off");
  }
  public void eject(){
    System.out.println("Ejecting DVD player");
  }
  public void play(String movie){
    System.out.println("playing movie:"+movie);
  }
}
public class Projector{
  public void on(){
    System.out.println("Projector is on");
  }
  public void widescreenmode(){
    System.out.println("projector is set to wide screen mode");
  }
  public void off(){
    System.out.println("projector is off");
  }
}
public class Screen{
  public void down(){
    System.out.println("Screen is going down");
  }
  public void up(){
  System.out.println("screen is going up");
  }
}
public class Lights{
  public void on(){
    System.out.println("lights are on");
  }
  public void off(){
    System.out.println("lights are off");
  }
  public void dim(int level){
    System.out.println("lights dimmed to "+ level);
  }
}
public class Amplifier{
  public void on(){
    System.out.println("Amplifier is on");
  }
  public void off(){
    System.out.println("Amplifier is off");
  }
  public void adjust(int level){
    System.out.println("Volume is set to:"+ level);
  }
}
public class HomeTheatre{
  DVDPlayer dvd = new DVDPlayer();
  Projector proj = new Projector();
  Amplifier amp = new Amplifier();
  Screen screen = new Screen();
  Lights light = new Lights();

  public void watchmovie(String movie){
    light.off();
    screen.down();
    proj.on();
    proj.widescreenmode();
    amp.on();
    amp.adjust(10);
    dvd.on();
    dvd.play(movie);

  }
public void endmovie(){
    light.on();
    screen.up();
    proj.off();
    amp.off();
    dvd.off();
    dvd.eject();
  }

}
public class Demo{
  public static void main(String [] args){
    HomeTheatre ht = new HomeTheatre();
    ht.watchmovie("Inception");
    ht.endmovie();
  }
}
