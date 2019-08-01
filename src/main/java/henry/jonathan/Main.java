package henry.jonathan;

import org.springframework.util.StringUtils;

public class Main {

  public static void main(String[] args) {
    String text = "Henry,Jonathan";
    String[] splittedText = StringUtils.split(text, ",");
    System.out.println(splittedText[0]);
    System.out.println(splittedText[1]);
  }
}
