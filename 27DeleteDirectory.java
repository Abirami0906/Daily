import java.io.File;

class Main {
  public static void main(String[] args) {

    try {
      File directory = new File("Directory");
      boolean result = directory.delete();

      if(result) {
        System.out.println("Directory Deleted");
      }
      else {
        System.out.println("Directory not Found");
      }

    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
