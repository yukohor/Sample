
public class AndSample {

public static void main(String[] args) {
  int score = 50;

  if(score == 100) {
    System.out.println("満点です！ご褒美をあげます！");
} else if (score >= 80 && score <= 90) {
    System.out.println("よくできました！");
} else if(score>=60&&score<=79) {
    System.out.println("合格です！");
    } else {
      System.out.println("赤点です...補講を行ないます");
    }
}
}