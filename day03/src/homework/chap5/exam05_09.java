package homework;

public class exam05_09 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        char[][] a = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.random() < p) {
                    a[i][j] = '*';
                } else {
                    a[i][j] = '-';
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == '*') {
                    System.out.print("* ");
                } else {
                    int c = 0;
                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            int k = i + x;
                            int l = j + y;
                            if (k >= 0 && k < m && l >= 0 && l < n && a[k][l] == '*') {
                                c++;
                            }
                        }
                    }
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }
}
