public class exam02_06 {
    public static int[] reverse(int[] org) {
        int[] a = new int[org.length];
        
        for (int i = 0; i < org.length; i++) {
            a[i] = org[org.length - 1 - i];
        }
        
        return a;
    }

    public static void main(String[] args) {
        int[] b = {1, 2, 3, 4, 5};
        int[] c = reverse(b);
        
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
