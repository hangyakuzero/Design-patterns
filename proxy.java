//interface
public interface dbaccess{
  void requestdata();
}
//databseervice
public class databservice implements dbaccess {
  public void requestdata(){
    System.out.println("fetching data");
  }

}
//dbaccessproxy-two functions and a constructor
public class dbaccessproxy implements dbaccess{
  private databseervice realdbs;
  private String userRole;

  public dbaccessproxy(String userRole){
    this.realdbs = new databseervice();
    this.userRole = userRole;
  }

  public void requestdata(){
    if(isAuthorised()){
     realdbs.requestdata(); 
    }else{
      System.out.println("you are not allowed to access this");
    }
  }
  private boolean isAuthorised(){
    return userRole.equals("ADMIN");

  }
}
//pattern demo - main function

public public class proxy {
  public static void main(String [] args){
//admin userRole
dbaccessproxy admin = new dbaccessproxy("ADMIN");
admin.requestdata();
//guest role
dbaccessproxy guest = new dbaccessproxy("guest");
guest.requestdata();

  }
}
