
public class Patter1 {

  public static void main(String[] args) {

    int end = 1;
    int cnt = 1;

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= end; j++) {
        System.out.print(cnt + " ");
        cnt++;

      }
      System.out.println();
      end++;
    }

    System.out.println();
  }
}