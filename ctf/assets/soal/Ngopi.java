import java.io.PrintStream;

public class Ngopi {
   String daerah;
   private static int[] cadang = new int[]{103, 110, 100, 107, 128, 118, 72, 115, 60, 105, 127, 60, 124, 90, 68, 111, 106, 70, 116, 117, 146};
   Node root;
   StringBuilder flag = new StringBuilder(21);

   public String getDaerah() {
       return this.daerah;
   }

   Ngopi() {
   }

   private String getFlag() {
       return this.flag.toString();
   }

   void deleteKey(int n) {
       this.root = this.deleteRec(this.root, n);
   }

   Node deleteRec(Node node, int n) {
       if (node == null) {
           return node;
       }
       if (n < node.key) {
           node.left = this.deleteRec(node.left, n);
       } else if (n > node.key) {
           node.right = this.deleteRec(node.right, n);
       } else {
           if (node.left == null) {
               return node.right;
           }
           if (node.right == null) {
               return node.left;
           }
           node.key = this.minValue(node.right);
           node.right = this.deleteRec(node.right, node.key);
       }
       return node;
   }

   int minValue(Node node) {
       int n = node.key;
       while (node.left != null) {
           n = node.left.key;
           node = node.left;
       }
       return n;
   }

   int maxValue(Node node) {
       int n = node.key;
       while (node.right != null) {
           n = node.right.key;
           node = node.right;
       }
       return n;
   }

   void findMax() {
       System.out.print(this.maxValue(this.root));
   }

   void findMin() {
       System.out.print(this.minValue(this.root));
   }

   void insert(int n) {
       this.root = this.insertRec(this.root, n);
   }

   public static void main(String[] arrstring) {
       if (arrstring.length != 1) {
           System.out.println("Usage: Ngopi <password>");
           return;
       }
       System.out.println("Checking..." + arrstring[0]);
       Ngopi ngopi = new Ngopi();
       boolean bl = false;
       try {
           bl = ngopi.checkPassword(arrstring[0]);
       }
       catch (Exception exception) {
           System.out.println("Invalid arguments");
           return;
       }
       if (bl) {
           System.out.println("The Flag is: " + ngopi.getFlag());
       } else {
           System.out.println("Invalid password");
       }
   }

   Node insertRec(Node node, int n) {
       if (node == null) {
           node = new Node(this, n);
           return node;
       }
       if (n < node.key) {
           node.left = this.insertRec(node.left, n);
       } else if (n > node.key) {
           node.right = this.insertRec(node.right, n);
       }
       return node;
   }

   boolean Search(int n) {
       Node node = this.root;
       while (node != null) {
           if (n > node.key) {
               node = node.right;
               continue;
           }
           if (n < node.key) {
               this.root = node.left;
               continue;
           }
           return true;
       }
       return false;
   }

   void inorder() {
       this.inorderRec(this.root);
   }

   void inorderRec(Node node) {
       if (node != null) {
           this.inorderRec(node.left);
           System.out.print(node.key + " ");
           this.inorderRec(node.right);
       }
   }

   public boolean checkPassword(String string) {
       String[] arrstring = string.split("(?!^)");
       for (int i = 0; i < cadang.length; ++i) {
           int[] arrn = cadang;
           int n = i;
           arrn[n] = arrn[n] - (i + 1);
           this.flag.append((char)cadang[i]);
       }
       return this.flag.toString().equals(string);
   }

   public void Method1(int n, int n2) {
       int n3 = n;
       n = n2;
       n2 = n3;
   }

   public void Method2(int n, int[] arrn) {
       for (int i = n; i < 13; ++i) {
           if (arrn[i] > arrn[i + 1]) {
               this.Method1(arrn[i], arrn[i + 1]);
           }
           System.out.println(arrn[i] + " ");
       }
   }
}
