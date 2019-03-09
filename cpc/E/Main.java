import java.util.*;
public class Main {
  private static Scanner sc;

  // Array 2 dimensi mempunyai delapan arah 
  private static final int dx[] = {1,1,0,-1,-1,-1,0,1};
  private static final int dy[] = {0,1,1,1,0,-1,-1,-1};

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    int T = Integer.parseInt(sc.nextLine());
    for(int TC=1; TC<=T; TC++){
      System.out.print("Kasus #"+TC+": ");
      solve();
    }
  }

  static void solve(){
    String[] in1 = sc.nextLine().split(" ");
    int n = Integer.parseInt(in1[0]);
    int k = Integer.parseInt(in1[1]);

    char[][] grid = new char[n][n];
    for(int i=0; i<n; i++){
      grid[i] = sc.nextLine().toCharArray();
    }

    // debug(grid);
    grid = rotate(grid, n);
    // debug(grid);
    grid = gravity(grid, n);
    // debug(grid);

    boolean owo = false;
    boolean owi = false;

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        if(grid[i][j] != '.'){
          for(int kk=0; kk<8; kk++){
            owo = !owo ? find(j, i, grid, 'O', n, k, kk) : owo;
            owi = !owi ? find(j, i, grid, 'I', n, k, kk) : owi;
          }
        }
      }
    }

    if(owo){
      if(owi){
        System.out.println("Semua Menang");
      } else{
        System.out.println("Owo Menang");
      }
    } else{
      if(owi){
        System.out.println("Owi Menang");
      } else{
        System.out.println("Nurhadi Menang");
      }
    }

  }

  static boolean find(int x, int y, char[][] grid, char pres, int n, int k, int kk){
    int c = 0;
    while(x >= 0 && x<n && y >=0 && y<n && (grid[y][x] == pres)){
      c++;
      x += dx[kk];
      y += dy[kk];
      if(c >= k){
        return true;
      }
    }
    return false;
  }

  static char[][] rotate(char[][] grid, int n){
    char[][] res = new char[n][n];
    int ii=0;
    for(int i=n-1; i>=0; i--){
      int jj=0;
      for(int j=0; j<n; j++){
        res[j][i] = grid[ii][jj];
        jj++;
      }
      ii++;
    }
    return res;
  }

  static char[][] gravity(char[][] grid, int n){
    for(int j=0; j<n; j++){
      int c = n-1;
      for(int i=n-1; i>=0; i--){
        if(grid[i][j] != '.'){
          char temp = grid[i][j];
          grid[i][j] = grid[c][j];
          grid[c][j] = temp;
          c--;
        }
      }
    }
    return grid;
  }

  static void debug(char[][] grid){
    for(char[] c : grid){
      System.out.println(new String(c));
    }
  }
}
