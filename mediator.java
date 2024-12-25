import java.util.List;
import jaava.util.ArrayList;

public interface chatroom{
  public void sendmessage(String message);
  public void recieve(String message, Participant Sender);
}

public class ConcreteChatRoom implements chatroom{

}

public abstact class Participant{

}

public class UserParticipant extends Participant{}

public class Demo{}
