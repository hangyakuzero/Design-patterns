public interface MediaPlayer{
  public void play(String audiotype, String filename);
}

public interface AdvancedMediaPlayer{
  public void playMP4(String Filename);
  public void playVLC(String Filename);
}
public class MP4Player implements AdvancedMediaPlayer{
  public void playMP4(String Filename){
    System.out.println("Playing media from the mp4 file:" + Filename);
  }
  public void playVLC(String Filename){
    //do nothing
  }
}

public class VLCPlayer implements AdvancedMediaPlayer{
  public void playMP4(String Filename){}
  public void playVLC(String Filename){
    System.out.println("Playing media from the VLC file:"+Filename);
  }
}

public class MediaAdapter implements MediaPlayer{
  AdvancedMediaPlayer advplayer;
  public MediaAdapter(String audiotype){
    if(audiotype.equalsIgnoreCase("mp4")){
      advplayer = new MP4Player();

    }
    else if (audiotype.equalsIgnoreCase("vlc")){
      advplayer = new VLCPlayer();
    }
  }

  public void play(String audiotype, String Filename){
   if(audiotype.equalsIgnoreCase("mp4")){
     advplayer.playMP4(Filename);
   }else if(audiotype.equalsIgnoreCase("vlc")){
     advplayer.playVLC(Filename);
   }
  }
}

public class AudioPlayer implements MediaPlayer{
  MediaAdapter mp;
  public void play(String audiotype, String Filename){
    if(audiotype.equalsIgnoreCase("vlc")||audiotype.equalsIgnoreCase("mp4")){
      mp = new MediaAdapter(audiotype);
      mp.play(audiotype, Filename);
    }
    else if(audiotype.equalsIgnoreCase("mp3")){
      System.out.println("playing mp3 file"+Filename);
    }else{
      System.out.println("invalid file type");
    }
  }
}

public class Demo{
  public static void main(String [] args){
    AudioPlayer adp;
    adp = new AudioPlayer();
    adp.play("mp3","song.mp3");
    adp.play("vlc","song.vlc");
    adp.play("mp4","song.mp4");
    adp.play("avi","song.avi");
  }
}
