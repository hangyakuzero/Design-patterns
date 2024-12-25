import java.util.List;
public interface Subject{
public void notify();
public void addobserver();
  public void removeobserver();
}
public interface Observer{
public void update();
}
