package fundamentos;

public class DesafioOpAritmeticos {
    public static void main(String[] args) {
        
        //  ([6 * (3+2)]² _ ((1-5) * (2-7)²)³
        //  (------------   -------------- )
        //  (  3*2          (      2     ) )
        // ----------------------------------
        //              10³

        int a = 3+2;
        int b = 1-5;
        int c = 2-7;

        int d = a * 6;
        int e = (int) Math.pow(d, 2);
        int f = 3*2;
        int g = e / f;

        int h = b * c;
        int i = h / 2;
        int j = (int) Math.pow(i, 2);
        int k = g -(j);
        int l = (int) Math.pow(k, 3);

        int m = (int) Math.pow(10, 3);
        int n = l / m;

        System.out.println(n);
    }
    
}
