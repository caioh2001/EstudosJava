package fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        

        Byte a = 1;
        Short b = 100;
        Integer c = 10000;
        Long d = 100000L;

        System.out.println(a.byteValue());
        System.out.println(b.shortValue());
        System.out.println(c * 3);
        System.out.println(d / 3);

        Float f = 123.0F;
        System.out.println(f);

        Double y = 1234.4589;
        System.out.println(y);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character w = '#';
        System.out.println(w);
    }
}
