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
    String[][] grid = new String[n][n];
    for(int i=0; i<n; i++){
      grid[i] = sc.nextLine().split(" ");
    }

    int l = count(0, 0, 1, 1, grid, n);
    int r = count(n-1, 0, -1, 1, grid, n);
    System.out.println(Math.abs(l-r));
  }

  static int count(int x, int y, int dx, int dy, String[][] grid, int n){
    int res = 0;
    while(x >= 0 && x < n && y >= 0 && y < n){
      res += Integer.parseInt(grid[y][x]);
      x+=dx;
      y+=dy;
    }
    return res;
  }
}
