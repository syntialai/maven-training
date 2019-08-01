package henry.jonathan;

public class Main1 {

  public static void main(String[] args) {
    String input = args == null || args.length == 0 ? "A,B,C,D,E" : args[0];
    String[] splittedInput = input.split(",");
    System.out.println("\nOutput:");
    for (int i = 0; i < splittedInput.length; i++) {
      System.out.println(splittedInput[i]);
    }
  }

}
