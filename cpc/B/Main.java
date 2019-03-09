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
    String s = sc.nextLine();
    int[] nn = new int[26];
    for(char c : s.toCharArray()){
      nn[c-'A']++;
    }
    String res = find(nn);
    System.out.println(res);
  }

  static String find(int[] nn){
    // Setiap angka memiliki satu huruf unik
    // contohnya ZERO dari semua angka, Z adalah huruf unik untuk angka 0
    // TWO memiliki huruf unik W untuk angka 2 dari angka yang lain
    // EIGHT memiliki huruf unik G untuk angka 8
    // dst
    int[] nums = new int[10];
    while(nn['Z' - 'A'] > 0){
      nn['Z' - 'A']--;
      nn['E' - 'A']--;
      nn['R' - 'A']--;
      nn['O' - 'A']--;
      nums[0]++;
    }

    while(nn['W' - 'A'] > 0){
      nn['T' - 'A']--;
      nn['W' - 'A']--;
      nn['O' - 'A']--;
      nums[2]++;
    }

    while(nn['G' - 'A'] > 0){
      nn['E' - 'A']--;
      nn['I' - 'A']--;
      nn['G' - 'A']--;
      nn['H' - 'A']--;
      nn['T' - 'A']--;
      nums[8]++;
    }

    while(nn['X' - 'A'] > 0){
      nn['S' - 'A']--;
      nn['I' - 'A']--;
      nn['X' - 'A']--;
      nums[6]++;
    }

    while(nn['H' - 'A'] > 0){
      nn['T' - 'A']--;
      nn['H' - 'A']--;
      nn['R' - 'A']--;
      nn['E' - 'A']--;
      nn['E' - 'A']--;
      nums[3]++;
    }

    while(nn['R' - 'A'] > 0){
      nn['F' - 'A']--;
      nn['O' - 'A']--;
      nn['U' - 'A']--;
      nn['R' - 'A']--;
      nums[4]++;
    }

    while(nn['F' - 'A'] > 0){
      nn['F' - 'A']--;
      nn['I' - 'A']--;
      nn['V' - 'A']--;
      nn['E' - 'A']--;
      nums[5]++;
    }

    while(nn['V' - 'A'] > 0){
      nn['S' - 'A']--;
      nn['E' - 'A']--;
      nn['V' - 'A']--;
      nn['E' - 'A']--;
      nn['N' - 'A']--;
      nums[7]++;
    }

    while(nn['O' - 'A'] > 0){
      nn['O' - 'A']--;
      nn['N' - 'A']--;
      nn['E' - 'A']--;
      nums[1]++;
    }

    while(nn['N' - 'A'] > 0){
      nn['N' - 'A']--;
      nn['I' - 'A']--;
      nn['N' - 'A']--;
      nn['E' - 'A']--;
      nums[9]++;
    }

    String res = "";
    for(int i=0; i<nums.length; i++){
      while(nums[i]-- > 0){
        res += i;
      }
    }

    return res;
  }
}
