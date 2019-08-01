package henry.jonathan;

import org.springframework.util.StringUtils;

public class Main2 {

  public static void main(String[] args) {
    String input = args == null || args.length == 0 ? "A,B,C,D,E" : args[0];
    String[] splittedInput = StringUtils.split(input, ",");
    System.out.println("\nOutput:");
    for (int i = 0; i < splittedInput.length; i++) {
      System.out.println(splittedInput[i]);
    }
  }

}
