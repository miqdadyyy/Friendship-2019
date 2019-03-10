import java.io.PrintStream;

public class Ngopi {

   private static int[] cadang = new int[]{103, 110, 100, 107, 128, 118, 72, 115, 60, 105, 127, 60, 124, 90, 68, 111, 106, 70, 116, 117, 146};

   public static String checkPassword() {
       String res = "";
       for (int i = 0; i < cadang.length; ++i) {
           int[] arrn = cadang;
           int n = i;
           arrn[n] = arrn[n] - (i + 1);
           res += (char)cadang[i];
       }
       return res;
   }

   public static void main(String[] args) {
     System.out.println(checkPassword());
   }
}
