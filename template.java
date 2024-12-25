public abstract class DocumentProcessor{
  public void final processdocument(){
    opendocument();
    parsedocument();
    savedocument();
    closedocument();
  }
  protected abstract void opendocument();
  protected abstract void parsedocument();
  protected abstract void savedocument();
  protected abstract void closedocument();
}
public class pdfproc extends DocumentProcessor{
  protected void opendocument(){
    System.out.println("openind pdf document");
  }
  protected void parsedocument(){
    System.out.println("parsing pdf document");
  }

  protected void savedocument(){
    System.out.println("saving pdf document");
  }
  protected void closedocument(){
    System.out.println("closing pdf document");
  }
}

public class wordproc extends DocumentProcessor{
  protected void opendocument(){
    System.out.println("openind word document");
  }
  protected void parsedocument(){
    System.out.println("parsing word document");
  }

  protected void savedocument(){
    System.out.println("saving word document");
  }
  protected void closedocument(){
    System.out.println("closing word document");
  }
}
public class Demo{
public static void main(String [] args){

    DocumentProcessor pdf = new pdfproc();
    pdf.processdocument();
    DocumentProcessor word = new wordproc();
    word.processdocument();
}
}

