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
    int n = Integer.parseInt(sc.nextLine());

    String res = "";
    int res_c = 0;

    for(int i=0; i<n; i++){
      boolean[] bb = new boolean[26];
      String s = sc.nextLine();
      for(char c : s.replaceAll(" ", "").toCharArray()){
        bb[c-'A'] = true;
      }

      int c = 0;
      for(boolean b : bb){
        if(b) c++;
      }

      if(c > res_c){
        res = s;
        res_c = c;
      } else if(c == res_c){
        int current_char = 0;
        while(res.charAt(current_char) == s.charAt(current_char)){
          current_char++;
        }

        if((s.charAt(current_char)-'A') < res.charAt(current_char)-'A'){
          res = s;
        }
      }

    }

    System.out.println(res);
  }
}
