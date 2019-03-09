import java.util.*;
public class Main {
  private static Scanner sc;
  public static void main(String[] args) {
    sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());
    for(int TC=1; TC<=T; TC++){
      System.out.print("Kasus #"+TC+": ");
      solve();
    }
  }

  static void solve(){
    int n = sc.nextInt();
    String old = Integer.toBinaryString(n);
    String s_new = "";
    for(int i=old.length()-1; i>=0; i--){
      s_new += old.charAt(i);
    }

    int res = Integer.parseInt(s_new, 2);
    System.out.println(res);
  }
}
